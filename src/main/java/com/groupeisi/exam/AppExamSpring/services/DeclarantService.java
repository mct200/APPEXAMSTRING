package com.groupeisi.exam.AppExamSpring.services;

import com.groupeisi.exam.AppExamSpring.dao.Declarantdao;
import com.groupeisi.exam.AppExamSpring.dto.Declarant;
import com.groupeisi.exam.AppExamSpring.entities.DeclarantEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.groupeisi.exam.AppExamSpring.exceptions.UserNotFoundEception;

import java.util.List;

@Service
public class DeclarantService {
    private final Declarantdao declarantdao ;

    @Autowired
    public DeclarantService(Declarantdao declarantdao) {
        this.declarantdao = declarantdao;
    }


    public DeclarantEntity addDeclarant(DeclarantEntity declarant) {

        return declarantdao.save(declarant);
    }

    public List<DeclarantEntity> findAllDeclarants(){
        return declarantdao.findAll();
    }
    public DeclarantEntity updateDeclarant(DeclarantEntity declarant) {
        return declarantdao.save(declarant);
    }
    public DeclarantEntity findById(Long id) {
        return (DeclarantEntity) declarantdao.findDeclarantById(id).orElseThrow(()-> new UserNotFoundEception("User by id"+id+"was not found"));
    }



    public DeclarantEntity findPDeclarantById(Long id) {

        return (DeclarantEntity) declarantdao.findDeclarantById(id).orElseThrow(()->new UserNotFoundEception("Declarant by id" + id+ "was not found"));
    }



    public void deleteDeclarant(Long id) {

        declarantdao.deleteDeclarantById(id);
    }

}
