package com.example.drugstoresystem.Controller;


import com.example.drugstoresystem.entity.Drugs;
import com.example.drugstoresystem.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("drug")
public class DrugController {
    @Autowired
    DrugService drugService;


   @GetMapping
    public List<Drugs> show(){
        List<Drugs> drugs=drugService.search();
        return drugs;
    }

    @GetMapping("{id}")
    public Drugs searchById(@PathVariable Integer id){
        Drugs drugs =drugService.searchById(id);
        return drugs;
    }
    @PostMapping
    public  boolean add(@RequestBody Drugs drugs){
        boolean flag=drugService.add(drugs);
        return flag;
    }
    @PutMapping
    public  boolean modify(@RequestBody Drugs drugs){
        boolean flag=drugService.modify(drugs);
        return flag;
    }
    @DeleteMapping("{id}")
    public  boolean delete(@PathVariable Integer id){
        boolean flag=drugService.deleteById(id);
        return flag;
    }

}
