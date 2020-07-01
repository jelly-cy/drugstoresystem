package com.example.drugstoresystem.service;

import com.example.drugstoresystem.entity.Sorts;

import java.util.List;

public interface SortService {
    List<Sorts> search();
    boolean add(Sorts sorts);
    Sorts searchById(Integer id);
    boolean modify(Sorts sorts);
    boolean deleteById(Integer id);

}
