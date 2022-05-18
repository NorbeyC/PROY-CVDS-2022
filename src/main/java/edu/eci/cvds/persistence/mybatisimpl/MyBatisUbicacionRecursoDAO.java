package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.UbicacionRecurso;
import edu.eci.cvds.persistence.UbicacionRecursoDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.UbicacionRecursoMapper;

public class MyBatisUbicacionRecursoDAO implements UbicacionRecursoDAO{
    @Inject
    private UbicacionRecursoMapper ubicacionrecursoMapper;
    @Override
    public UbicacionRecurso edificio(int id) {
        return ubicacionrecursoMapper.edificio(id);
    }
}

