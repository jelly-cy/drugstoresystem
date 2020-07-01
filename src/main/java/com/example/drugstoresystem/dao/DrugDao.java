package com.example.drugstoresystem.dao;

import com.example.drugstoresystem.entity.Drugs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugDao extends JpaRepository<Drugs,Integer> {

}
