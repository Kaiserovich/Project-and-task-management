export class Priority {

  idPriority:number;
  name:string;

  static  clone (prioritet: Priority): Priority {
    const  clonePrioritet: Priority = new Priority();
    clonePrioritet.idPriority = prioritet.idPriority;
    clonePrioritet.name = prioritet.name;
    return clonePrioritet;
  }

  public getPriority() :string{
    return this.name;
  }
}

