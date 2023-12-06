/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exoneracion;

/**
 *
 * @author cami
 */
public class Leon extends ZOO{
    public String vacuna;

    public Leon(String Nombre, int edad, String Numeroregistro,String vacuna) {
        super(Nombre, edad, Numeroregistro);
        this.vacuna=vacuna;
        
    }


    @Override
    public void comer() {
        System.out.println(this.Nombre+" esta comiendo");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Dormir() {
        System.out.println(this.Nombre+" esta durmiendo");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void rugir(){
        System.out.println(this.Nombre+" esta rugiendo");
    }
    public void cazar(){
        System.out.println(this.Nombre+" esta cazando");
    }
}
