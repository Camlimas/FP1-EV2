/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_while_do_while;

/**
 *
 * @author invitado
 */
public class EVA2_7_WHILE_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //FOR-->Sabemos la cantidad de repeticiones 
        //While --> Cero o mas repeticiones
        //Do while--> una o mas repeticiones 
        //WHILE:
        System.out.println("WHILE");//MIENTRAS (ESTO SEA VERDAD)( REPITE ESTAS INSTRUCCION)
        int val=1;
        while(val<=10){
            System.out.print(val + "-");
            val++;
        }
        
        //DO WHILE:
        System.out.println("");
        System.out.println("DO WHILE");
        val=1;
        
        do{
            System.out.print(val + "-");
            val++;
        }while(val<=10); //REPETIR (ESTAS INTRUCCIONES) MIENTRAS (ESTO SEA VERDAD)
    
}
}

