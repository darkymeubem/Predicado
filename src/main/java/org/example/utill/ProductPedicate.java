package org.example.utill;

import org.example.entities.Product;

import java.util.function.Predicate;

public class ProductPedicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() <= 100;
    }
}