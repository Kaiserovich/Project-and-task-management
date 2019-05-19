export class Status {

  idStatus:number;
  name:string;

  static  clone (status: Status): Status {
    const  cloneStatus: Status = new Status();
    cloneStatus.idStatus = status.idStatus;
    cloneStatus.name = status.name;
    return cloneStatus;
  }

  public getPrioritet() :string{
    return this.name;
  }
}

