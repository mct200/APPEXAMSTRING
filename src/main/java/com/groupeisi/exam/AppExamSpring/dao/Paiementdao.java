package com.groupeisi.exam.AppExamSpring.dao;


import com.groupeisi.exam.AppExamSpring.entities.PaiementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Paiementdao extends JpaRepository<PaiementEntity,Long> {
    Optional<Object> findPaiementById(Long id);

    void deletePaiementById(Long id);
}
