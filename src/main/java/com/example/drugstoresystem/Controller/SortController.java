package com.example.drugstoresystem.Controller;

import com.example.drugstoresystem.entity.Sorts;
import com.example.drugstoresystem.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("sorts")
public class SortController {
    @Autowired
    SortService sortService;

    @GetMapping
    public List<Sorts> show(){
        List<Sorts> sorts=sortService.search();
        return sorts;
    }
    @GetMapping("{id}")
    public Sorts searchById(@PathVariable Integer id){
        Sorts sorts =sortService.searchById(id);
        return sorts;
    }
    @PostMapping
    public  boolean add(@RequestBody Sorts sorts){
        boolean flag=sortService.add(sorts);
        return flag;
    }
    @PutMapping
    public  boolean modify(@RequestBody Sorts sorts){
        boolean flag=sortService.modify(sorts);
        return flag;
    }
    @DeleteMapping("{id}")
    public  boolean delete(@PathVariable Integer id){
        boolean flag=sortService.deleteById(id);
        return flag;
    }
}
