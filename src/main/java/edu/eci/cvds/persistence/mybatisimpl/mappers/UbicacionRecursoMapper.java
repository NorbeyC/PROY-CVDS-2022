package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.UbicacionRecurso;
import org.apache.ibatis.annotations.Param;

public interface UbicacionRecursoMapper {

    public UbicacionRecurso edificio(@Param("id") int id);

}
