export class User{
  id: number;
  name: string;
  email: string;
  age: number;
  picture: string;
  dateCreation: Date;
  dateConnexion: Date;


  constructor(id: number, name: string, email: string, age: number, picture: string, dateCreation: Date, dateConnexion: Date) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.age = age;
    this.picture = picture;
    this.dateCreation = dateCreation;
    this.dateConnexion = dateConnexion;
  }
}
