/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança;

import java.util.*;

/**
 *
 * @author Vagabundo
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza os dados das Pessoas");
        
        System.out.println("Dados do individuo que recebe");
        Rico r1 = new Rico();
        System.out.println("Nome");
        r1.setNome(sc.next());
        System.out.println("idade");
        r1.setIdade(sc.nextInt());
        System.out.println("Salario");
        r1.setDinheiro(sc.nextDouble());
        System.out.println("Compras");
        r1.fazcompras();
        
        
        
        
    }
    
}
