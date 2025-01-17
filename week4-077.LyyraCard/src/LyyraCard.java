/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh Nguyen
 */
public class LyyraCard {
    private double balance;
    
    public LyyraCard (double balanceAtStart){
        this.balance = balanceAtStart;
    }
    public String toString(){
        return "The card has " + this.balance + " euros";
    }
    public void payEconomical(){
        if (this.balance >= 2.50){
        this.balance -= 2.50;
        }
    }
    public void payGourmet(){
        if (this.balance >= 4.00){
        this.balance -= 4.00;
        }
    }
    public void loadMoney (double amount){
        if (amount > 0){
            this.balance += amount;
        }
        if (this.balance > 150){
            this.balance = 150;
        }
    }
}
