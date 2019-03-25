import {Component, EventEmitter, Output, OnInit} from '@angular/core';
import {log} from "util";

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  public isCreateUserVisible: boolean = false;
  public isCreateProjectVisible: boolean = false;
  public isCreateTaskVisible: boolean = false;
  public isOverlayVisible: boolean = false;




  constructor() {
  }

  ngOnInit() {
  }

  public UserVisible(): void {
    this.isCreateUserVisible = !this.isCreateUserVisible;
    this.isOverlayVisible = !this.isOverlayVisible;
  }

  public TaskVisible(): void {
    this.isCreateTaskVisible = !this.isCreateTaskVisible;
  }

  public ProjectVisible(): void {
    this.isCreateProjectVisible = !this.isCreateProjectVisible;
  }

}

