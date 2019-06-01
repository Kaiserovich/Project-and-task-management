import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Task} from "../../models/task";
import {User} from "../../models/user";
import {Status} from "../../models/status";
import {Project} from "../../models/project";
import {Priority} from "../../models/priority";
import {Subscription} from "rxjs";
import {UserService} from "../../services/user.service";
import {TaskService} from "../../services/task.service";
import {PriorityService} from "../../services/priority.service";
import {ProjectService} from "../../services/project.service";
import {StatusService} from "../../services/status.service";

@Component({
  selector: 'app-create-task',
  templateUrl: './create-task.component.html',
  styleUrls: ['./create-task.component.css']
})
export class CreateTaskComponent implements OnInit {
  allStatus: Status[];

  allProjects: Project[];
  allPriority: Priority[];
  allUsers: User[];
  task: Task = new Task();
  private subscriptions: Subscription[] = [];
  @Input() userId: string;
  public assigneeLogin:string;
  public projectId:string;
  public priorityName:string[]= ["high", "normal", "low"];
  public prioritySelect:string;

  constructor(
              private userService: UserService,
              private statusService:StatusService,
              private taskService: TaskService,
              private priorityService: PriorityService,
              private projectService: ProjectService
              ) { }

  private loadPriority() : void{
    this.subscriptions.push(this.priorityService.getPriority().subscribe(priority=>{
      this.allPriority = priority as Priority[];
    }));
  }
  private loadStatus() : void{
    this.subscriptions.push(this.statusService.getStatus().subscribe(status=>{
      this.allStatus = status as Status[];
    }));
  }

  private loadProjects() : void{
    this.subscriptions.push(this.projectService.getProjects().subscribe( project=>{
      this.allProjects = project as Project[];
    }))
  }

  private loadUsers() : void{
    this.subscriptions.push(this.userService.getAllUsers().subscribe( user=>{
      this.allUsers = user as User[];
    }));
  }

  ngOnInit() {
    this.loadUsers();
    this.loadProjects();
    this.loadPriority();
    this.loadStatus();
  }
  @Output() onCreateTask = new EventEmitter<boolean>();

  public onCreateTaskClick() {

    this.task.idStatus = this.allStatus[1];
    this.task.createDate = new Date();
    this.task.updatedDate = new Date();
    this.subscriptions.push(this.priorityService.findByName(this.prioritySelect).subscribe( priority=> {
      this.task.idPriority = priority;
      this.subscriptions.push(this.projectService.findById(this.projectId).subscribe(project => {
        this.task.idProject = project;
        this.subscriptions.push(this.userService.findByLogin(this.assigneeLogin).subscribe(user => {
          this.task.assignee = user;
          this.subscriptions.push(this.userService.findByLogin(this.userId).subscribe(user => {
            this.task.reporter = user;
            this.subscriptions.push(this.taskService.saveNewTask(this.task).subscribe(() => {
              this.task = new Task();
            }))
          }))
        }))
      }))
    }))
    this.onCreateTask.emit(false);
  }
}
