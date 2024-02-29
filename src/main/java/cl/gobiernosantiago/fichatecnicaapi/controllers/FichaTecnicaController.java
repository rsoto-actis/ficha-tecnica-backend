package cl.gobiernosantiago.fichatecnicaapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gobiernosantiago.fichatecnicaapi.entities.FilterDTO;
import cl.gobiernosantiago.fichatecnicaapi.entities.TownCategory;
import cl.gobiernosantiago.fichatecnicaapi.entities.TownCategoryEntity;
import cl.gobiernosantiago.fichatecnicaapi.entities.TownEntity;
import cl.gobiernosantiago.fichatecnicaapi.jwt.VerifyJwt;
import cl.gobiernosantiago.fichatecnicaapi.repositories.TownCategoryRepository;
import cl.gobiernosantiago.fichatecnicaapi.repositories.TownRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;


@CrossOrigin( origins = "*")
@RestController
@RequestMapping("/api/ficha-tecnica")
@Tag(name = "Ficha técnica")
public class FichaTecnicaController {
	
	private final TownRepository tr;
	
	private final TownCategoryRepository tcr;
	
	private VerifyJwt verify = new VerifyJwt(); 
		
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public FichaTecnicaController(TownRepository tr, TownCategoryRepository tcr) {
		this.tr  = tr;
		this.tcr = tcr;
	}
	
	
	@Operation(summary = "Obtener los datos de la ficha técnica", description = "Obtener los datos de la ficha técnica")
	@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved"), 
        @ApiResponse(responseCode = "404", description = "Not found - The product was not found")
    })
	
	@PostMapping(value = "/", consumes = "application/json", produces = "application/json")
	public List getFichaTecnicaData(HttpServletRequest request, @RequestBody FilterDTO json){
		try {
			Boolean continua = verify.validateJwt(request.getHeader("authorization"));
	        
	        if ( continua ) {
	        	List resultados = jdbcTemplate.queryForList("CALL get_ficha_tecnica_data('" + json.getCategory() + "',"
						+ "'" + json.getSubcategory() + "',"
					    + "'" + json.getInit_date()   + "',"
					    + "'" + json.getEnd_date()    + "',"
					    + "'" + json.getType()        + "',"
					    + ""  + json.getTown()        + ","
					    + ""  + json.getProv()        + ")");
				
				return resultados;
	        }
	        else {
	        	return null;
	        }	
		}
		catch(Exception e) {
			return null;
		}		
	}
	
	
	@Operation(summary = "Obtener todas las comunas", description = "Obtiene todas las comunas")
	@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved"), 
        @ApiResponse(responseCode = "404", description = "Not found - The product was not found")
    })
	@GetMapping("/towns")
	public List getAllTowns(HttpServletRequest request) {    
		try {
			Boolean continua = verify.validateJwt(request.getHeader("authorization"));
	        
	        if ( continua ) {
	        	return tr.findAllByOrderByNameAsc();
	        }
	        else {
	        	return null;
	        }
		}
		catch(Exception e) {
			return null;
		}
	}

	
	/*@PostMapping(value = "/towns-category", consumes = "application/json", produces = "application/json")
	public TownCategoryEntity insertTownsCategory(
			HttpServletRequest request,
			@RequestBody TownCategory json){
		
		try {
			Boolean continua = verify.validateJwt(request.getHeader("authorization"));
	        
	        if ( continua ) {
	        	List<TownEntity> auxList = tr.findTownByName(json.getTown_name());
				
				if ( !auxList.isEmpty() ) {
					
					List<TownCategoryEntity> tceList = tcr.findTownByName(json.getTown_name());
					
					try {
						System.out.println(tceList.get(0).getComuna_name());
						return tceList.get(0);
					}
					catch(Exception e) {
						TownCategoryEntity tc = new TownCategoryEntity();
						
						tc.setName(json.getCategory());
						tc.setComuna_id(auxList.get(0).getId());
						tc.setComuna_name(auxList.get(0).getName());
						
						tcr.save(tc);
					}
					
				}
				else {
					return null;
				}
	        }
	        else {
	        	return null;
	        }
				
		}
		catch(Exception e) {
			System.out.println(e);
		}

		return null;
	}*/

}
