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
public class Human extends Mammal {
    protected int height;
    protected String gender;
    
    public Human(int a, String n, int h, String g) {
        super(a,n);
        this.height=h;
        this.gender=g;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public void talk() {
        this.makeSound();
    }
    
    public void step() {
        this.move(1);
    }
    
}
