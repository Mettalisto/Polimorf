/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorf;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Polimorf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Hero> soliders = new ArrayList<Hero>();
        soliders.add(new Zombie ("Brand"));
        soliders.add(new Archer ("Varus"));
        soliders.add(new Executioner ("Draven"));
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        if(b.equals("Hit"))
        {
            if(a.equals("Brand"))
            {
               soliders.get(0).hit();
            }
            else if(a.equals("Varus"))
            {
               soliders.get(1).hit();    
            }
            else if(a.equals("Draven"))
            {
               soliders.get(2).hit();         
            }
        }
        if(b.equals("Move"))
        {
            int moveLength = sc.nextInt();
            String dest = sc.next();
            if(a.equals("Brand"))
            {
               soliders.get(0).move(moveLength, dest);
            }
            else if(a.equals("Varus"))
            {
               soliders.get(1).move(moveLength, dest);  
            }
            else if(a.equals("Draven"))
            {
               soliders.get(2).move(moveLength, dest);       
            }
        }
    }
    
}
