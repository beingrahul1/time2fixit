import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ServiceProviderRegistrationComponent } from './service-provider-registration/service-provider-registration.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';

const routes: Routes = [
  { path: '', component: UserRegistrationComponent },
  { path: 'service-provider-registration', component: ServiceProviderRegistrationComponent },
  { path: 'user-registration', component: UserRegistrationComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
