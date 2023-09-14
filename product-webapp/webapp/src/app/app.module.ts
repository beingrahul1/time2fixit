import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';
import { ServiceProviderRegistrationComponent } from './service-provider-registration/service-provider-registration.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './home/home.component';

import { LoginComponent } from './login/login.component';

import { FeedbackComponent } from './feedback/feedback.component';
import { FeedbackDataComponent } from './feedback-data/feedback-data.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';
import { HomeserviceComponent } from './homeservice/homeservice.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { FooterComponent } from './footer/footer.component';


@NgModule({
  declarations: [
    AppComponent,
    UserRegistrationComponent,
    ServiceProviderRegistrationComponent,

    HomeComponent,
    LoginComponent,

    HomeComponent,
    FeedbackComponent,
    FeedbackDataComponent,
    UpdateuserComponent,
    HomeserviceComponent,
    NavbarComponent,
    AboutusComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
