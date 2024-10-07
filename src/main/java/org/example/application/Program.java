package org.example.application;

import org.example.entities.Product;
import org.example.utill.ProductPedicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;
    //test
        //Remover da lista todo produto que tiver preço menor que 100


        list.removeIf(p -> p.getPrice() <= min);

        for(Product p: list){
            System.out.println(p);
        }

    }
}