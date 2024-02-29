package cl.gobiernosantiago.fichatecnicaapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gobiernosantiago.fichatecnicaapi.entities.Proyectos;
import cl.gobiernosantiago.fichatecnicaapi.repositories.ProyectoRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/proyectos")
@Tag(name = "Proyectos")
public class ProyectoController {
    
    private final ProyectoRepository pr;
    
    @Autowired
    public ProyectoController(ProyectoRepository pr) {
        this.pr = pr;
    }
    
    @Operation(summary = "Obtener todos los proyectos", description = "Obtener todos los proyectos")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved"), 
        @ApiResponse(responseCode = "404", description = "Not found - The product was not found")
    })
    @GetMapping("/all")
    public List<Proyectos> getAllProyectos() {
        return pr.findAll();
    }

}
