package cl.gobiernosantiago.fichatecnicaapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/jwt")
@Tag(name = "Json Web Token")
public class JwtController {

    @Operation(summary = "Obtener token único", description = "Obtener token único")
	@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved"), 
        @ApiResponse(responseCode = "404", description = "Not found - The product was not found")
    })
	@GetMapping("")
	public String getAllTowns() {    
		return "{\n \"token\" : \"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkdvcmUtUm0iLCJzb2Z0d2FyZSI6IkZpY2hhVGVjbmljYSJ9.5e8ZOKO0GYL-NBIXhZR_3FBCfUkm8Pb9d8ELqB4rx-Q\" \n}";
	}
}