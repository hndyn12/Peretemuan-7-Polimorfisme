/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPolimorfisDinamis;

/**
 *
 * @author X1
 */
public class Buahnaga extends Buah{
    String warna;
    String rasa;

    public Buahnaga (String warna, String rasa){
        this.warna = warna;
        this.rasa=rasa;
    }
    
    @Override
    void rasa(){
         System.out.println("Rasa Buah naga "+rasa);
    }
    @Override
    void warna(){
        System.out.println("Warna Buah naga "+warna);
    }
}
