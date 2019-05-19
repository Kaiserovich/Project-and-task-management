import {User} from "./user";

export class Project {

  idProject:number;
  summary:string;
  reporter:User;

  static  clone (project: Project): Project {
    const  cloneProject: Project = new Project();
    cloneProject.idProject = project.idProject;
    cloneProject.summary = project.summary;
    cloneProject.reporter = project.reporter;
    return cloneProject;
  }
}






