public class gato {
    String raza, nombre;
    int edad;
    public gato(String raza,String nombre, int edad){
        this.raza=raza;
        this.nombre=nombre;
        this.edad=edad;
    }
     //metodo
     public void dormir(){
        System.out.println(this.raza + this.nombre +" Empezo a dormir");

    }
    public void comer(){
        System.out.println(this.raza + this.nombre +" Empezo a comer");
    }

    public static void main(String[] args) {
        gato p1 =new gato("siames"," juan",2);//instancia=dar vida
        p1.comer();
        p1.dormir();
    }

}