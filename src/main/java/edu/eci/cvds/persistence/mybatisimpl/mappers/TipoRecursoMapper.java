package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.TipoRecurso;
import org.apache.ibatis.annotations.Param;

public interface TipoRecursoMapper {

    public TipoRecurso tipo(@Param("id") int id);

}
