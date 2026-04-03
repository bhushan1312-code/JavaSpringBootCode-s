package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");

        product product =context.getBean("product" , product.class);

        System.out.println(product);

        Environment environment = context.getEnvironment();

        System.out.println("product id = " + environment.getProperty("product.id"));
        System.out.println("product name " + environment.getProperty("product.name"));
        System.out.println("producr price " + environment.getProperty("product.price"));

    }
}
