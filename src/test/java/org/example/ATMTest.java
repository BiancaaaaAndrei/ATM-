package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ATMTest {
    @Test
    @DisplayName("Check withdrawal of £152")
        public void checkWithdrawalOf152(){
        ATM atm = new ATM();
        atm.withdrawValue(152);}

    @Test
    @DisplayName("Check withdrawal of £50")
        public void checkWithdrawalOf50(){
        ATM atm = new ATM();
        atm.withdrawValue(50);}


    @Test
    @DisplayName("Check withdrawal of £5")
    public void checkWithdrawalOf5(){
        ATM atm = new ATM();
        atm.withdrawValue(5);}
    @Test
    @DisplayName("Check withdrawal of £597")
    public void checkWithdrawalOf597(){
        ATM atm = new ATM();
        atm.withdrawValue(597);}
}
