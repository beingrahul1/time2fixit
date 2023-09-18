import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FeedbackDataComponent } from './feedback-data/feedback-data.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';
import { ProviderUpdateComponent } from './provider-update/provider-update.component';
import { OrderTrackingServiceComponent } from './order-tracking-service/order-tracking-service.component';
import { ServiceCenterProfileComponent } from './service-center-profile/service-center-profile.component';
import { ServiceProviderRegistrationComponent } from './service-provider-registration/service-provider-registration.component';
import { UpdateOrderTrackingComponent } from './update-order-tracking/update-order-tracking.component';

import { UserRegistrationComponent } from './user-registration/user-registration.component';
import { HomeserviceComponent } from './homeservice/homeservice.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { UserTrackerComponent } from './user-tracker/user-tracker.component';
import { ServicelistComponent } from './servicelist/servicelist.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'service-provider-registration', component: ServiceProviderRegistrationComponent },
  { path: 'user-registration', component: UserRegistrationComponent },
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
{ path: 'provider-update', component: ProviderUpdateComponent },
  { path: 'feedback', component: FeedbackComponent },
  { path: 'showfeedback', component: FeedbackDataComponent },
  { path: 'updateuser', component: UpdateuserComponent },
   { path: 'search', component: ServicelistComponent },
  { path: 'homeservice', component: HomeserviceComponent },
  { path: 'navbar', component: NavbarComponent },
  { path: 'aboutus', component: AboutusComponent },
  

  { path: 'user-tracker', component: UserTrackerComponent},


  { path: 'feedback', component: FeedbackComponent },
  { path: 'showfeedback', component: FeedbackDataComponent },

  { path: 'serviceprofile', component:ServiceCenterProfileComponent },
  { path: 'ordertracking', component:OrderTrackingServiceComponent },
  { path: 'updatetrack', component:UpdateOrderTrackingComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes,{useHash:true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
