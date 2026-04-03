package org.example.Dao;

import  org.example.Model.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class dao {

@Autowired
    JdbcTemplate jdbcTemplate;

        public  void add(model model){

             String query = "insert into users11 (name,email,price) values (?,?,?)";


            jdbcTemplate.update(query,model.getName(),model.getEmail(),model.getPrice());

            System.out.println("model Addeed Suceesfuly ");

            System.out.println(model);
        }
}
