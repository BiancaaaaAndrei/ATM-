package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ATMTest {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.withdrawValue(157);
    }

 /*@Test
    @DisplayName("Check withdrawal of £157")
    public void checkWithdrawalOf157(){
     ATM atm = new ATM();
     atm.withdrawValue(157);

     Assertions.assertEquals(10, atm.getBillQuantity(50));
     Assertions.assertEquals(20, atm.getBillQuantity(20));
     Assertions.assertEquals(49, atm.getBillQuantity(10));
     Assertions.assertEquals(100, atm.getBillQuantity(5));
     Assertions.assertEquals(250, atm.getBillQuantity(2));
     Assertions.assertEquals(498, atm.getBillQuantity(1));
 }*/
}
