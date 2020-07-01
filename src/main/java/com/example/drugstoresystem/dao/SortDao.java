package com.example.drugstoresystem.dao;

import com.example.drugstoresystem.entity.Sorts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SortDao extends JpaRepository<Sorts,Integer> {

}
