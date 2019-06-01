import {Status} from "./status";
import {User} from "./user";
import {Priority} from "./priority";
import {Project} from "./project";

export class Task {
  idTask:number;
  description:string;
  estimation:string;
  personalData:string;
  createDate:Date;
  dueDate:Date;
  updatedDate:Date;
  resolvedDate:Date;
  closedDate:Date;
  idProject:Project ;
  idPriority:Priority;
  idStatus:Status;
  assignee:User;
  reporter:User;
}




