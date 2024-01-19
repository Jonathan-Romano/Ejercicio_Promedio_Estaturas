
package com.ejercicio.EstaturasBasquet.controller;

import com.ejercicio.EstaturasBasquet.model.jugador;
import com.ejercicio.EstaturasBasquet.repository.iJugadorPersisntecy;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jugadoresController {
    
    @Autowired
    private iJugadorPersisntecy jugadoresPersistency;
    
    @PostMapping("/Crear")
    public String crearJugador(@RequestBody jugador jugado){

        
        jugadoresPersistency.crearJugador(jugado);
        
        return "promedio de estatura: " + jugadoresPersistency.promedioEstatura();
    }
    
    @GetMapping("/jugadores")
    public List<jugador> traerJugadores(){
    
    return jugadoresPersistency.traerJugador();
    }
    
    
}

/*

{
        "id": 2,
        "dni": 45123412,
        "nombre": "Fde",
        "apellido": "riggy",
        "edad": 22,
        "peso": 67.3,
        "estatura": 80.1
    },
    {
        "id": 3,
        "dni": 2321231,
        "nombre": "Jonathan",
        "apellido": "Web developper Junior",
        "edad": 24,
        "peso": 65.3,
        "estatura": 71.1
    },
    {
        "id": 4,
        "dni": 2321231,
        "nombre": "Jonathan",
        "apellido": "Web developper Junior",
        "edad": 24,
        "peso": 65.3,
        "estatura": 77.1
    },
    {
        "id": 5,
        "dni": 2321231,
        "nombre": "Jonathan",
        "apellido": "Web developper Junior",
        "edad": 24,
        "peso": 65.3,
        "estatura": 92.1
    }
*/