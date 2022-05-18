package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.TipoRecurso;
import edu.eci.cvds.persistence.TipoRecursoDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.TipoRecursoMapper;

public class MyBatisTipoRecursoDAO implements TipoRecursoDAO {

    @Inject
    TipoRecursoMapper tiporecursoMapper;

    @Override
    public TipoRecurso tipo(int id) {
        return tiporecursoMapper.tipo(id);
    }
}