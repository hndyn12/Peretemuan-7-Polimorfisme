/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorfismeDinamis;

/**
 *
 * @author X1
 */
public class MainUtama {
    public static void main(String[] args) {
        
    Bangundatar bangund = new Bangundatar();
    Persegi persegi = new Persegi(5);
    Segitiga segitiga = new Segitiga(5,10);
    Lingkaran lingkaran = new Lingkaran(10);
    
    //panggil method luas dan keliling
    bangund.luas();
    bangund.keliling();
    
        System.out.println("Luas persegi = "+persegi.luas());
        System.out.println("keliling persegi = "+persegi.keliling());
        System.out.println("Luas segitiga = "+segitiga.luas());
        System.out.println("Luas lingkaran = "+lingkaran.luas());
        System.out.println("keliling lingkaran ="+lingkaran.luas());
        
}
}
