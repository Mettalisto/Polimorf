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
public class Zombie extends Hero{

    public Zombie(String name) {
        super(name);
    }

    @Override
    public void hit() {
        System.out.println(super.name + " Brainnnn");
    }
    
}
