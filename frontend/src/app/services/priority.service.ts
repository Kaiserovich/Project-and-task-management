import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Priority} from "../models/priority";

@Injectable({
  providedIn: 'root'
})
export class PriorityService {

  constructor(private http: HttpClient) { }

  getPriority(): Observable<Priority[]>{
    return this.http.get<Priority[]>("/api/priority");
  }
  findById(id:string): any{
    return this.http.get("/api/priority/priority/" + id);
  }
  findByName(name:string): any{
    return this.http.get("/api/priority/name/" + name);
  }
}
