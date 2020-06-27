/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotin.dotintask1;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Alireza
 */
public class Account implements Serializable {
        
    private String DepositNumber;
    private BigDecimal amount;
  

    
    
    public Account() {
        
    }
    
    public Account(String DepositNumber, BigDecimal amount) {
        this.DepositNumber = DepositNumber;
        this.amount = amount;
       
    }

    public String getDepositNumber() {
        return DepositNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

   

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public void setDepositNumber(String DepositNumber) {
        this.DepositNumber = DepositNumber;
    }

    @Override
    public String toString() {
        return  DepositNumber + "\t" + amount ;
    }
    
}
