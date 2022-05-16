
package com.JPA.Probandojpa.Service;

import com.JPA.Probandojpa.model.Persona;
import java.util.List;

/*
    Aqui se declaran los metodos pero NO SE IMPLEMENTAN
    se implementan en la clase PersonaService
*/
public interface IPersonaService {
    
    //Metodo get
    public List<Persona> VerPersonas();
    //Metodo que crea una nueva
    public void crearPersona (Persona per);
    //Metodo para eliminar persona
    public void borrarPersona(long id);
    //Metodo para buscar una persona
    public Persona buscarPersona(long id);
    
}
