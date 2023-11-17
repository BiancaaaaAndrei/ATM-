package org.example;

public class Bill {
    private int value;
    private int quantity;

    public Bill(int value, int quantity){
        this.value = value;
        this.quantity = quantity;
    }

    public int getValue() {
        return value;
    }
    public int getQuantity() {

        return quantity;
    }

    public void substractQuantity(int billsToTake) {

        quantity -= billsToTake;
    }
}


