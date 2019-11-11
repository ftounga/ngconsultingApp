import {Item} from './item.model';
import {ChapterVideo} from './chapterVideo.model';

export class Formation extends Item {

  public chapterCount: number;
  public totalMinutes: number;
  public chapters: ChapterVideo [];

  constructor(id: number, title: string, url: string,  location: string, chapterCount: number, totalMinutes: number, chapters: ChapterVideo[]) {
    super(title, url, location, id);
    this.chapterCount = chapterCount;
    this.totalMinutes = totalMinutes;
    this.chapters =  chapters;
  }

}
