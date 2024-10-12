import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UsersService } from '../../../../appServices/UsersServices/users.service';

@Component({
  selector: 'app-log-form',
  templateUrl: './log-form.component.html',
  styleUrl: './log-form.component.css'
})
export class LogFormComponent {

  logForm = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.email]),
    password: new FormControl('', [Validators.required])
  })

  constructor(private service: UsersService, private router: Router) { }



  onSubmit() {

    if (this.logForm.valid) {
      console.log('form send');
      console.log(`el valor es ${this.logForm.value}`);


    }
    else{
      console.log("inv form");
      
    }



  }

}
