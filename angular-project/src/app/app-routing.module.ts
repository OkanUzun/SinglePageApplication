import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { UserComponent } from './component/user.component';
import {AddUserComponent} from './component/add-user.component';

const routes: Routes = [
  { path: 'users', component: UserComponent },
  { path: 'add', component: AddUserComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }
