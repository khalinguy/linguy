/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh Nguyen
 */
public class Person {
    private String name;
    private String number;
    
    public Person (String name, String number){
        this.name = name;
        this.number = number;
    }
    
    public void changeNumber (String number){
        this.number = number;
    }
    public String getName(){
        return name;
    }
    
    public String getNumber(){
        return number;
    }
    
    public String toString(){
        return "" + name + "  number: " + number;
    }
}
