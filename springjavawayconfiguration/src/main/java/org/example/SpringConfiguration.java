package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@ComponentScan(basePackages = "org.example")
public class SpringConfiguration {



    @Bean ( name = "product")

    @Scope ("singleton")



    public product getProduct() {
        return  new product (1,"laptop" , 100000);
    }
}
