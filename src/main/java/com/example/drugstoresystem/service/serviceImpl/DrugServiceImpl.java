package com.example.drugstoresystem.service.serviceImpl;

import com.example.drugstoresystem.dao.DrugDao;
import com.example.drugstoresystem.entity.Drugs;
import com.example.drugstoresystem.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DrugServiceImpl implements DrugService {
    @Autowired
    DrugDao drugDao;



    @Override
    public List<Drugs> search() {

        return drugDao.findAll();
    }

    @Override
    public boolean add(Drugs sort) {
        Drugs drugs1 =drugDao.save(sort);
        return drugs1 !=null;
    }

    @Override
    public Drugs searchById(Integer id) {

        return drugDao.findById(id).get();
    }

    @Override
    public boolean modify(Drugs drugs) {
        Drugs sort1=drugDao.save(drugs);
        return sort1!=null;
    }

    @Override
    public boolean deleteById(Integer id) {
        drugDao.deleteById(id);
        return true;
    }





}
