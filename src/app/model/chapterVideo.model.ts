export class ChapterVideo {

  public title: string;
  public sourceUrl: string;
  public duration: number;
  public preview: string;

  constructor(title: string, sourceUrl: string, duration: number, preview: string) {
    this.title = title;
    this.sourceUrl = sourceUrl;
    this.duration = duration;
    this.preview = preview;
  }
}
