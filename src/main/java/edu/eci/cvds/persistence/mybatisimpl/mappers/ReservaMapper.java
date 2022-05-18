package edu.eci.cvds.persistence.mybatisimpl.mappers;


import edu.eci.cvds.entities.Reservas;
import org.apache.ibatis.annotations.Param;

import java.rmi.server.RemoteServer;
import java.util.List;
import java.util.Map;

public interface ReservaMapper {

    public void crearReserva(@Param("reserva") Reservas reserva);

    public List<Reservas> buscarReservasId(@Param("id") int id);

    public List<Reservas> buscarReservasUsuario(@Param("usuario") String usuario);


    public List<Reservas> reservasRecurso(@Param("id") int id);


}