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
public class Balance implements Serializable{
    
     private String depositNumber;
    private BigDecimal amount;
  

    
    
    public Balance() {
        
    }
    public Balance(String depositNumber, BigDecimal amount) {
        this.depositNumber = depositNumber;
        this.amount = amount;
       
    }

   

    public String getDepositNumber() {
        return depositNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

   

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }
   
   

    @Override
    public String toString() {
        return  depositNumber + "\t" + amount ;
    }
    
}
