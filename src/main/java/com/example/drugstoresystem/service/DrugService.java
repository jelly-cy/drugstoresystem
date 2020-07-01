package com.example.drugstoresystem.service;

import com.example.drugstoresystem.entity.Drugs;

import java.util.List;

public interface DrugService {
    List<Drugs> search();
    boolean add(Drugs drugs);
    Drugs searchById(Integer id);
    boolean modify(Drugs drugs);
    boolean deleteById(Integer id);

}
