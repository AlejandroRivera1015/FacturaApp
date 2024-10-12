import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { FacturasMenuComponent } from './components/facturas-menu/facturas-menu.component';
import { Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { UsersService } from '../../appServices/UsersServices/users.service';

const routes: Routes = [
  { path: '', component: FacturasMenuComponent }
];


@NgModule({
  declarations: [FacturasMenuComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    HttpClientModule
  ],
  providers:[UsersService],
  
})
export class FacturasModule { }
