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
public class Animal {
    private String raca;
    private String nomedoanimal;
    
    public Animal(){
        
    }

    public Animal(String nomedoanimal) {
        this.nomedoanimal = nomedoanimal;
    }
    public void caminhar(){
        System.out.println("caminha,caminha");
    }
    

    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return the nomedoanimal
     */
    public String getNomedoanimal() {
        return nomedoanimal;
    }

    /**
     * @param nomedoanimal the nomedoanimal to set
     */
    public void setNomedoanimal(String nomedoanimal) {
        this.nomedoanimal = nomedoanimal;
    }

    @Override
    public String toString() {
        return "Animal{" + "raca=" + raca + ", nomedoanimal=" + nomedoanimal + '}';
    }
    
    
          
    
}
