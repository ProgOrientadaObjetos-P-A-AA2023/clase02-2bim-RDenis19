/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete9;

import java.util.ArrayList;

public class Ejecutor1 {

    public static void main(String[] args) {

        ArrayList<EstudianteDistancia> listaDistancia = new ArrayList<>();
        
        EstudianteDistancia e1 = new EstudianteDistancia("Mario", "Mills", "212233",
                23, 1, 100.2);
        EstudianteDistancia e2 = new EstudianteDistancia("Joseph", "White", "212234",
                24, 5, 100.2); 
        EstudianteDistancia e3 = new EstudianteDistancia("Catherine", "Reyes", "212235",
                25, 8, 100.2);
        
        listaDistancia.add(e1);
        listaDistancia.add(e2);
        listaDistancia.add(e3);
        
        for (int i = 0; i < listaDistancia.size(); i++) {
            listaDistancia.get(i).calcularMatriculaDistancia();
        }
        
        ReporteDistancia rd = new ReporteDistancia("Reporte Distancia", 
                "Derecho", "Sexto");
        rd.establecerLista(listaDistancia);
        rd.establecerTotalMatriculasDistancia();
        
        System.out.println("----------------------");
        System.out.println(rd);
        
    }
}
