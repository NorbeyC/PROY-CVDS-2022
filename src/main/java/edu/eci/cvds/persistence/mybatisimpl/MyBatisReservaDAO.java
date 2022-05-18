package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Reservas;
import edu.eci.cvds.persistence.ReservaDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ReservaMapper;

import java.util.List;

public class MyBatisReservaDAO implements ReservaDAO {

    @Inject
    ReservaMapper reservaMapper;

    @Override
    public void crearReserva(Reservas reserva)  {

        reservaMapper.crearReserva(reserva);


    }

    @Override
    public List<Reservas> buscarReservasId(int id)  {

        return reservaMapper.buscarReservasId(id);

    }

    @Override
    public List<Reservas> buscarReservasUsuario(String usuario)  {

        return reservaMapper.buscarReservasUsuario(usuario);

    }

    @Override
    public List<Reservas> reservasRecurso(int id)  {

        return reservaMapper.reservasRecurso(id);

    }






}

