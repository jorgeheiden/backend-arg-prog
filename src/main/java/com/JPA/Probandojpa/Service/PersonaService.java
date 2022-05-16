
package com.JPA.Probandojpa.Service;

//Esta clase IMPLEMENTA LA INTERFAZ(los metodos declarados): IPersonaService

import com.JPA.Probandojpa.Repository.PersonaRepository;
import com.JPA.Probandojpa.model.Persona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Anotacion que indica que esta es la capa de Servicio
@Service
public class PersonaService implements IPersonaService{
    //Notation que permite hacer una INYECCION DE DEPENDENCIAS
    @Autowired
    //crear instancia con el repositorio de personas
    public PersonaRepository persoRepo;
    
    /*  Se implementa la logica de negocios para cada uno de los 
        siguientes metodos
    */
    @Override
    public List<Persona> VerPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
    
    
}
