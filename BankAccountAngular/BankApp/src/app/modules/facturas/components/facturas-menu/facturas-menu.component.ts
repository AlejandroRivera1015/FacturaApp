import { Component, OnInit } from '@angular/core';
import { CredentialsService } from '../../../../appServices/logInServices/login.service';
import { UsersService } from '../../../../appServices/UsersServices/users.service';

@Component({
  selector: 'app-facturas-menu',

  templateUrl: './facturas-menu.component.html',
  styleUrl: './facturas-menu.component.css'
})
export class FacturasMenuComponent implements OnInit {


  constructor(public user: UsersService) {
  }

  ngOnInit(): void {}






}
