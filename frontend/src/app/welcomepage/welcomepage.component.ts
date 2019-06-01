import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {UserService} from "../services/user.service";
import {User} from "../models/user";


@Component({
  selector: 'app-welcomepage',
  templateUrl: './welcomepage.component.html',
  styleUrls: ['./welcomepage.component.css']
})
export class WelcomepageComponent implements OnInit {

  constructor(
    private userService: UserService
  ) { }

  public submitSuccessful: boolean = false;
  user: User = new User();
  public  log:string;
  public pas:string;

  ngOnInit() {

  }
  @Output() onChanged = new EventEmitter();


  public onSubmit(log): void{
    if(log != undefined) this.userService.findByLogin(log).subscribe((user)=>{
      if(user.password == this.pas) {
        this.submitSuccessful = true;
        this.onChanged.emit(user.login);
        //console.log(this.onChanged);
      }
      if(!this.submitSuccessful){
        this.log = "Wrong";
      }
    });
  }
}

