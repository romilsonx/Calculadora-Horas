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
public class Remoto {
 //Total de horas do projeto   
 private static int TotalHoras = 0;
 //Total de horas de cadastro
 private static int TotalHorasCad = 0;
 //Total de horas operacional
 private static int TotalHorasOper = 0;
 //Total de horas acompanhamento cadastro
 private static int TotalHorasAcompCad = 4;
 //Total de horas acompanhamento operacional
 private static int TotalHorasAcompOper = 8;       
 //Total de horas Front cadastro
 private static int FrontCad = 2;
 //Total de horas Front operacional
 private static int FrontOper = 8;
 //Total de horas Financeiro cadastro
 private static int FinanCad = 2;
 //Total de horas Financeiro operacional
 private static int FinanOper = 2;
 //Total de horas Almoxarifado cadastro
 private static int AlmoxCad = 2;
 //Total de horas Almoxarifado operacional
 private static int AlmoxOper = 2;
 //Total de horas PDV Cadastro
 private static int PDVCad = 2;
 //Total de horas PDV operacional
 private static int PDVOper = 2;
 //Total de horas Telefonia cadastro
 private static int TelefCad = 1;
 //Total de horas Telefonia operacional
 private static int TelefOper = 1;
 //Total de horas Contabilidade cadastro
 private static int ContabCad = 2;
 //Total de horas Contabilidade operacional
 private static int ContabOper = 2;    
 //Total de horas Fiscal cadastro
 private static int FiscalCad = 8;
 //Total de horas Fiscal operacional
 private static int FiscalOper = 16;  
 //Total de horas para instalar e configurar a Nota Fiscal de Serviço Eletrônica
 private static int NFSe = 4;
 //Total de horas para instalar e configurar o Boleto bancário
 private static int Boleto = 4;
 //Total de horas para instalar e configurar as estações
 private static int Estacao = 4;
 //Total de horas para instalar e configurar NFCe
 private static int NFCe = 8;
 
    
    public static void setTotalHoras(int horas){
        TotalHoras = horas;
       };
    
    public static int getTotalHoras(){
        return TotalHoras;
    
     };
    
    public static void setTotalHorasCad(int horas){
        TotalHorasCad = horas;
       };
    
    public static int getTotalHorasCad(){
        return TotalHorasCad;
    
     };
    
    public static void setTotalHorasOper(int horas){
        TotalHorasOper = horas;
       };
    
    public static int getTotalHorasOper(){
        return TotalHorasOper;
    
     };
    
    public static void setTotalHorasAcompCad(int horas){
        TotalHorasAcompCad = horas;
       };
    
    public static int getTotalHorasAcompCad(){
        return TotalHorasAcompCad;
    
     };
    
    public static void setTotalHorasAcompOper(int horas){
        TotalHorasAcompOper = horas;
       };
    
    public static int getTotalHorasAcompOper(){
        return TotalHorasAcompOper;
    
     };
    
      public static void setFrontCad(int horas){
        FrontCad = horas;
       };
    
    public static int getFrontCad(){
        return FrontCad;
    
     };
    
      public static void setFrontOper(int horas){
        FrontOper = horas;
       };
    
    public static int getFrontOper(){
        return FrontOper;
    
     };
    
      public static void setFinanCad(int horas){
        FinanCad = horas;
       };
    
    public static int getFinanCad(){
        return FinanCad;
    
     };
    
      public static void setFinanOper(int horas){
        FinanOper = horas;
       };
    
    public static int getFinanOper(){
        return FinanOper;
    
     };
    
      public static void setAlmoxCad(int horas){
        AlmoxCad = horas;
       };
    
    public static int getAlmoxCad(){
        return AlmoxCad;
    
     };
   
    public static void setAlmoxOper(int horas){
        AlmoxOper = horas;
       };
    
    public static int getAlmoxOper(){
        return AlmoxOper;
    
     };
    
    public static void setPDVCad(int horas){
        PDVCad = horas;
       };
    
    public static int getPDVCad(){
        return PDVCad;
    
     };
    
    public static void setPDVOper(int horas){
        PDVOper = horas;
       };
    
    public static int getPDVOper(){
        return PDVOper;
    
     };
    
    public static void setTelefCad(int horas){
        TelefCad = horas;
       };
    
    public static int getTelefCad(){
        return TelefCad;
    
     };
    
    public static void setTelefOper(int horas){
        TelefOper = horas;
       };
    
    public static int getTelefOper(){
        return TelefOper;
    
     };
    
    public static void setContabCad(int horas){
        ContabCad = horas;
       };
    
    public static int getContabCad(){
        return ContabCad;
    
     };
    
    public static void setContabOper(int horas){
        ContabOper = horas;
       };
    
    public static int getContabOper(){
        return ContabOper;
     };
    
    public static void setFiscalCad(int horas){
        FiscalCad = horas;
       };
    
    public static int getFiscalCad(){
        return FiscalCad;
     };
    
    public static void setFiscalOper(int horas){
        FiscalOper = horas;
       };
    
    public static int getFiscalOper(){
        return FiscalOper;
     };
    
    public static void setTotalNFSe(int horas){
        NFSe = horas;
       };
    
    public static int getTotalNFSe(){
        return NFSe;    
     };
    
    public static void setTotalBoleto(int horas){
        Boleto = horas;
       };
    
    public static int getTotalBoleto(){
        return Boleto;    
     };
    
    public static void setTotalEstacao(int horas){
        Estacao = horas;
       };
    
    public static int getTotalEstacao(){
        return Estacao;    
     };
    
    public static void setTotalNFCe(int horas){
        Estacao = horas;
       };
    
    public static int getTotalNFCe(){
        return NFCe;    
     };
        
}
