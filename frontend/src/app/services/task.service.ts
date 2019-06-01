import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Task} from "../models/task";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  constructor(private http: HttpClient) { }

  saveNewTask(task: Task): Observable<Task>{
    return this.http.post<Task>("/api/task", task);
  }

  getAllTask(): Observable<Task[]>{
    return this.http.get<Task[]>("/api/task/");
  }
  updateTask(task: Task): Observable<Task> {
    return this.http.patch<Task>('api/task', task);
  }
}
