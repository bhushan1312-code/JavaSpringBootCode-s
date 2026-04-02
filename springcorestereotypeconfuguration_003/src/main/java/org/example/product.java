package org.example;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // create the object
@Scope("singleton") // only one obj is crete
@PropertySource("classpath:application.properties")// read data from anohter file

public class product {


    @Value("${product.id}")
    int id ;

    @Value("${product.name}")
    String name ;

    @Value( "${product.price}")
    int price ;

    public  product(){}

    public  product(int id , String name ,int price){
        this.id = id ;
        this.name = name ;
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
