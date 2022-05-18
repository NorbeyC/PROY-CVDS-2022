package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Reservas;

import java.util.List;

public interface ReservaDAO {
    public void crearReserva(Reservas reserva);

    public List<Reservas> buscarReservasId(int id);

    public List<Reservas> buscarReservasUsuario(String usuario);

    public List<Reservas> reservasRecurso(int id);


}