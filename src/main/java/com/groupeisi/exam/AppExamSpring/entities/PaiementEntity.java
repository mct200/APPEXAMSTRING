package com.groupeisi.exam.AppExamSpring.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaiementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate datePaiement;
    private double montantPaiement;

    @ManyToOne
    @JoinColumn(name = "declarant_id") // Correction ici
    private DeclarantEntity declarant;

    @ManyToOne
    @JoinColumn(name = "declaration_id") // Correction ici
    private DeclarationEntity declaration;
}
