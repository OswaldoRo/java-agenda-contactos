package com.oswaldoproyec.service;

import com.oswaldoproyec.model.Contacto;

import java.util.List;
import java.util.ArrayList;

public class AgendaServicio{
    private List<Contacto>misContactos;

    public AgendaServicio(){
        misContactos = new ArrayList<>();
    }

    //Metodos del Crud
    //Crear Contacto
    public void crearContacto(Contacto contacto){
        misContactos.add(contacto);
    }
    //Read Buscar usuario por id for
    public Contacto obtenerContactoFor(int id){
        for(int i = 0; i < misContactos.size();i++){
            if(misContactos.get(i).getId() == id){
                return misContactos.get(i);
            }
        }
        return null;
    }
    //Read Buscar ususario por id forEach
    public Contacto obtenerContactoForEach(int id){
        for(Contacto c:misContactos){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
    //Read Buscar usuario por nombre for
    public Contacto obtenerContactoNombreFor(String nombre){
        for(int i = 0; i < misContactos.size();i++){
            if(misContactos.get(i).getNombre().equalsIgnoreCase(nombre)){
                return misContactos.get(i);
            }
        }
        return null;
    }
    //Read buscar usuario por nombre forEach
    public Contacto obtenerContactoNombreForEach(String nombre){
        for(Contacto c:misContactos){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return c;
            }
        }
        return null;
    }
    //Update Actualizar contacto por id
    public boolean actualizarContactoId(int id, String nuevoNombre, String nuevoTelefono, String nuevoCorreo){
        Contacto contactoExistente = obtenerContactoForEach(id);
        if(contactoExistente != null){
            contactoExistente.setNombre(nuevoNombre);
            contactoExistente.setCorreo(nuevoCorreo);
            contactoExistente.setTelefono(nuevoTelefono);
            return true;
        }
        return false;
    }
    //Delete Eliminar contacto por id
    public boolean eliminarContactoId(int id){
        Contacto contactoExistenteEliminar = obtenerContactoForEach(id);
        if(contactoExistenteEliminar != null){
            misContactos.remove(contactoExistenteEliminar);
            return true;
        }
        return false;
    }
    //Read Obtener todos los contactos
    public List<Contacto> ObtenerContacto(){
        return misContactos;
    }
}










