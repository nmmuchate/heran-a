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
public class Rico extends Pessoa{
    private double dinheiro;

    public Rico() {
    }
    

    public Rico(double dinheiro) {
        this.dinheiro += dinheiro;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    
    
    public void fazcompras(){
        this.dinheiro -= dinheiro;
    }
} 
