/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_8_acceso;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_8_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String usuario,contra;
        Scanner captu=new Scanner(System.in);
        //PANTALLA DE VALIDACIÓN:USUARIO Y CONTRASEÑA 
        do{
           
        System.out.println("Usuario");
        usuario=captu.nextLine();
        System.out.println("Contraseña:");
        contra=captu.nextLine();
        
        }while(!(usuario.equals("admin")&& contra.equals("1234")));
        //!-->OPERADOR LOGICO DE NEGACIÓN: NOT
        
        //PROGRAMA PRINCIPAL:
        System.out.println("PROGRAMA PRINCIPAL");
        
    }
    
}
