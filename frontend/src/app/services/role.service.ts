import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Role} from "../models/role";

@Injectable({providedIn: "root"})
export class RoleService {

  constructor(private http: HttpClient) { }

  getRoles(): Observable<Role[]>{
    return this.http.get<Role[]>('/api/role');
  }

  findById(id:string): any{
    return this.http.get("/api/role/role/" + id);
  }

  findByName(name:string): any{
    return this.http.get("/api/role/name/" + name);
  }
}
