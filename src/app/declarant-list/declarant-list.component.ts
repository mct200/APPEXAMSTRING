
import { Declarant } from '../declarant.model';
import { DeclarantService } from '../declarant.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-declarant-list',
  templateUrl: './declarant-list.component.html',
  styleUrls: ['./declarant-list.component.css']
})
export class DeclarantListComponent implements OnInit {
  declarants: Declarant[] = [];

  constructor(private declarantService: DeclarantService) {}

  ngOnInit() {
    this.loadDeclarants();
  }

  loadDeclarants() {
    this.declarantService.getAllDeclarants().subscribe(data => {
      this.declarants = data;
    });
  }

  deleteDeclarant(id: number) {
    if (confirm('Voulez-vous vraiment supprimer ce déclarant ?')) {
      this.declarantService.deleteDeclarant(id).subscribe(() => {
        this.loadDeclarants(); // Recharge la liste après la suppression
      });
    }
  }
}