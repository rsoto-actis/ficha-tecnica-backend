package cl.gobiernosantiago.fichatecnicaapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.gobiernosantiago.fichatecnicaapi.entities.ProgAreas;
import cl.gobiernosantiago.fichatecnicaapi.entities.ProgTipologias;
import cl.gobiernosantiago.fichatecnicaapi.jwt.VerifyJwt;
import cl.gobiernosantiago.fichatecnicaapi.repositories.ProgAreasRepository;
import cl.gobiernosantiago.fichatecnicaapi.repositories.ProgTipologiasRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/items")
@Tag(name = "Items")
public class ItemsController {
	
	private final ProgTipologiasRepository ptr;
	
	private final ProgAreasRepository par;
	
	private VerifyJwt verify = new VerifyJwt(); 
    
    @Autowired
    public ItemsController(ProgTipologiasRepository pr, ProgAreasRepository par) {
        this.ptr = pr;
        this.par= par;
    }
    
    @Operation(summary = "Obtener todas las areas", description = "Obtiene todas las areas")
	@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved"), 
        @ApiResponse(responseCode = "404", description = "Not found - The product was not found")
    })
    @GetMapping("/all")
    public List<ProgAreas> getAllAreas(HttpServletRequest request) {
    	try {
			Boolean continua = verify.validateJwt(request.getHeader("authorization"));
	        
	        if ( continua ) {
	        	return par.findAll();
	        }
	        else {
	        	return null;
	        }
    	}
    	catch(Exception e) {
    		return null;
    	}
    }
    
    @Operation(summary = "Obtener sub categorías por área id (cat_id)", description = "Obtener sub categorías por área id (cat_id)")
	@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved"), 
        @ApiResponse(responseCode = "404", description = "Not found - The product was not found")
    })
    @GetMapping("/sub-item/{cat_id}")
    public List<ProgTipologias> getSubCategories(HttpServletRequest request,
    		@Parameter(description = "Id de la categoría", example = "1", required=true) @PathVariable("cat_id") int cat_id) {
    	System.out.println(cat_id);
    	try {
			Boolean continua = verify.validateJwt(request.getHeader("authorization"));
	        
	        if ( continua ) {
	        	return ptr.findSubCategoryByAreaId(cat_id);
	        }
	        else {
	        	return null;
	        }
    	}
    	catch(Exception e) {
    		return null;
    	} 
    }
    
    

}
