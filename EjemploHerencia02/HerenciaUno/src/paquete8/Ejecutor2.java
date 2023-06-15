/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete8;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    
    public static void main(String[] args) {
        // 
        EstudiantePresencial pre = new EstudiantePresencial("René",
                "Elizalde", "202020", 38, 100.2, 4);
        pre.calcularMatriculaPresencial();
        
        System.out.printf("%s\n", pre);
        
    }
    
}
