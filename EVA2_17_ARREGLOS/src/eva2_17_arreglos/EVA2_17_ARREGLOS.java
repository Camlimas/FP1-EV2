/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_17_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_17_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String diasemana[]={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
       
       int valores[] = {20,50,100,200,500,1000};
      
       for(int i=0; i<diasemana.length;i++){
       System.out.print( diasemana[i] + "-");
       
       }
       
       
       for(int i=0; i<valores.length;i++){
       System.out.print( valores [i] + "-");
       
       }
    }
    
}
