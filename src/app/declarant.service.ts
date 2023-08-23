import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Declarant } from './declarant.model';


@Injectable({
  providedIn: 'root'
})
export class DeclarantService {

  private baseUrl = 'http://localhost:8080'; // Mettez votre URL backend ici

  constructor(private http: HttpClient) {}

  getAllDeclarants(): Observable<Declarant[]> {
    return this.http.get<Declarant[]>(`${this.baseUrl}/declarant/list`);
  }

  getDeclarantById(id: number): Observable<Declarant> {
    return this.http.get<Declarant>(`${this.baseUrl}/declarant/find/${id}`);
  }

  addDeclarant(declarant: Declarant): Observable<Declarant> {
    return this.http.post<Declarant>(`${this.baseUrl}/declarant/add`, declarant);
  }

  updateDeclarant(declarant: Declarant): Observable<Declarant> {
    return this.http.put<Declarant>(`${this.baseUrl}/declarant/update`, declarant);
  }

  deleteDeclarant(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/declarant/delete/${id}`);
  }
}
