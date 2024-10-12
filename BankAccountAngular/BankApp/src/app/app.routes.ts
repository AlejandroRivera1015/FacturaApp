import { Routes } from '@angular/router';

export const routes: Routes = [{
    path: 'login',
    loadChildren: ()=>import('./modules/log-in/log-in.module').then(mod =>mod.LogInModule)
},
{
    path: 'facturas',
    loadChildren: ()=>import('./modules/facturas/facturas.module').then(mod => mod.FacturasModule)
}];
