import { Injectable } from '@angular/core';
//importar HttpClient
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class UserService {

  constructor(private http:HttpClient){}

  //funcion para traer el listado de usuarios
  getUsers(){
    /**return this.http.get<any[]>('https://jsonplaceholder.typicode.com/users'); */
    return this.http.get<any[]>('users.json');
  }
}
