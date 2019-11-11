export class Experience {
  public id: number;
  public idUser: number;
  public poste: string;
  public entreprise: string;
  public description: string;
  public dateDebut: Date;
  public formattedDate: string;

  constructor(poste: string, entreprise: string, description: string, dateDebut: Date, formattedDate: string) {
    this.poste = poste;
    this.entreprise = entreprise;
    this.description = description;
    this.dateDebut = dateDebut;
    this.formattedDate =  formattedDate;

  }

}
