import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-overlay',
  templateUrl: './overlay.component.html',
  styleUrls: ['./overlay.component.css']
})
export class OverlayComponent implements OnInit {

  @Input() isVisible: boolean = false;

  @Output() onChanged = new EventEmitter<boolean>();

  constructor() { }

  ngOnInit() {
  }

  public onOverlayClick():void {
    this.isVisible = false;

    this.onChanged.emit(false);
  }
}
