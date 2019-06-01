import {Component, Input, NgModule} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {BrowserModule} from "@angular/platform-browser";
import {FormsModule} from "@angular/forms";
import {User} from "./models/user";
import {Task} from "./models/task";

// @ts-ignore
@NgModule({
  imports:      [ BrowserModule, FormsModule],
  declarations: [ AppComponent],
  bootstrap:    [ AppComponent ]
})

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend';
  public userId: string;
  public task: Task;
  constructor(private http: HttpClient){

  }
public user:User= new User();
  public isWelcomePageVisible: boolean = true;
  public isHomePageVisible: boolean = false;
  public isWorkPageVisible: boolean = false;

  public closeWelcomePageAndOpenHomePage(id):void{
    this.isHomePageVisible = true;
    this.isWelcomePageVisible = ! this.isWelcomePageVisible;
    this.userId = id;


  }

  public HomePageVisible(task): void {
    this.isHomePageVisible = ! this.isHomePageVisible;
    this.isWorkPageVisible = ! this.isWorkPageVisible;
    this.task = task;
  }

  public WorkPageVisible(): void {
    this.isHomePageVisible = ! this.isHomePageVisible;
    this.isWorkPageVisible = ! this.isWorkPageVisible;
  }

}
