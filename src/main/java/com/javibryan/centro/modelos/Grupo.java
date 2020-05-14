package com.javibryan.centro.modelos;

import com.javibryan.centros.Utilidades;
import com.javibryan.servicio.ServicioCentro;
import com.javibryan.servicio.ServicioCentroException;
import java.util.Date;
import java.util.Scanner;

public class Grupo {
    private void nuevoGrupo() {
        String entrada;
        int numEntero = -1;
        int id = 0;
        String nombre;

        //id del alumno
        do {
        System.out.println("Introduzca el id. (0 salir)");
        Scanner sc = new Scanner(System.in);
        entrada = sc.nextLine();
            if (!Utilidades.esEntero(entrada)) {
                System.out.println("El id debe ser numérico");
            } 
            else {
                numEntero = Integer.parseInt(entrada);
                if (numEntero == 0) {
                    //salimos por si no queremos hacer todo
                    return;
                }
                else {
                    id = numEntero;
                }
            }
        } while (!Utilidades.esEntero(entrada));
        // nombre del alumno
        System.out.println("Introduzca el nombre del grupo (0 salir)");
        Scanner sc = new Scanner (System.in);
        entrada = sc.nextLine();
        if (entrada.equals("0")) {
            //salimos
            return;
        }
        nombre = entrada;
        
        // ya lo tenemos todo
        
        //llamamos a nuestra clase singleton solo hay una instancia de esa clase
        // es donde se guardan las listas con alumnos y grupos
        try {
            ServicioCentro.getServicio().nuevoGrupo(id, nombre);
        } catch (ServicioCentroException sce){
            System.out.println("No se pudo introducir el alumno: "+ sce.getMessage());
        }
    }
}
