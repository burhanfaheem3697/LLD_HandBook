package com.example.StockItem;

/**
 * StockItemDebug
 */
public class StockItemDebug {

    private int totalQuantity;
    private int reservedQuantity;

    public StockItemDebug(int totalQuantity){
        if(totalQuantity < 0){
            throw new IllegalArgumentException("Total quantity can't be negative");
        }

        this.totalQuantity = totalQuantity;
        this.reservedQuantity = 0;
    }

    public void reserveStock(int amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be positive");
        }

        if(reservedQuantity + amount > totalQuantity){
            throw new IllegalArgumentException("Can't reserve more than total available stock");
        }

        reservedQuantity+=amount;
    }

    public int getAvailableStock(){
        return totalQuantity - reservedQuantity;
    }

    public int getTotalQuantity(){
        return totalQuantity;
    }

    public int getReservedQuantity(){
        return reservedQuantity;
    }


}