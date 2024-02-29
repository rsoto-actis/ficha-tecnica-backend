package cl.gobiernosantiago.fichatecnicaapi.entities;

import java.util.Date;

import javax.persistence.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "prog_tipologias")
public class ProgTipologias {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int    id;
	private String name;
	private Date   created;
	private Date   modified;
	private int    prog_area_id;
	private int    orden;
	private int    enabled;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	public int getProg_area_id() {
		return prog_area_id;
	}
	public void setProg_area_id(int prog_area_id) {
		this.prog_area_id = prog_area_id;
	}
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
}
