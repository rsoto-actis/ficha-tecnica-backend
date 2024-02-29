package cl.gobiernosantiago.fichatecnicaapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cl.gobiernosantiago.fichatecnicaapi.entities.ProgTipologias;

public interface ProgTipologiasRepository extends JpaRepository<ProgTipologias, Integer>{
	
	@Query(value = "SELECT * FROM prog_tipologias WHERE prog_area_id = :areaId", nativeQuery = true)
	List<ProgTipologias> findSubCategoryByAreaId(@Param("areaId") int areaId);
	
	
}
