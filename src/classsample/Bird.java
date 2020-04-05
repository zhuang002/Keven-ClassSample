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
public class Bird extends Animal {
    public Bird(int a, String n) {
        super(a,n);
    }
    public void fly(int distance) {
        this.move(distance);
    }
}
