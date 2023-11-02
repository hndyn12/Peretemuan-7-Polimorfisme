/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPolimorfisDinamis;

/**
 *
 * @author X1
 */
public class Main {
    public static void main(String[] args) {
        Buah buah = new Buah();
        Jeruk jeruk = new Jeruk("orange","manis");
        Buahnaga buahnaga = new Buahnaga("Merah","manis");
        Nanas nanas = new Nanas("Kuning","Masam");
        
        jeruk.rasa();
        jeruk.warna();
        buahnaga.rasa();
        buahnaga.warna();
        nanas.rasa();
        nanas.warna();
    }
}
