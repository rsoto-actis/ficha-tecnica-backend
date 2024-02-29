package cl.gobiernosantiago.fichatecnicaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.gobiernosantiago.fichatecnicaapi.entities.Proyectos;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyectos, Integer>{
	
}
