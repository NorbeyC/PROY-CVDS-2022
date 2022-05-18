package edu.eci.cvds.persistence.mybatisimpl.mappers;


import edu.eci.cvds.entities.Reservas;
import org.apache.ibatis.annotations.Param;

import java.rmi.server.RemoteServer;
import java.util.List;
import java.util.Map;

public interface ReservaMapper {

    public void crearReservas(@Param("reserva") Reservas reservas);

    public List<Reservas> ReservasId(@Param("id") int id);

    public List<Reservas> ReservasUsuario(@Param("usuario") int usuario);


    public List<Reservas> ReservasRecurso(@Param("id") int id);


}