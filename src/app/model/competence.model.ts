export class Competence {
  public id: number;
  public idUser: number;
  public skill: string;
  public value: number;
  public type: string;
  public progress: number;

  constructor(skill: string, type: string, value: number){
    this.skill = skill;
    this.type = type;
    this.value = value;
  }

}
