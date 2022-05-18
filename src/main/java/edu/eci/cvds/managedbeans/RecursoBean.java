package edu.eci.cvds.managedbeans;

import com.google.inject.Inject;
import edu.eci.cvds.entities.*;
import edu.eci.cvds.services.ECILibraryServices;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.Time;
import java.time.LocalTime;
import java.util.List;

@SuppressWarnings("deprecation")
@ManagedBean(name = "recursoBean")
@ApplicationScoped
public class RecursoBean extends BasePageBean {
	
	
	@Inject
	private ECILibraryServices ECILibraryServices;
	private List<Recurso> recursosBuscados;
	
	private int categoria;
	private Recurso selection;
	private int id;
    private String nombre;
    private int capacidad;
    private Time disponibilidadInicio;
    private Time disponibilidadfin;
    private int idubicacionrecurso;
    private int idtiporecurso;
	

	public List<Recurso> getRecurso() {
		if(categoria == 5) {
			recursosBuscados = ECILibraryServices.listarRecursos();
		}else {
			recursosBuscados = ECILibraryServices.listarCategorias(categoria);
		}
		return recursosBuscados;
	}

	public void registrarRecurso(){
		ECILibraryServices.registrarRecurso(new Recurso(id,nombre,capacidad,disponibilidadInicio, disponibilidadfin, idtiporecurso, idubicacionrecurso));

	}
	
	public int getCategoria() {
		return categoria;
	}

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
	
	public List<Recurso> getRecursoBuscado() {
		return recursosBuscados;
	}
	
	public Recurso getSelection() {
		return selection;
	}

    public void setSelection(Recurso selection) {
        this.selection = selection;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Time getDisponibilidadInicio() {
		return disponibilidadInicio;
	}

	public void setDisponibilidadInicio(Time disponibilidadInicio) {
		this.disponibilidadInicio = disponibilidadInicio;
	}

	public Time getDisponibilidadfin() {
		return disponibilidadfin;
	}

	public void setDisponibilidadfin(Time disponibilidadfin) {
		this.disponibilidadfin = disponibilidadfin;
	}

	public int getIdubicacionrecurso() {
		return idubicacionrecurso;
	}

	public void setIdubicacionrecurso(int idubicacionrecurso) {
		this.idubicacionrecurso = idubicacionrecurso;
	}

	public int getIdtiporecurso() {
		return idtiporecurso;
	}

	public void setIdtiporecurso(int idtiporecurso) {
		this.idtiporecurso = idtiporecurso;
	}
}
