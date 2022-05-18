package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Usuario;

public interface UsuarioMapper {

	public String getTipo(@Param("correo") String correo);
	
	public List<Usuario> validarUsuario(@Param("userName") String userName, @Param("userPassword") String userPassword);
}
