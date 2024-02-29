package cl.gobiernosantiago.fichatecnicaapi.entities;

import java.sql.Date;

import javax.persistence.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "proyectos")
public class Proyectos {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int     id;
    private String  codigo;
    private String  name;
    private Date    created;
    private Date    modified;
    private Long    costo_total;
    private int     anio_presupuesto;
    private Integer financiamiento_id;
    private String  observacion;
    private String  descripcion;
    /*private int    tipo_proyecto_id;
    private int    unidad_tecnica_id;
    private int    entidade_id;
    private int    etapa_id;
    private int    subsectore_id;
    private int    convenio_programacione_id;
    
    private int    es_regional;
    private int    solicitado_anio;
    
    
    private int    es_dosporciento;
    private int    fase_id;
    private int    estado_id;
    private int    sectore_id;
    private int    estado_core_id;
    private int    rate_id;
    private int    proyecto_user_id;
    private int    eliminado;
    private int    revision_preinversion;
    private int    proyecto_id_old;
    private int    expediente_id;
    private int    estado_situacione_id;
    private int    beneficiarios_hombres;
    private int    beneficiarios_mujeres;
    private int    beneficiarios_total;
    private int    proyecto_user_divac;
    private int    proyecto_user_juridico;
    private int    submodalidade_id;
    private int    descripcion_tecnica_bip;
    private int    transitorio_id;
    private int    avance_fisico;
    private int    es_provincial;
    private int    convenios;
    private int    contratos;
    private int    boletas;
    private int    fotos;
    private int    proyecto_con_convenio;
    private int    convenio_firma_alcalde;
    private int    convenio_firma_intendente;
    private int    situacion_contable;
    private int    estado_rendicion;
    private int    marco_presupuestario_id;
    private int    prog_gobierno_id;
    private int    prog_area_id;
    private int    prog_tipologia_id;
    private String prog_comuna_name;
    private int    programa_gobierno;*/
    private Integer  tipo_alcance_id = 0;
    //private int    ut_group_id;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	public Long getCosto_total() {
		return costo_total;
	}
	public void setCosto_total(Long costo_total) {
		this.costo_total = costo_total;
	}
	public int getAnio_presupuesto() {
		return anio_presupuesto;
	}
	public void setAnio_presupuesto(int anio_presupuesto) {
		this.anio_presupuesto = anio_presupuesto;
	}
	public Integer getFinanciamiento_id() {
		return financiamiento_id != null ? financiamiento_id.intValue() : 0;
	}
	public void setFinanciamiento_id(Integer financiamiento_id) {
		this.financiamiento_id = financiamiento_id;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getTipo_alcance_id() {
		return tipo_alcance_id != null ? tipo_alcance_id.intValue() : 0;
	}
	public void setTipo_alcance_id(Integer tipo_alcance_id) {
		this.tipo_alcance_id = tipo_alcance_id;
	}
	
    
    
    
    
}
