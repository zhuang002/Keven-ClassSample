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
public class Mammal extends Animal {
    public Mammal(int a, String n) {
        super(a,n);
    }
    public void makeSound() {
        System.out.println(this.name+" is making sound");
    }
}
