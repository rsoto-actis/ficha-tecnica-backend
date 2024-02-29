package cl.gobiernosantiago.fichatecnicaapi.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FichaTecnicaData {
	
	@Id
	private int    id;
	private int    costo_total;
	private int    tipo_alcance_id;
	private int    comuna_id;
	private int    alcance_id;
	private int    area_id;
	private int    tip_id;
	private String tip_name;
	private String area_name;
	private String name;
	private String comuna_name;	
	private String descripcion;
	private String observacion;
	private String alcance_nombre;
	private String alcance_code;
	private Date   created;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCosto_total() {
		return costo_total;
	}
	public void setCosto_total(int costo_total) {
		this.costo_total = costo_total;
	}
	public int getTipo_alcance_id() {
		return tipo_alcance_id;
	}
	public void setTipo_alcance_id(int tipo_alcance_id) {
		this.tipo_alcance_id = tipo_alcance_id;
	}
	public int getComuna_id() {
		return comuna_id;
	}
	public void setComuna_id(int comuna_id) {
		this.comuna_id = comuna_id;
	}
	public int getAlcance_id() {
		return alcance_id;
	}
	public void setAlcance_id(int alcance_id) {
		this.alcance_id = alcance_id;
	}
	public int getArea_id() {
		return area_id;
	}
	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}
	public int getTip_id() {
		return tip_id;
	}
	public void setTip_id(int tip_id) {
		this.tip_id = tip_id;
	}
	public String getTip_name() {
		return tip_name;
	}
	public void setTip_name(String tip_name) {
		this.tip_name = tip_name;
	}
	public String getArea_name() {
		return area_name;
	}
	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComuna_name() {
		return comuna_name;
	}
	public void setComuna_name(String comuna_name) {
		this.comuna_name = comuna_name;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getAlcance_nombre() {
		return alcance_nombre;
	}
	public void setAlcance_nombre(String alcance_nombre) {
		this.alcance_nombre = alcance_nombre;
	}
	public String getAlcance_code() {
		return alcance_code;
	}
	public void setAlcance_code(String alcance_code) {
		this.alcance_code = alcance_code;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	
}
