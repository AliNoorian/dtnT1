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
public class Pay implements Serializable {
    private String deptorOrCreditor;
    private String depositNumber;
    private BigDecimal amount;
  

    public Pay() {
        
    }
    
    public Pay(String deptorOrCreditor, String depositNumber, BigDecimal amount) {
        this.deptorOrCreditor = deptorOrCreditor;
        this.depositNumber = depositNumber;
        this.amount = amount;
       
    }

    public String getDeptorOrCreditor() {
        return deptorOrCreditor;
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
    public void setDeptorOrCreditor(String deptorOrCreditor) {
        this.deptorOrCreditor = deptorOrCreditor;
    }
   

    @Override
    public String toString() {
        return deptorOrCreditor + "\t" + depositNumber + "\t" + amount ;
    }
    
}
