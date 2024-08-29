import { Component, inject } from '@angular/core';
import { Login } from '../../models/login.model';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { AuthService } from '../../services/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  login: Login = {
    email: "",
    password: ""
  };

  constructor(private authService: AuthService, private router: Router) { }

  onLogin(): void {
    this.authService.login(this.login).subscribe({
      next: (res: any) => {
        console.log(res);

        localStorage.setItem("token_angular", res.access_token)

        this.router.navigateByUrl('');
      },
      error: (error) => alert("Invalid data.")
    })
  }
}
