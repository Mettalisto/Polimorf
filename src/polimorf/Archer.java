/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorf;

/**
 *
 * @author user
 */
public class Archer extends Hero{

    public Archer(String name) {
        super(name);
    }
    @Override
    public void hit() {
        System.out.println(super.name + " throws an arrow");
    }
    
}
