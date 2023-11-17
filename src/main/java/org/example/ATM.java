package org.example;
public class ATM {
    private Bill[] bills;

    public ATM(){
        bills = new Bill[]{
                new Bill(50, 12),
                new Bill(20, 20),
                new Bill(10, 50),
                new Bill(2, 250),
                new Bill(1, 500)
        };
    }
    public void withdrawValue(int amount){
        System.out.println("Customer withdraws  " + amount);

        for(Bill bill : bills){
            int billsToTake = amount / bill.getValue();
            if(billsToTake > 0 && billsToTake <= bill.getQuantity()){
                System.out.println(billsToTake + " x £" + bill.getValue());

                amount -= bill.getValue() * billsToTake;

                bill.substractQuantity(billsToTake);}}

        System.out.println("\nValues remaining in the ATM: ");
        for (Bill bill : bills){
            System.out.println("£" + bill.getValue() + "\t" + bill.getQuantity());}
    }

    public int getBillQuantity(int value) {
        for (Bill bill:bills){
            if (bill.getValue() == value){
                return bill.getQuantity();
            }
        }
        return 0;
    }
}
