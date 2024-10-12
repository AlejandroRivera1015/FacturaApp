import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LogFormComponent } from './components/log-form/log-form.component';
import { RouterModule, Routes } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';



const routes: Routes = [
  { path: '', component: LogFormComponent }
];


@NgModule({
  declarations: [LogFormComponent],
  imports: [
    
    CommonModule,   
     RouterModule.forChild(routes),
     ReactiveFormsModule,
     HttpClientModule
  ],
  providers: [],
  exports: [LogFormComponent],   


})
export class LogInModule { }
