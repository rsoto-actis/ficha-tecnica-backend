package cl.gobiernosantiago.fichatecnicaapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.gobiernosantiago.fichatecnicaapi.entities.TownEntity;

public interface TownRepository extends JpaRepository<TownEntity, Integer>{
	
	@Query(value = "SELECT * FROM comunas WHERE UPPER(name) LIKE UPPER(concat('%', ?1, '%')) ORDER BY name ASC", nativeQuery = true)
	List<TownEntity> findTownByName(String name);
	
	List<TownEntity> findAllByOrderByNameAsc();
}
