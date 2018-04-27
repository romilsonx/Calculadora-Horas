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
public class Reservas {
    
    // Total de horas somente HOTVWEB
    private static int Reserva = 4;
    // Total de horas integração FULL
    private static int ReservaFull = 8;
    // Total de horas integração Special
    private static int ReservaSpecial = 8;

    public static void setReserva(int horas){
        Reserva = horas;
       };
    
    public static int getReserva(){
        return Reserva;
    
     };
    
        public static void setReservaFull(int horas){
        ReservaFull = horas;
       };
    
    public static int getReservaFull(){
        return ReservaFull;
    
     };
    
        public static void setReservaSpecial(int horas){
        ReservaSpecial = horas;
       };
    
    public static int getReservaSpecial(){
        return ReservaSpecial;
    
     };

    
    
    
}
