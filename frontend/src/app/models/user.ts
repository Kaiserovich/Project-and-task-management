import {Role} from "./role";

export class User {
    idUsers:number;
    login:string;
    password:string;
    personalData:string;
    idRole:Role;

    static  clone (user: User): User {
      const  cloneUser: User = new User();
      cloneUser.idUsers = user.idUsers;
      cloneUser.login = user.login;
      cloneUser.password = user.password;
      cloneUser.personalData = user.personalData;
      cloneUser.idRole = user.idRole;
      return cloneUser;
    }
}
