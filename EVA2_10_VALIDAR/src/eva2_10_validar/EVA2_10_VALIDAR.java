/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_validar;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_VALIDAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diasem;
        
        Scanner captu= new Scanner(System.in);
        
        do{
        System.out.println("INGRESA UN NUMERO ENTRE EL 1-7");
        diasem = captu.nextInt();
        captu.nextLine();
    }while(diasem < 1 || diasem >7);
    
    switch(diasem){
            case 1:
                System.out.println("DOMINGO");
                break;//INTERRUMPE EL SWITCH (LO TERMINA)
           case 2:
                System.out.println("LUNES");
                break;//INTERRUMPE EL SWITCH (LO TERMINA)
            case 3:
                System.out.println("MARTES");
                break;//INTERRUMPE EL SWITCH (LO TERMINA)
             case 4:
                System.out.println("MIERCOLES");
                break;//INTERRUMPE EL SWITCH (LO TERMINA)
            case 5:
                System.out.println("JUEVES");
                break;//INTERRUMPE EL SWITCH (LO TERMINA)
            case 6:
                System.out.println("VIERNES");
                break;//INTERRUMPE EL SWITCH (LO TERMINA)
             case 7:
                System.out.println("SABADO");
                break;//INTERRUMPE EL SWITCH (LO TERMINA)               
             default:
                 System.out.println("NUMERO NO VALIDO");
                
        }
    }
}
