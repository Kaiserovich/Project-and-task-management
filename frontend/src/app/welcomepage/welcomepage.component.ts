import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {UserService} from "../services/user.service";

@Component({
  selector: 'app-welcomepage',
  templateUrl: './welcomepage.component.html',
  styleUrls: ['./welcomepage.component.css']
})
export class WelcomepageComponent implements OnInit {

  constructor(private userService: UserService) { }

  ngOnInit() {

  }
  @Output() onChanged = new EventEmitter<boolean>();

  public LoginClick():void{
    this.onChanged.emit(false);
  }

}
