package org.example;

import org.example.Configuration.SpringConfiguration;
import org.example.Controller.controller;
import org.example.Model.model;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

public class App
{
    public static void main( String[] args )
    {
             model model = new model();
             model.setName("Bhushan");
             model.setEmail("bhushan@1312");
                model.setPrice(10000);

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

            controller controller = context.getBean(controller.class);
            controller.add(model);
    }
}
