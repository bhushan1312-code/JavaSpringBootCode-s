package org.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import java.security.Provider;

import  org.example.Service.service;
import org.example.Model.model;
import org.springframework.stereotype.Controller;


@Controller
public class controller {

@Autowired
    service service;

public  void add(model model){

    service.add(model);
}

}

