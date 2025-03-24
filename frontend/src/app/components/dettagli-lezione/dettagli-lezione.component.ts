import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Lezione } from 'src/app/models/lezione.model';
import { MainServiceService } from 'src/app/services/main-service.service';

@Component({
  selector: 'app-dettagli-lezione',
  templateUrl: './dettagli-lezione.component.html',
  styleUrls: ['./dettagli-lezione.component.css'],
})
export class DettagliLezioneComponent implements OnInit {
  lezione!: Lezione;

  constructor(
    private route: ActivatedRoute,
    private service: MainServiceService
  ) {}

  ngOnInit(): void {
    const lessonId = +this.route.snapshot.paramMap.get('id')!;
    this.service.getLessonById(lessonId).subscribe((lezione) => {
      this.lezione = lezione;
    });
  }
}
