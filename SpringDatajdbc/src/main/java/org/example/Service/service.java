package org.example.Service;
import org.example.Model.model;
import  org.example.Dao.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {

    @Autowired
    public  dao dao ;

    public void add(model  model){
        dao.add(model);
    }
}
