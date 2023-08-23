export class Declarant {
    id: number;
    raisonSociale: string;
    adresse: string;
    telephone: string;
    email: string;
    
    constructor(
        id: number,
        raisonSociale: string,
        adresse: string,
        telephone: string,
        email: string
      ) {
        this.id = id;
        this.raisonSociale = raisonSociale;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
      }
  }
  