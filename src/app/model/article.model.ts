export class Article {

  public title: string;
  public urlImg: string;
  public preview: string;
  public location: string;
  public dateCreation: Date;

  constructor(title: string, url: string, preview: string, location: string, dateCreation: Date) {
    this.title = title;
    this.urlImg = url;
    this.preview = preview;
    this.location = location;
    this.dateCreation =  dateCreation;
  }
}
