
package com.ejercicio.EstaturasBasquet.repository;

import com.ejercicio.EstaturasBasquet.model.jugador;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class jugadorPersistency implements iJugadorPersisntecy {
  
List<jugador> jugadores = new ArrayList(); 
    
   @Override
   public void crearJugador(jugador ju){
    jugadores.add(ju);
    }   
   
@Override
   public double promedioEstatura(){
    double promedioEstatura = 0.0;
    int cantJugadores = 0;
    for (jugador jugador : jugadores) {      
        promedioEstatura = promedioEstatura + jugador.getEstatura();
        cantJugadores++;       
    }
    
    return promedioEstatura / cantJugadores;
   }

    @Override
    public List<jugador> traerJugador() {
       return jugadores;
    }
   
   
    
    
}
