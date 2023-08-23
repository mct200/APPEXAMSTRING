package com.groupeisi.exam.AppExamSpring.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeclarationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate dateDeclaration;

    @Column(nullable = false)
    private double montantDeclaration;

    @ManyToOne
    @JoinColumn(name = "declarant_id") // Correction ici
    private DeclarantEntity declarant;

    @OneToMany(mappedBy = "declaration")
    private List<PaiementEntity> paiements;
}
