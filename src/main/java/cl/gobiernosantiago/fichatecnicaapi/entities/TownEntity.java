package cl.gobiernosantiago.fichatecnicaapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "comunas")
public class TownEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int     id;
	private String  name;
	private Integer provincia_id;
	
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
	public int getProvincia_id() {
		return provincia_id != null ? provincia_id.intValue() : 0;
	}
	public void setProvincia_id(int provincia_id) {
		this.provincia_id = provincia_id;
	}
	
	
}
