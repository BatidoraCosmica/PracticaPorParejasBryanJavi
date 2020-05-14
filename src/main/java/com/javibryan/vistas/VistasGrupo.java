package com.javibryan.vistas;

public class VistasGrupo {
     int opcion = 1;
    while (opcion != 0) {
        System.out.println("Introduzca la opción");
        System.out.println("0.Salir");
        System.out.println("1.Nuevo grupo");
        System.out.println("2.Modificar grupo");
        System.out.println("3.Asignar alumno a grupo");
        System.out.println("4.Eliminar grupo");
        System.out.println("5.Ver todos los alumnos");

        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        if(!Utilidades.esEntero(entrada)) {
            opcion = -1;
        } else {
            opcion = Integer.parseInt(entrada);
        }
        if (opcion == 1) {
            this.nuevoGrupo();
        }
        if (opcion == 2) {
            this.nuevoGrupo();
        }
        if (opcion = 3) {
            this.nuevoGrupo();    
        }
        if (opcion = 4) {
            this.nuevoGrupo();
        }
        if (opcion = 5) {
            this.nuevoGrupo();
        }
    }
}

