import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Login } from '../login.model';
import { LoginService } from '../login.service';
import { user } from '../user-registration/user.model';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {


  email = '';
  password = '';
  loginError: string = '';
  onEmailInput(event: Event): void {
    // Handle user input and update the email property
    this.email = (event.target as HTMLInputElement).value;
  }

  constructor(private authService: LoginService  ,  private router: Router) {}
  ngOnInit(): void {
    //throw new Error('Method not implemented.');
  }

  onLogin() {
    let authRequest={email:this.email,password:this.password}
    this.authService.login(authRequest).subscribe(
      user => {
        console.log(this.email,this.password , user);
        if (user) {
          // Successfully logged in
          console.log('Login successful:', user);
          this.authService.setIsAuthenticated();
         this.router.navigate(['/home'], { queryParams: { email: this.email } });
          //this.router.navigate(['/home']);
          alert('Login successful');
          
        } else {
          // Invalid email or password
          console.log('Invalid email or password',user);
          alert('Invalid email or password');
        }
      },
      error => {
        console.error('Error:', error);
      }
      // this.authService.authUser(this.email, this.password).subscribe(
      //   (data: any) => {
      //     console.log(data)
      //     if (data && data.token) { // Check for 'token' property
      //       // this.authService.storeToken(data.token);
      //       console.log("Login Successful");
      //       this.openSnackBar("Login Successful");
      //       // this.authService.setUserEmail(this.user.email);
      //       // this.authService.getUserByEmail(this.user.email).subscribe(
      //       //   (data:any) => {
      //       //     this.getUserDetails=data;
      //       //     this.authService.setUserRole(this.getUserDetails.role);
      //       //     this.authService.setUserId(this.getUserDetails.userId);
      //       //   },
      //       //   // (error: any) => {
      //       //   //   console.error('Error fetching user: ', error);
      //       //   // }
      //       // );
    
      //       this.authService.setIsAuthenticated();
      //       this.router.navigate(['/home'], { queryParams: { email: this.email } });
      //     } else {
      //       console.error('Login response structure is incorrect:', data);
      //       this.loginError = "Login failed. Please check your credentials !!";
      //       this.openSnackBar(this.loginError);
      //     }
      //   },
      //   (error: any) => {
      //     this.loginError = "Login failed. Unexpected response from the server.";
      //   }
      // );
    
     );
  }

  
  // private openSnackBar(message: string) {
  //   this.snackBar.open(message, 'Close', {
  //     duration: 3000
  //   });
  // }

}
  
  