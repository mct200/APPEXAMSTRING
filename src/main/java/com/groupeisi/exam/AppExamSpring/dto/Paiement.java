package com.groupeisi.exam.AppExamSpring.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Date;

public class Paiement {
    private Long id;
    @NotNull
    private LocalDate datePaiement;
    @NotNull
    private double montantPaiement;

}
