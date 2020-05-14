package com.javibryan.servicio;

public interface IServicioCentro {
    public void nuevoAlumno(int id, String nombre, Date fechaNac) throws ServicioCentroException;
    
    public void nuevoGrupo(int id, String nombre, boolean ciclos) throws ServicioCentroException;
    
    public void modificarAlumno(int id, String nombre, Date fechaNac) throws ServicioCentroException;
    
    public void modificarGrupo(int id, String nombre, boolean ciclos) throws ServicioCentroException;}
    
    public void eliminarAlumno(int id) throws ServicioCentroException;

    public void eliminarGrupoo(int id) throws ServicioCentroException;

    public List<Alumno> obtenerAlumnos();
    public List<Grupo> obtenerGrupos();