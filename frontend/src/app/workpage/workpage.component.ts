import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-workpage',
  templateUrl: './workpage.component.html',
  styleUrls: ['./workpage.component.css']
})
export class WorkpageComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  @Output() onWorkpage = new EventEmitter<boolean>();
  public BackClick():void {
    this.onWorkpage.emit(false);
  }

  }
