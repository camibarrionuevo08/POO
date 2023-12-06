/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exoneracion;

/**
 *
 * @author cami
 */
public class visitante extends Persona{
     
    public String Numerocarnet;

    public visitante(String nombre, int edad, String cedula,String Numerocarnet) {
        super(nombre, edad, cedula);
        this.Numerocarnet = Numerocarnet;
    }
    
    /**
     *
     */


    @Override
    public void comer() {
           System.out.println("El visitante "+this.Nombre+" esta comiendo");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     
    }

    @Override
    public void Dormir() {
           System.out.println("El visitante "+this.Nombre+" esta dormiendo");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }
       
        public void comprar(){
               System.out.println("El visitante "+this.Nombre+" esta comprando");
        System.out.println("El visitante"+ this.Nombre + "esta comprando");
    }
    }
