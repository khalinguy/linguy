/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh Nguyen
 */
public class Student {
    private String name;
    private String studentNumber;
    
    public Student(String name, String studentNumber){
        this.name = name;
        this.studentNumber = studentNumber;
    }
    
    public String getName(){
        return name;
    }
    public String getStudentNumber(){
        return studentNumber;
    }
    
    public String toString(){
        return "" + name + " (" + studentNumber +")" ;
    }
}
