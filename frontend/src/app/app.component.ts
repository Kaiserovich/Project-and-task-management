import {Component, NgModule} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {BrowserModule} from "@angular/platform-browser";
import {FormsModule} from "@angular/forms";

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

  constructor(private http: HttpClient){

  }

  public isWelcomePageVisible: boolean = true;
  public isHomePageVisible: boolean = false;
  public isWorkPageVisible: boolean = false;

  public closeWelcomePageAndOpenHomePage():void{
    this.isHomePageVisible = true;
    this.isWelcomePageVisible = ! this.isWelcomePageVisible;
  }

  public HomePageVisible(): void {
    this.isHomePageVisible = ! this.isHomePageVisible;
    this.isWorkPageVisible = ! this.isWorkPageVisible;
  }

  public WorkPageVisible(): void {
    this.isHomePageVisible = ! this.isHomePageVisible;
    this.isWorkPageVisible = ! this.isWorkPageVisible;
  }



  public clickFunction():void{
    this.http.get( "/api/").subscribe( value => {
      console.log(value);
    })
  }
}
