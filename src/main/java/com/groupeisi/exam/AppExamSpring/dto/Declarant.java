package com.groupeisi.exam.AppExamSpring.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Declarant {
    private long id;
    @NotNull(message= "La raison sociale ne doit pas etre null")
    private String raisonSociale;
    @NotNull(message = "L'adresse ne doit pas etre null")
    private String adresse;
    @NotNull(message = "Le telephone ne doit pas etre null")
    private String telephone;
    @NotNull(message = "L' email ne doit pas etre null")
    private String email;
}
