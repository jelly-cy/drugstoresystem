package com.example.drugstoresystem.service.serviceImpl;


import com.example.drugstoresystem.dao.SortDao;
import com.example.drugstoresystem.entity.Sorts;
import com.example.drugstoresystem.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SortServiceImpl implements SortService {


    @Autowired
    SortDao sortDao;

    @Override
    public List<Sorts> search() {
        return sortDao.findAll();
    }

    @Override
    public boolean add(Sorts sorts) {
        Sorts sorts1 =sortDao.save(sorts);
        return sorts1 !=null;
    }

    @Override
    public Sorts searchById(Integer id) {
        return sortDao.findById(id).get();
    }

    @Override
    public boolean modify(Sorts sorts) {
        Sorts sorts1 =sortDao.save(sorts);
        return sorts1 !=null;
    }

    @Override
    public boolean deleteById(Integer id) {
        sortDao.deleteById(id);
        return true;
    }
}
