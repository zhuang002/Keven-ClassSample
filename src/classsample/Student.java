/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classsample;

import java.util.ArrayList;

/**
 *
 * @author zhuan
 */
public class Student extends Human {
    private int studentID;
    private int grade;
    private ArrayList<String> myClasses=new ArrayList();
    
    public Student(int a, String n, int h, String g) {
        super(a,n,h,g);
    }
    
    public void setStudentId(int id) {
        this.studentID=id;
    }
    
    public void setGrade(int g) {
        this.grade=g;
    }
    
    public int getStudentId() {
        return this.studentID;
    }
    
    public int getGrade() {
        return this.grade;
    }
    
    public void takeClass(String classID) {
        myClasses.add(classID);
    }
    
    public void dropClass(String classID) {
        myClasses.remove(classID);
    }
    
    public void printMyClasses() {
        System.out.print("I have take "+this.myClasses.size()+" classes: ");
        for (String id:this.myClasses) {
            System.out.print(id+" ");
        }
    }
}
