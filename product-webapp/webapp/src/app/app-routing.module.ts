import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';

import { FeedbackDataComponent } from './feedback-data/feedback-data.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';

import { ServiceProviderRegistrationComponent } from './service-provider-registration/service-provider-registration.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';
import { HomeserviceComponent } from './homeservice/homeservice.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AboutusComponent } from './aboutus/aboutus.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'service-provider-registration', component: ServiceProviderRegistrationComponent },
  { path: 'user-registration', component: UserRegistrationComponent },

  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },

  { path: 'feedback', component: FeedbackComponent },
  { path: 'showfeedback', component: FeedbackDataComponent },
  { path: 'updateuser', component: UpdateuserComponent },
  { path: 'homeservice', component: HomeserviceComponent },
  { path: 'navbar', component: NavbarComponent },
  { path: 'aboutus', component: AboutusComponent },
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
