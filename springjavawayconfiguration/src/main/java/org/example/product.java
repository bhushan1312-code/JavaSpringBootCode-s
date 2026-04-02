package org.example;

public class product {

    int id ;
    String name ;
    int price ;


    public  product(){}

    public  product(int id , String name , int price){

        this.id= id ;
        this.name =name;
        this.price = price;
    }

    public  int getId(){
        return  id ;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
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
