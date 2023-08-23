package com.groupeisi.exam.AppExamSpring.dao;


import com.groupeisi.exam.AppExamSpring.entities.DeclarationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Declarationdao extends JpaRepository<DeclarationEntity,Long> {
    Optional<Object> findDeclarationById(Long id);

    void deleteDeclarationById(Long id);
}
