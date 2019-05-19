export class Prioritet {

  idPriority:number;
  name:string;

  static  clone (prioritet: Prioritet): Prioritet {
    const  clonePrioritet: Prioritet = new Prioritet();
    clonePrioritet.idPriority = prioritet.idPriority;
    clonePrioritet.name = prioritet.name;
    return clonePrioritet;
  }

  public getPrioritet() :string{
    return this.name;
  }
}

