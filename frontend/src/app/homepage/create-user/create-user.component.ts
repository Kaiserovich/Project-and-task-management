import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-create-user',
  templateUrl: './create-user.component.html',
  styleUrls: ['./create-user.component.css']
})
export class CreateUserComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  @Output() onCreateUser = new EventEmitter<boolean>();

  public onCreateUserClick():void {
    this.onCreateUser.emit(false);
  }
}
