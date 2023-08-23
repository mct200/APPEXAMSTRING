package com.groupeisi.exam.AppExamSpring.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Declaration {
    private Long id;
    @NotNull
    private LocalDate dateDeclaration;
    @NotNull
    private double montantDeclaration;

}
