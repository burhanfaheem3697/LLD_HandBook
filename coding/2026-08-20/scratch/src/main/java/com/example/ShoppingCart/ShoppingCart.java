package com.example.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

/**
 * ShoppingCart
 */
public class ShoppingCart {

    private final List<String> items = new ArrayList<>();

    public void addItem(String item){
        if(item == null || item.trim().isEmpty()){
            throw new IllegalArgumentException("Item is required");
        }

        items.add(item);
    }

    public List<String> getItems(){
        return List.copyOf(items);
    }
    
}