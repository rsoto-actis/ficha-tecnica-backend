package cl.gobiernosantiago.fichatecnica.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.gobiernosantiago.fichatecnicaapi.entities.FichaTecnicaData;

@Repository
public interface GeneralDAO extends JpaRepository<FichaTecnicaData, Integer>{


}
