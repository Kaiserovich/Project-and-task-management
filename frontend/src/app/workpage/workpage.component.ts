import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Task} from "../models/task";
import {TaskService} from "../services/task.service";
import {StatusService} from "../services/status.service";
import {take} from "rxjs/operators";

@Component({
  selector: 'app-workpage',
  templateUrl: './workpage.component.html',
  styleUrls: ['./workpage.component.css']
})
export class WorkpageComponent implements OnInit {

  constructor(private taskService: TaskService,
              private  statusService: StatusService) { }

  ngOnInit() {
  }
  @Output() onWorkpage = new EventEmitter<boolean>();
  @Input() task: Task;

  public BackClick():void {
    this.onWorkpage.emit(false);
    console.log(this.task);
  }

  private updateTaskStatus(status: string) {
    this.statusService.findByName(status).pipe(take(1)).subscribe((stat) => {
      this.task.idStatus = stat;
      this.task.updatedDate = new Date();
      if (status == "resolved") {
        this.task.resolvedDate = new Date();
      } else if (status == "closed") {
        this.task.closedDate = new Date();
      }

      this.taskService.updateTask(this.task).subscribe(
        task => {
          this.task = task;
        },
      );
    });
  }

  private updateTask() {
    this.task.updatedDate = new Date();
    this.taskService.updateTask(this.task).subscribe(
      task => {
        this.task = task;
      },
    );
  }

  }
