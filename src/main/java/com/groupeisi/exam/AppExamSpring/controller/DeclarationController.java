package com.groupeisi.exam.AppExamSpring.controller;

import com.groupeisi.exam.AppExamSpring.entities.DeclarantEntity;
import com.groupeisi.exam.AppExamSpring.entities.DeclarationEntity;
import com.groupeisi.exam.AppExamSpring.services.DeclarantService;
import com.groupeisi.exam.AppExamSpring.services.DeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/declaration")
public class DeclarationController {
    private final DeclarationService declarationService;
    @Autowired
    public DeclarationController(DeclarationService declarationService) {

        this.declarationService = declarationService;
    }
    @GetMapping("/list")
    public ResponseEntity<List<DeclarationEntity>> getAllDeclaration(){
        List<DeclarationEntity> declarations=declarationService.findAllDeclarations();
        return new ResponseEntity<>(declarations, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<DeclarationEntity> getDeclarationById(@PathVariable("id")Long id){
        DeclarationEntity declaration=declarationService.findPDeclarationById(id);
        return new ResponseEntity<>(declaration,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<DeclarationEntity> addDeclaration(@RequestBody DeclarationEntity declaration){
        DeclarationEntity newDeclaration=declarationService.addDeclaration(declaration);
        return new ResponseEntity<>(newDeclaration,HttpStatus.CREATED);

    }
    @PutMapping("/update")
    public ResponseEntity<DeclarationEntity> updateDeclaration(@RequestBody DeclarationEntity declaration){
        DeclarationEntity updateDeclaration=declarationService.updateDeclaration(declaration);
        return new ResponseEntity<>(updateDeclaration,HttpStatus.OK);

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DeclarationEntity> deleteDeclaration(@PathVariable("id")Long id){
        declarationService.deleteDeclaration(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }


}
