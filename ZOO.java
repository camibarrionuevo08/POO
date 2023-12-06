/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exoneracion;

/**
 *
 * @author cami
 */
public abstract class  ZOO {
    public String Nombre;
    public int Edad;
    String Numeroregistro;
    
    public ZOO(String Nombre, int edad,String Numeroregistro) {
        this.Nombre = Nombre;
        this.Edad = edad;
    }
  //  public double obtenerCedula() {
  //      return cedula;
   // }

    public void setNumeroregistro(String Numeroregistro) {
        this.Numeroregistro = Numeroregistro;
    }
    
    public abstract void comer();
    public abstract void Dormir();
    
    }
