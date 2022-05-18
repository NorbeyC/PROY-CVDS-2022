package edu.eci.cvds.managedbeans;

import com.google.inject.Inject;
import edu.eci.cvds.entities.*;
import edu.eci.cvds.services.ECILibraryServices;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@SuppressWarnings("deprecation")
@ManagedBean(name = "reservaBean")
@ApplicationScoped
public class ReservaBean extends BasePageBean {
	
	@Inject
	private ECILibraryServices ECILibraryServices;
	
	private int id;
    private int usuario;
    private int recurso;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    
    public void registrarReserva(){
		ECILibraryServices.CrearReserva(new Reservas(id,usuario, recurso,fechaInicio,fechaFin));
	}    
    
	public int getUsuario() {
		return usuario;
	}
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRecurso() {
		return recurso;
	}
	public void setRecurso(int recurso) {
		this.recurso = recurso;
	}
	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDateTime getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}
	
}
