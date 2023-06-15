/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

public class Ejecutor1 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numAsignaturas = 5;
        double costoAsig = 50.5;
        
        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre,
                apellido, identificacion, edad, numAsignaturas, costoAsig);
        
        estDistancia.calcularMatriculaDistancia();
        
        System.out.printf("%s\n", estDistancia);
        
        System.out.println("--------------");
        EstudianteDistancia estDistancia2 = new EstudianteDistancia(nombre,
                apellido, identificacion, edad);
        estDistancia2.establecerCostoAsignatura(100);
        estDistancia2.establecerNumeroAsginaturas(4);
        estDistancia2.calcularMatriculaDistancia();
        
        System.out.printf("%s\n", estDistancia2);
    }
}
