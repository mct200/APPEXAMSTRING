package com.groupeisi.exam.AppExamSpring.dao;

import com.groupeisi.exam.AppExamSpring.entities.DeclarantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface Declarantdao extends JpaRepository<DeclarantEntity,Long> {


    Optional<Object> findDeclarantById(Long id);

    void deleteDeclarantById(Long id);
}
