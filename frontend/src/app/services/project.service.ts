import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Project} from "../models/project";

@Injectable({providedIn: "root"})
export class ProjectService {

  constructor(private http: HttpClient) { }

  saveProject(project: Project): Observable<Project>{
    return this.http.post<Project>("/api/projects", project);
  }

  getProjects(): Observable<Project[]>{
    return this.http.get<Project[]>('/api/projects/');
  }

  findById(name:string): any{
    return this.http.get("/api/projects/project/" + name);
  }
}
