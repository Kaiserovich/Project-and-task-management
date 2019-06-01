import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Project} from "../../models/project";
import {ProjectService} from "../../services/project.service";
import {User} from "../../models/user";
import {Role} from "../../models/role";
import {Subscription} from "rxjs";
import {UserService} from "../../services/user.service";

@Component({
  selector: 'app-create-project',
  templateUrl: './create-project.component.html',
  styleUrls: ['./create-project.component.css']
})
export class CreateProjectComponent implements OnInit {

  project: Project = new Project();
  public allUsers:User[];


  private subscriptions: Subscription[] = [];
  constructor(private projectService: ProjectService,
              private userService:UserService) { }

  ngOnInit() {
    this.loadUsers();

  }
  @Output() onCreateProject = new EventEmitter<boolean>();
  @Input() userId: string;
 /* public onCreateProjectClick():void {
    this.onCreateProject.emit(false);
  }*/
  private loadUsers() : void{
    this.subscriptions.push(this.userService.getAllUsers().subscribe( user=>{
      this.allUsers = user as User[];
      console.log(this.allUsers[1]);

    }));}

  private onCreateProjectClick(){
    this.subscriptions.push(this.userService.findByLogin(this.userId).subscribe( user=>{
      this.project.reporter = user;
      this.projectService.saveProject(this.project).subscribe(()=>{
        this.project = new Project();
      });
    }));
  this.onCreateProject.emit(false);
  }
}
