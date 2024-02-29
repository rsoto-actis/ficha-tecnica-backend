package cl.gobiernosantiago.fichatecnicaapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.gobiernosantiago.fichatecnicaapi.entities.TownCategoryEntity;

public interface TownCategoryRepository extends JpaRepository<TownCategoryEntity, Integer>{
	
	@Query(value = "SELECT * FROM comuna_categoria WHERE UPPER(comuna_name) LIKE UPPER(concat('%', ?1, '%'))", nativeQuery = true)
    List<TownCategoryEntity> findTownByName(String name);
}
