import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../model/user.model';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styles: []
})
export class UserComponent implements OnInit {

  users: User[];

  constructor(private router: Router, private userService: UserService) {

  }

  ngOnInit() {
    this.userService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.userService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
        alert('UserModel deleted successfully.');
      });
  }
  update(user: User): void {
    this.userService.updateUser(user)
      .subscribe( data => {
        alert('UserModel updated successfully.');
      });
  }
}
