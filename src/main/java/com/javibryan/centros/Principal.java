package com.javibryan.centros;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        VistasAlumno va = new VistasAlumno();
        VistasGrupo vg = new VistasGrupo();
        int opcion = -1; //opcion -1 indica opcion incorrecta
        while (opcion !=0) {
            System.out.println("Introduzca la opción");
            System.out.println("0.Salir");
            System.out.println("1.Gestión Grupos");
            System.out.println("2.Gestión de Alumnos");

            Scanner sc = new Scanner(System.in);
            String entrada = sc.nextLine();
            // comprobamos número válido
            if (!Utilidades.esEntero(entrada)) {
                opcion = -1;
            } else {
                opcion = Integer.parseInt(entrada);
            }
            if (opcion >= 3 || opcion < 0) {
                //Comprobamos número en rango
                System.out.println("Opción No Valida");
                opcion = -1;
            }
            if (opcion==2) {
                va.menuAlumno();
            }
            // to do opcion 1
        }
    }
}
