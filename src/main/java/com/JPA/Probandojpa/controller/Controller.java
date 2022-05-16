

package com.JPA.Probandojpa.controller;

import com.JPA.Probandojpa.Service.IPersonaService;
import com.JPA.Probandojpa.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//Anotacion que solucionaria el problema con cors
@CrossOrigin(origins = "*")
@RestController
public class Controller {
    //Inyeccion de dependencia @Autowired
    @Autowired
    //Implementacion de la INTERFAZ
    private IPersonaService persoServ;
   
   
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
   
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersona(){
        return persoServ.VerPersonas();
        
    }
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
}