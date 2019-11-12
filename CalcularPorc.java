/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_2;

/**
 *
 * @author jalonsoriveiro
 */
public class CalcularPorc {
    
    float precioUnitario=0;
    int cantidadProducto = 0;
    int porcetanje = 0;
    public CalcularPorc(){
    
    
    
    }
    public CalcularPorc(float precio,int cantidad){
        
        cantidadProducto = cantidad;
        precioUnitario = precio;
    }
    
    public String Calcular( float p_precio,int unidades){
                  
    //return productoNome;

    if(unidades<100){
        
        return "Sen desconto";
        }
    else if (unidades==100 || unidades<200){            
        //return ("Precio total sin desconto"+(unidades * p_precio));
       if (p_precio>4000){
         //5%
          return ("Precio unidad,"+p_precio+" total unidades"+unidades+",Precio total sin desconto "+(unidades * p_precio)
                  +"Precio con desconto "+(unidades*p_precio)*5/100);
                   }
       else{
           return ("Precio total sin desconto "+(unidades * p_precio)
                  +"Precio con desconto "+(unidades*p_precio)*2/100);
       
                }           
    }
    else if(unidades>=200){
       if (p_precio>4000){
         //10%
          return ("Precio total sin desconto "+(unidades * p_precio)
                  +"Precio con desconto "+(unidades*p_precio)*10/100);
                   }
       else{
           return ("Precio total sin desconto "+(unidades * p_precio)
                  +"Precio con desconto "+(unidades*p_precio)*8/100);       
                }
    
    }
      else{
        return ("Precio total sin desconto "+(unidades * p_precio));
            }

}
}
    
