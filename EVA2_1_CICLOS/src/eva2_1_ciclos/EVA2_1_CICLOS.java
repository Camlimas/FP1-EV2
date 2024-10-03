/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_ciclos;

/**
 *
 * @author invitado
 */
public class EVA2_1_CICLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CICLO FOR -->CUANDO SABEMOS CUANTAS VECES SE REPITE LA INSTRUCION 
        //FUNCIONA COMO UN CONTADOR:INICO,FIN(condición)
        //i --> INDEX --> INDICE
        //VAMOS A REPETIR 10 VECES.CONTANDO DE 1 A 10
        //N0OSOTROS ESTABLECEMOS EL PUNTO DE INICIO Y DE FIN 
        for(int i=1; i<=10; i++){
            System.out.print( i + "-");
        
        }
        System.out.println("");
       
        for(int i=10; i>=1; i--){
            System.out.print( i + "-");
        
        }
        
    }
    
}
