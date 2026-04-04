package org.example.Dao;

import  org.example.Model.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class dao {

@Autowired
    JdbcTemplate jdbcTemplate;
        //add
        public  void add(model model){

             String query = "insert into users11 (name,email,price) values (?,?,?)";

         //    String query1 = " upadate users11  set name  = ?  where id = ? ";

            // String  query2 = "delete from users11 where id = ? ";


            jdbcTemplate.update(query,model.getName(),model.getEmail(),model.getPrice());

            //update
           // jdbcTemplate.update(query1, model.getName(),model.getEmail(),model.getPrice());
        /*    public void update(Model model) {
                String query = "UPDATE users11 SET name = ?, email = ?, price = ? WHERE id = ?";
                jdbcTemplate.update(query, model.getName(), model.getEmail(), model.getPrice(), model.getId());
                System.out.println("Model updated successfully: " + model);
            }*/


            System.out.println("model Addeed Suceesfuly ");

            System.out.println(model);
        }
}
