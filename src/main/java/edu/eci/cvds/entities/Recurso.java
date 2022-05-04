package edu.eci.cvds.entities;

import java.sql.Time;

/**
 * Clase que representaa un Recurso
 */
public class Recurso {

	private int id;
	private String nombre;
	private int capacidad;
	private Time disponibilidadInicio;
	private Time disponibilidadFin;

	public Recurso() {
		super();
	}

	public Recurso(int id, String nombre, int capacidad, Time disponibilidadInicio, Time disponibilidadFin) {

		this.id = id;
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.disponibilidadInicio = disponibilidadInicio;
		this.disponibilidadFin = disponibilidadFin;

	}

	public Time getDisponibilidadFin() {
		return disponibilidadFin;
	}

	public void setDisponibilidadFin(Time disponibilidadFin) {
		this.disponibilidadFin = disponibilidadFin;
	}

	public Time getDisponibilidadInicio() {
		return disponibilidadInicio;
	}

	public void setDisponibilidadInicio(Time disponibilidadInicio) {
		this.disponibilidadInicio = disponibilidadInicio;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
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
}
