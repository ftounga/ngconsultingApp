export class Article {

  public title: string;
  public url: string;
  public preview: string;
  public dateCreation: Date;

  constructor(title: string, url: string, preview: string, dateCreation: Date) {
    this.title = title;
    this.url = url;
    this.preview = preview;
    this.dateCreation =  dateCreation;
  }
}
