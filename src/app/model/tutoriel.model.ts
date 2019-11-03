import {Item} from './item.model';
import {TutorielType} from './type.enum';

export class Tutoriel  extends Item {

  public type: TutorielType;

  constructor(title: string, url: string,  location: string, type: TutorielType) {
    super(title, url, location);
    this.type = type;
  }
}
