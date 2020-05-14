package com.javibryan.centro.modelos;

import com.javibryan.centros.Utilidades;
import com.javibryan.servicio.ServicioCentro;
import com.javibryan.servicio.ServicioCentroException;
import java.util.Date;
import java.util.Scanner;

public class Alumno {
    private void nuevoAlumno() {
        String entrada;
        int numEntero = -1;
        int id = 0;
        String nombre;
        Date fechaNac = null;

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
        System.out.println("Introduzca el nombre del alumno (0 salir)");
        Scanner sc = new Scanner (System.in);
        entrada = sc.nextLine();
        if (entrada.equals("0")) {
            //salimos
            return;
        }
        nombre = entrada;
        
        // fecha de nacimiento del alumno
        Date f = null;
        boolean salir = false;
        do {
            System.out.println("Introduzca la fecha de nacimiento (dd/MM/yyyy)"
                + "0 para salire -1 dejar campo vacio");
            sc = new Scanner(System.in);
            entrada = sc.nextLine();
            if (entrada.equals("0")) {
                //salimos de la funcion
                return;
            }
            if (entrada.equals("-1")) {
                salir = true; //salimos del bucle
            } else {
                f = Utilidades.obtenerFecha(entrada);
                if (f == null) {
                    System.out.println("El formato de fecha no valido");
                } else {
                    fechaNac = f;
                    salir = true;
                }
            }
        } while (!salir);
        // ya lo tenemos todo
        
        //llamamos a nuestra clase singleton solo hay una instancia de esa clase
        // es donde se guardan las listas con alumnos y grupos
        try {
            ServicioCentro.getServicio().nuevoAlumno(id, nombre, fechaNac);
        } catch (ServicioCentroException sce){
            System.out.println("No se pudo introducir el alumno: "+ sce.getMessage());
        }
    }
}
