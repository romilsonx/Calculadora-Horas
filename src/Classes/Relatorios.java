/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Romilson dos Santos
 */
public class Relatorios {
    
    private static String relatorio = "";
    
    public static void setRelatorio( String texto){
         relatorio = texto;
         
       };
     
    public static String getRelatorio(){
        
           return relatorio;
                
       };
    
    
    
}
