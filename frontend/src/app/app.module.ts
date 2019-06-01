import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from "@angular/common/http";
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { WelcomepageComponent } from './welcomepage/welcomepage.component';
import { HomepageComponent } from './homepage/homepage.component';
import { CreateProjectComponent } from './homepage/create-project/create-project.component';
import { CreateTaskComponent } from './homepage/create-task/create-task.component';
import { CreateUserComponent } from './homepage/create-user/create-user.component';
import { WorkpageComponent } from './workpage/workpage.component';
import { OverlayComponent } from './overlay/overlay.component';
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    WelcomepageComponent,
    HomepageComponent,
    CreateProjectComponent,
    CreateTaskComponent,
    CreateUserComponent,
    WorkpageComponent,
    OverlayComponent,

  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
