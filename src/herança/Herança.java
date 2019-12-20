/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança;

/**
 *
 * @author Vagabundo
 */
public class Herança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro p1 = new Cachorro();
        Gato p2 = new Gato();
        p1.setNomedoanimal("horcha");
        p1.setRaca("pitbull");
        p2.setNomedoanimal("hassan");
        p2.setRaca("preto e branco");
        p1.caminhar();
        p2.caminhar();
        p2.latir();
        p1.latir();
        System.out.println(p1);
        System.out.println(p2);
        
    }
    
}
