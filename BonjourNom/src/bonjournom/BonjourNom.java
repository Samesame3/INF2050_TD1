/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonjournom;
import aleatoire.*;

//Modification to pull

/**
 *
 * @author djinn
 */
public class BonjourNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person john = new Person(args[0], args[1], 35);
        
        System.out.println("Prenom : " + john.getFirstName());
        System.out.println("Nom : " + john.getLastName());
        
        System.out.println("Bonjour John Doe!");
    }
    
}
