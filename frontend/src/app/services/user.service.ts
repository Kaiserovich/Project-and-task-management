import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {User} from "../models/user";
import {Observable} from "rxjs";


@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }


  getAllUsers(): Observable<User[]>{
    return this.http.get<User[]>("/api/user/");
  }

  findByLogin(login:string): any{
    return this.http.get("/api/user/login/" + login);
  }

  saveUser(user: User): Observable<User>{
    return this.http.post<User>("/api/user", user);
  }

}
