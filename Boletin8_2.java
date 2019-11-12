/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_2;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);   
        System.out.println("Precio unitario ");
         float v_precioUnitario = sc.nextFloat();                  
        System.out.println("Cantidades ");
        int v_cantidad = sc.nextInt();  
         
       
         CalcularPorc obj = new CalcularPorc(v_precioUnitario,v_cantidad);
        
         String v_resultado =obj.Calcular(v_precioUnitario, v_cantidad);
         
         System.out.println(obj.Calcular(v_precioUnitario, v_cantidad));
         
    }
    
}
