package com.groupeisi.exam.AppExamSpring.services;

import com.groupeisi.exam.AppExamSpring.dao.Declarantdao;
import com.groupeisi.exam.AppExamSpring.dao.Declarationdao;
import com.groupeisi.exam.AppExamSpring.entities.DeclarantEntity;
import com.groupeisi.exam.AppExamSpring.entities.DeclarationEntity;
import com.groupeisi.exam.AppExamSpring.exceptions.UserNotFoundEception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeclarationService {
    private final Declarationdao declarationdao;

    @Autowired
    public DeclarationService(Declarationdao declarationdao) {
        this.declarationdao = declarationdao;
    }


    public DeclarationEntity addDeclaration(DeclarationEntity declaration) {

        return declarationdao.save(declaration);
    }

    public List<DeclarationEntity> findAllDeclarations(){
        return declarationdao.findAll();
    }
    public DeclarationEntity updateDeclaration(DeclarationEntity declaration) {
        return declarationdao.save(declaration);
    }
    public DeclarationEntity findById(Long id) {
        return (DeclarationEntity) declarationdao.findDeclarationById(id).orElseThrow(()-> new UserNotFoundEception("User by id"+id+"was not found"));
    }



    public DeclarationEntity findPDeclarationById(Long id) {

        return (DeclarationEntity) declarationdao.findDeclarationById(id).orElseThrow(()->new UserNotFoundEception("Declarant by id" + id+ "was not found"));
    }



    public void deleteDeclaration(Long id) {

        declarationdao.deleteDeclarationById(id);
    }


}
