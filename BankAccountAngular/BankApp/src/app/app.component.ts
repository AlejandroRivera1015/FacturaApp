import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { LogInModule } from "./modules/log-in/log-in.module";
import { FacturasModule } from './modules/facturas/facturas.module';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, LogInModule,FacturasModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'BankApp';
  
}
