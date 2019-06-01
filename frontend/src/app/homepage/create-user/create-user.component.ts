import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {User} from "../../models/user";
import {UserService} from "../../services/user.service";
import {Role} from "../../models/role";
import {RoleService} from "../../services/role.service";
import {Subscription} from "rxjs";

@Component({
  selector: 'app-create-user',
  templateUrl: './create-user.component.html',
  styleUrls: ['./create-user.component.css']
})
export class CreateUserComponent implements OnInit {

  public user: User = new User();
  public roles:Role[];
  public rolesName: string[] = ["Project Manager", "Developer","Tester"];
  public fRole:string;
  public roleCount:number =0;


  private subscriptions: Subscription[] = [];

  constructor( private userService: UserService,
               private  roleServide: RoleService,
               ) { }

  ngOnInit() {
    this.loadUserRole();
  }
  @Output() onCreateUser = new EventEmitter<boolean>();


  private loadUserRole(): void {
    this.subscriptions.push(this.roleServide.getRoles().subscribe(role => {
      this.roles = role as Role[];
    }));

  }

  private onCreateUserClick(){
    console.log(this.fRole);
    this.subscriptions.push(this.roleServide.findByName(this.fRole).subscribe(role => {
      this.user.idRole = role;
      console.log(role);
      this.subscriptions.push(this.userService.saveUser(this.user).subscribe(() => {
        this.user = new User();
      }));
    }));
    this.onCreateUser.emit(false);

  }
}
