import {Component, EventEmitter, Output, OnInit} from '@angular/core';
import {Task} from '../models/task';
import {TaskService} from '../services/task.service';
import {Subscription} from "rxjs";

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  public isCreateUserVisible: boolean = false;
  public isCreateProjectVisible: boolean = false;
  public isCreateTaskVisible: boolean = false;
  tasks:Task[];


  private subscriptions: Subscription[] = [];

  constructor(private taskService:TaskService) {
  }

  ngOnInit() {
    this.loadAllTasks()
  }
  @Output() onHomepage = new EventEmitter<boolean>();

  private loadAllTasks(): void{
    this.subscriptions.push(this.taskService.getAllTask().subscribe( tasks=>{
      this.tasks = tasks as Task[];
    }))
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
    this.onHomepage.emit(false);



  }
}

