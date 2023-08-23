package com.groupeisi.exam.AppExamSpring.controller;

import com.groupeisi.exam.AppExamSpring.entities.DeclarationEntity;
import com.groupeisi.exam.AppExamSpring.entities.PaiementEntity;
import com.groupeisi.exam.AppExamSpring.services.DeclarationService;
import com.groupeisi.exam.AppExamSpring.services.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/paiement")
public class PaiementController {
    private final PaiementService paiementService;
    @Autowired
    public PaiementController(PaiementService paiementService) {

        this.paiementService = paiementService;
    }
    @GetMapping("/list")
    public ResponseEntity<List<PaiementEntity>> getAllDeclaration(){
        List<PaiementEntity> paiements=paiementService.findAllPaiements();
        return new ResponseEntity<>(paiements, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<PaiementEntity> getPaiementById(@PathVariable("id")Long id){
        PaiementEntity paiement=paiementService.findPaiementById(id);
        return new ResponseEntity<>(paiement,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<PaiementEntity> addPaiement(@RequestBody PaiementEntity paiement){
        PaiementEntity newDeclaration=paiementService.addPaiement(paiement);
        return new ResponseEntity<>(newDeclaration,HttpStatus.CREATED);

    }
    @PutMapping("/update")
    public ResponseEntity<PaiementEntity> updatePaiement(@RequestBody PaiementEntity paiement){
        PaiementEntity updateDeclaration=paiementService.updatePaiement(paiement);
        return new ResponseEntity<>(updateDeclaration,HttpStatus.OK);

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<PaiementEntity> deletePaiement(@PathVariable("id")Long id){
        paiementService.deletePaiement(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }


}
