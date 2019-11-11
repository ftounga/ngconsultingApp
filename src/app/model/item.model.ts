export class Item {

  public id: number;
  public title: string;
  public urlImg: string;
  public location: string;

  constructor(title: string, url: string, location: string, id: number) {
    this.title = title;
    this.urlImg = url;
    this.location = location;
    this.id = id;
  }
}
