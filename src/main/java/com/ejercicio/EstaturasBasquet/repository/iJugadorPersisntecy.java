
package com.ejercicio.EstaturasBasquet.repository;

import com.ejercicio.EstaturasBasquet.model.jugador;
import java.util.List;

public interface iJugadorPersisntecy {
      public void crearJugador(jugador ju);
      public double promedioEstatura();     
     public List<jugador> traerJugador();
    
}
