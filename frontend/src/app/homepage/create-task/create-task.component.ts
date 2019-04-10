import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-create-task',
  templateUrl: './create-task.component.html',
  styleUrls: ['./create-task.component.css']
})
export class CreateTaskComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  @Output() onCreateTask = new EventEmitter<boolean>();

  public onCreateTaskClick():void {
    this.onCreateTask.emit(false);
  }
}
