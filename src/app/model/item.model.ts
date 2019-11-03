export class Item {
  public title: string;
  public urlImg: string;
  public location: string;

  constructor(title: string, url: string, location: string) {
    this.title = title;
    this.urlImg = url;
    this.location = location;
  }
}
