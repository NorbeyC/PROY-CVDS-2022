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
    public void CrearReserva(Reservas reservas)  {

        reservaMapper.crearReservas(reservas);


    }

    @Override
    public List<Reservas> ReservasId(int id)  {

        return reservaMapper.ReservasId(id);

    }

    @Override
    public List<Reservas> ReservasUsuario(String usuario)  {

        return reservaMapper.ReservasUsuario(usuario);

    }

    @Override
    public List<Reservas> ReservasRecurso(int id)  {

        return reservaMapper.ReservasRecurso(id);

    }






}

