import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-welcomepage',
  templateUrl: './welcomepage.component.html',
  styleUrls: ['./welcomepage.component.css']
})
export class WelcomepageComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  @Output() onChanged = new EventEmitter<boolean>();

  public LoginClick():void{
    this.onChanged.emit(false);
  }

}
