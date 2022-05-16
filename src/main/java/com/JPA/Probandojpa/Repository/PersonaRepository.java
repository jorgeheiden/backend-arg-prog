
package com.JPA.Probandojpa.Repository;



import com.JPA.Probandojpa.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Anotacion que indica que esta interface es el Repositorio @Repository
@Repository
/*  -Codigo que indica que este repositorio utilizara JPA
    para pode acceder a sus METODOS
    -JpaRepository: es una interfaz
    -<Persona, Long> : Objeto que se va a persistir: Persona y tipo de dato
    del Id de esa clase
*/
public interface PersonaRepository extends JpaRepository  <Persona, Long>{
    
}
