package com.groupeisi.exam.AppExamSpring.controller;

import com.groupeisi.exam.AppExamSpring.entities.DeclarantEntity;
import com.groupeisi.exam.AppExamSpring.services.DeclarantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/declarant")
public class DeclarantController {
    private final DeclarantService declarantService;
    @Autowired
    public DeclarantController(DeclarantService declarantService) {

        this.declarantService = declarantService;
    }
    @GetMapping("/list")
    public ResponseEntity<List<DeclarantEntity>> getAllDeclarant(){
        List<DeclarantEntity> declarants=declarantService.findAllDeclarants();
        return new ResponseEntity<>(declarants, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<DeclarantEntity> getPatientById(@PathVariable("id")Long id){
        DeclarantEntity declarant=declarantService.findPDeclarantById(id);
        return new ResponseEntity<>(declarant,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<DeclarantEntity> addPatient(@RequestBody DeclarantEntity declarant){
        DeclarantEntity newDeclarant=declarantService.addDeclarant(declarant);
        return new ResponseEntity<>(newDeclarant,HttpStatus.CREATED);

    }
    @PutMapping("/update")
    public ResponseEntity<DeclarantEntity> updateDeclarant(@RequestBody DeclarantEntity declarant){
        DeclarantEntity updateDeclarant=declarantService.updateDeclarant(declarant);
        return new ResponseEntity<>(updateDeclarant,HttpStatus.OK);

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DeclarantEntity> deletePatient(@PathVariable("id")Long id){
        declarantService.deleteDeclarant(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }


}
