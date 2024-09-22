import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';
import { ServiceProviderRegistrationComponent } from './service-provider-registration/service-provider-registration.component';
// import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './home/home.component';


import { LoginComponent } from './login/login.component';
import { ProviderUpdateComponent } from './provider-update/provider-update.component';

import { FeedbackComponent } from './feedback/feedback.component';
import { FeedbackDataComponent } from './feedback-data/feedback-data.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';

import { HomeserviceComponent } from './homeservice/homeservice.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { FooterComponent } from './footer/footer.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { UserTrackerComponent } from './user-tracker/user-tracker.component';
import { ServiceCenterProfileComponent } from './service-center-profile/service-center-profile.component';
import { OrderTrackingServiceComponent } from './order-tracking-service/order-tracking-service.component';
import { UpdateOrderTrackingComponent } from './update-order-tracking/update-order-tracking.component';
import { ServicelistComponent } from './servicelist/servicelist.component';


import { BookingFormComponent } from './booking-form/booking-form.component';
import { AppointmentComponent } from './appointment/appointment.component';
import { ReactiveFormsModule} from '@angular/forms';
import { GadgetDetailsComponent } from './gadget-details/gadget-details.component';
import { DashboardComponent } from './dashboard/dashboard.component';
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

    HomeserviceComponent,
    NavbarComponent,
    AboutusComponent,
    FooterComponent,
    ForgotPasswordComponent,
    UserTrackerComponent,
    FeedbackComponent,
    FeedbackDataComponent,
    ServiceCenterProfileComponent,
    OrderTrackingServiceComponent,
    UpdateOrderTrackingComponent,
    ServicelistComponent

    // BookingFormComponent,
    // AppointmentComponent,
    // GadgetDetailsComponent,


    // DashboardComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    // FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
