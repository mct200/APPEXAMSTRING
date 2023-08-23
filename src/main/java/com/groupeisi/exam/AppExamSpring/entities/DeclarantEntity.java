package com.groupeisi.exam.AppExamSpring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeclarantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 150)
    private String raisonSociale;

    @Column(nullable = false, length = 150)
    private String adresse;

    @Column(nullable = false, length = 150)
    private String telephone;

    @Column(nullable = false, length = 150)
    private String email;

    @OneToMany(mappedBy = "declarant") // Correction ici
    private List<DeclarationEntity> declarations;

    @OneToMany(mappedBy = "declarant")
    private List<PaiementEntity> paiements;
}
