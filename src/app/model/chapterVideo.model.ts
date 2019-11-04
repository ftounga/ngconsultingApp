export class ChapterVideo {

  public title: string;
  public sourceUrl: string;
  public duration: number;
  public preview: string;
  public idFormation: number;

  constructor(idFormation: number, title: string, sourceUrl: string, duration: number, preview: string) {
    this.title = title;
    this.sourceUrl = sourceUrl;
    this.duration = duration;
    this.preview = preview;
    this.idFormation =  idFormation;
  }
}
