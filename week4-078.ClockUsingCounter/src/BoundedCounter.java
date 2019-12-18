/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh Nguyen
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit){
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    public void next(){
        if(this.value <= this.upperLimit){
            this.value ++;
        } 
        if (this.value > this.upperLimit){
            this.value =0;
        }
        
    
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        if (value <= this.upperLimit && value > 0){
        this.value = value;
    }
    }
    public String toString(){
        if(this.value < 10){
            return "0" + value;
        }
        return "" + value;
    }
}
