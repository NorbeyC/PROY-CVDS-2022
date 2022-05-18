package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Reservas;

import java.util.List;

public interface ReservaDAO {
    public void CrearReserva(Reservas reserva);

    public List<Reservas> ReservasId(int id);

    public List<Reservas> ReservasUsuario(int usuario);

    public List<Reservas> ReservasRecurso(int id);


}