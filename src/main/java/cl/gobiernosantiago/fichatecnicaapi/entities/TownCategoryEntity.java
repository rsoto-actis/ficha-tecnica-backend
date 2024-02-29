package cl.gobiernosantiago.fichatecnicaapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "comuna_categoria")
public class TownCategoryEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int    id;
	private String name;
	private int    comuna_id;
	private String comuna_name;
	
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
	public int getComuna_id() {
		return comuna_id;
	}
	public void setComuna_id(int comuna_id) {
		this.comuna_id = comuna_id;
	}
	public String getComuna_name() {
		return comuna_name;
	}
	public void setComuna_name(String comuna_name) {
		this.comuna_name = comuna_name;
	}
	
	
}
