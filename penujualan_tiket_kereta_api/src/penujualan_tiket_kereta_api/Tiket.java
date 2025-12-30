/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package penujualan_tiket_kereta_api;


/**
 *
 * @author ACER
 */
public class Tiket {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         koneksi.Ukoneksi();
        new Login().setVisible(true); 
    }
    public static void oke(){
            new Beranda().setVisible(true);   
    }
     public void run() {
                new Daftar().setVisible(true);
            }
     
    
}
