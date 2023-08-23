package com.groupeisi.exam.AppExamSpring.services;

import com.groupeisi.exam.AppExamSpring.dao.Declarationdao;
import com.groupeisi.exam.AppExamSpring.dao.Paiementdao;
import com.groupeisi.exam.AppExamSpring.entities.DeclarationEntity;
import com.groupeisi.exam.AppExamSpring.entities.PaiementEntity;
import com.groupeisi.exam.AppExamSpring.exceptions.UserNotFoundEception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaiementService {
    private final Paiementdao paiementdao;

    @Autowired
    public PaiementService( Paiementdao paiementdao) {
        this.paiementdao = paiementdao;
    }


    public  PaiementEntity addPaiement( PaiementEntity paiement) {

        return paiementdao.save(paiement);
    }

    public List<PaiementEntity> findAllPaiements(){
        return paiementdao.findAll();
    }
    public PaiementEntity updatePaiement(PaiementEntity paiement) {
        return paiementdao.save(paiement);
    }
    public PaiementEntity findById(Long id) {
        return (PaiementEntity) paiementdao.findPaiementById(id).orElseThrow(()-> new UserNotFoundEception("User by id"+id+"was not found"));
    }



    public PaiementEntity findPaiementById(Long id) {

        return (PaiementEntity) paiementdao.findPaiementById(id).orElseThrow(()->new UserNotFoundEception("Declarant by id" + id+ "was not found"));
    }



    public void deletePaiement(Long id) {

        paiementdao.deletePaiementById(id);
    }



}
