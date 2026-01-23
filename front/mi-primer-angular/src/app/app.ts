import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

import { UserService } from './services/user.service/user.service';
import { JsonPipe } from '@angular/common';
//libreria para detectar los cambios 
import { ChangeDetectorRef } from '@angular/core';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, JsonPipe],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('mi-primer-angular');

  //para almacenar los usuarios
  users: any[]=[];

  constructor(private userSer:UserService, private chp: ChangeDetectorRef){
    this.userSer.getUsers().subscribe(data=> {
      this.users = data;
      console.log(this.users);
      this.detectChange();
    })
  }

  detectChange(){
    this.chp.detectChanges();
  }
}
