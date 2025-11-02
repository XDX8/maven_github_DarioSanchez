package org.example;
import com.google.gson.Gson;

public class Datos {
    private String nombre;

    public Datos(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Datos persona = new Datos("Carlos");
        Gson gson = new Gson();

        // Convertir el objeto a formato JSON
        String json = gson.toJson(persona);
        System.out.println("Objeto en formato JSON:");
        System.out.println(json);
    }
}
