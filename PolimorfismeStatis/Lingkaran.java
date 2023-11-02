/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorfismeStatis;

/**
 *
 * @author X1
 */
public class Lingkaran {
    //mengihitung luas menggunakan jari jari
    
    float luas(float jarijari){
       return (float) (Math.PI *jarijari*jarijari);
}
    double luas(double diameter){
        return(Math.PI*diameter*1/4);
    }
    

    public static void main(String[] args) {
        Lingkaran L= new Lingkaran();
        float jari2 = 10;
        double d = 20;
        System.out.println("Luas lingkaran dengan jari jari = "+L.luas(jari2));
        System.out.println("Luas lingkaran dengan diameter = "+L.luas(d));
    }
}
