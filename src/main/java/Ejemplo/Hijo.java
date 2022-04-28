package Ejemplo;

public class Hijo extends Padre{
    private int edad;
    private String nombre;

    public Hijo(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    public void mostrar_datos_personales(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Edad: " +edad);
        System.out.println("Altura: " +altura);
        System.out.println("Contestura Fisica: " +contestura_fisica);
        System.out.println("Ojos: " +ojos);
        System.out.println("Piel: " +piel);
        System.out.println("Cabello: " +cabello);
    }
    
}
