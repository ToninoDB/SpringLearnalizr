import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Capitolo } from '../models/capitolo.model';

@Injectable({
  providedIn: 'root',
})
export class MainServiceService {
  private apiUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) {}

  getAllChapters(): Observable<Capitolo[]> {
    return this.http.get<Capitolo[]>(`${this.apiUrl}/capitoli`);
  }

  getChapterById(id: number): Observable<Capitolo> {
    return this.http.get<Capitolo>(`${this.apiUrl}/capitoli/${id}`);
  }
}
