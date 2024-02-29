package cl.gobiernosantiago.fichatecnicaapi.entities;

import java.util.Date;

import javax.persistence.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "prog_areas")
public class ProgAreas {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int    id;
	private String name;
	private Date   created;
	private Date   modified;
	private int    prog_gobierno_id;
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
	public int getProg_gobierno_id() {
		return prog_gobierno_id;
	}
	public void setProg_gobierno_id(int prog_gobierno_id) {
		this.prog_gobierno_id = prog_gobierno_id;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	
	

}
