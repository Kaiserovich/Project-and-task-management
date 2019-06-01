import {Component, EventEmitter, Output, OnInit, Input} from '@angular/core';
import {Task} from '../models/task';
import {TaskService} from '../services/task.service';
import {Subscription} from "rxjs";
import {Project} from "../models/project";
import {UserService} from "../services/user.service";

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  public isCreateUserVisible: boolean = false;
  public isCreateProjectVisible: boolean = false;
  public isCreateTaskVisible: boolean = false;
  public tasks:Task[];
  public warn:String;


  private subscriptions: Subscription[] = [];

  constructor(private taskService:TaskService,
              private  userService:UserService) {
  }

  ngOnInit() {
    this.loadAllTasks();
      this.getUser();
  }
  @Output() onHomepage = new EventEmitter();
  @Input() userId: string;
  private loadAllTasks(): void{
    this.subscriptions.push(this.taskService.getAllTask().subscribe( tasks=>{
      this.tasks = tasks as Task[];
    }))
  }

  private getUser(){
    this.subscriptions.push(this.userService.findByLogin(this.userId).subscribe( user=>{
      this.warn = user.idRole.name;
      }));
  }

  public UserVisible(): void {
    this.isCreateUserVisible = !this.isCreateUserVisible;
  }

  public TaskVisible(): void {
    this.isCreateTaskVisible = !this.isCreateTaskVisible;
  }

  public ProjectVisible(): void {
    this.isCreateProjectVisible = !this.isCreateProjectVisible;
  }

  public onChanged(event): void {
    this.isCreateUserVisible = false;
    this.isCreateTaskVisible = false;
    this.isCreateProjectVisible = false;
  }

  public EditClick(task):void {

    if(this.userId == task.assignee.login){
      this.onHomepage.emit(task);
      this.warn = "";
    }
    else {
      this.warn = "У вас нет прав";
    }
  }
}

