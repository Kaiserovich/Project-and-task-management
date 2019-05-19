import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {User} from "../../models/user";

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

  public login:string;
  public password:string;
  public personalData:string;
  public role:string;


  public onCreateUserClick(login:string, password:string, personalData:string, ):void{
    console.log(login);
    console.log(password);
    console.log(personalData);

  }
}
