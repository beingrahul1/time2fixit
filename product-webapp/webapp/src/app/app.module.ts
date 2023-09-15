import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';
import { ServiceProviderRegistrationComponent } from './service-provider-registration/service-provider-registration.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './home/home.component';
import { ReactiveFormsModule } from '@angular/forms';

import { LoginComponent } from './login/login.component';
import { ProviderUpdateComponent } from './provider-update/provider-update.component';

import { FeedbackComponent } from './feedback/feedback.component';
import { FeedbackDataComponent } from './feedback-data/feedback-data.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';
<<<<<<< HEAD
import { HomeserviceComponent } from './homeservice/homeservice.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { FooterComponent } from './footer/footer.component';
=======
import { UserTrackerComponent } from './user-tracker/user-tracker.component';
>>>>>>> 8ef51d0 (Tracking)


@NgModule({
  declarations: [
    AppComponent,
    UserRegistrationComponent,
    ServiceProviderRegistrationComponent,

    HomeComponent,
    LoginComponent,
ProviderUpdateComponent,
    HomeComponent,
    FeedbackComponent,
    FeedbackDataComponent,
    UpdateuserComponent,
<<<<<<< HEAD
    HomeserviceComponent,
    NavbarComponent,
    AboutusComponent,
    FooterComponent
=======
    UserTrackerComponent
>>>>>>> 8ef51d0 (Tracking)
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
