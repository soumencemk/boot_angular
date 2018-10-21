import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from './models/user.model';
@Injectable({
  providedIn: 'root'
})
@Injectable()
export class UserService {

  constructor(private http:HttpClient) { }
  private userUrl = 'http://localhost:8080/user-portal/api';
  //private userUrl = '/api';


  public getUsers() {
    return this.http.get<User[]>(this.userUrl);
  }

  public createUser(user) {
    return this.http.post<User>(this.userUrl, user);
  }
}
