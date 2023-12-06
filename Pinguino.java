/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exoneracion;

/**
 *
 * @author katy1
 */
public class Pinguino extends ZOO {

    public Pinguino(String Nombre, int edad, String Numeroregistro) {
        super(Nombre, edad, Numeroregistro);
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
    public void nadar(){
        System.out.println(this.Nombre+" esta nadando");
    }
    public void pezcar(){
        System.out.println(this.Nombre+" esta nadando");
    }
}