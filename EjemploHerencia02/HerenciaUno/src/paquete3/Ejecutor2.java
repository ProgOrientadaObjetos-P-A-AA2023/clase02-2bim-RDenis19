/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        
        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre,
                apellido, identificacion, edad);
        
        estDistancia.establecerCostoAsignatura(50.5);
        estDistancia.establecerNumeroAsginaturas(5);
        estDistancia.calcularMatriculaDistancia();
        
        String cadenaFinal = String.format("%s", estDistancia);
        cadenaFinal = String.format("%s\n"
                + "Costo Asignatura: %.2f\n"
                + "Número de Asignaturas: %d\n"
                + "Total Matricula: %.2f\n",
                cadenaFinal,
                estDistancia.obtenerCostoAsignatura(),
                estDistancia.obtenerNumeroAsignaturas(),
                estDistancia.obtenerMatriculaDistancia());
        
        System.out.println(cadenaFinal);
        
        System.out.println("--------------------------");
        estDistancia.establecerApellidoEstudiante("Elizalde Solano");
        
        String cadenaFinal2 = String.format("%s", estDistancia);
        cadenaFinal2 = String.format("%s\n"
                + "Costo Asignatura: %.2f\n"
                + "Número de Asignaturas: %d\n"
                + "Total Matricula: %.2f\n",
                cadenaFinal2,
                estDistancia.obtenerCostoAsignatura(),
                estDistancia.obtenerNumeroAsignaturas(),
                estDistancia.obtenerMatriculaDistancia());
     
        System.out.printf("%s\n", cadenaFinal2);
    }
}
