import {Item} from './item.model';
import {TutorielType} from './type.enum';

export class Tutoriel  extends Item {

  public type: TutorielType;
  public available: Boolean;

  constructor(id: number, title: string, url: string,  location: string, type: TutorielType) {
    super(title, url, location, id);
    this.type = type;
  }
}
