export class Role{
   idRole:string;
   name: string;

   constructor(){

   }

   static clone (role:Role): Role{
     if (role == null){
       const cloneRole: Role = new Role();
       cloneRole.idRole = role.idRole;
       cloneRole.name = role.name;
       return cloneRole;
     }
   }

  public getRole() :string{
    return this.name;
  }
}
