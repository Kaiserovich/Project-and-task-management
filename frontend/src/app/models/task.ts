import {Status} from "./status";
import {User} from "./user";
import {Prioritet} from "./prioritet";
import {Project} from "./project";

export class Task {
  idTask:number;
  description:string;
  estimation:string;
  personalData:string;
  createDate:string;
  dueDate:string;
  updatedDate:string;
  resolvedDate:string;
  closedDate:string;
  idProject:Project ;
  idPriority:Prioritet;
  idStatus:Status;
  assignee:User;
  reporter:User;
}




