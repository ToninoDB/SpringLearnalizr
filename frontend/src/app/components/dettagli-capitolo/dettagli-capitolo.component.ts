import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Capitolo } from 'src/app/models/capitolo.model';
import { Lezione } from 'src/app/models/lezione.model';
import { MainServiceService } from 'src/app/services/main-service.service';

@Component({
  selector: 'app-dettagli-capitolo',
  templateUrl: './dettagli-capitolo.component.html',
  styleUrls: ['./dettagli-capitolo.component.css'],
})
export class DettagliCapitoloComponent implements OnInit {
  capitolo!: Capitolo;
  lezioni: Lezione[] = [];

  constructor(
    private route: ActivatedRoute,
    private service: MainServiceService
  ) {}

  ngOnInit(): void {
    const chapterId = +this.route.snapshot.paramMap.get('id')!;
    this.service.getChapterById(chapterId).subscribe((capitolo) => {
      this.capitolo = capitolo;
    });
    this.service.getLessonsByChapter(chapterId).subscribe((lezione) => {
      this.lezioni = lezione;
    });
  }
}
