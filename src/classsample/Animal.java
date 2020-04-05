/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classsample;

/**
 *
 * @author zhuan
 */
public class Animal {
    protected int age;
    protected String name;
    
    public Animal(int a, String n) {
        this.age=a;
        this.name=n;
    }
    
    public void move(int distance) {
        System.out.println(name+" is moving by distance "+distance);
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getName() {
        return this.name;
    }
    
    
}
