import {Item} from './item.model';

export class Article  extends Item {

  public preview: string;
  public dateCreation: Date;

  constructor(title: string, url: string, preview: string, location: string, dateCreation: Date) {
    super(title, url, location);
    this.preview = preview;
    this.dateCreation =  dateCreation;
  }
}
