package cl.gobiernosantiago.fichatecnicaapi.jwt;

import java.util.Base64;

import org.json.JSONObject;

public class VerifyJwt {
	
	public Boolean validateJwt(String token) {
		Boolean flag = true;
		token = token.replace("Bearer ", "");
		String[] chunks = token.split("\\.");
		
		JSONObject header = new JSONObject(decode(chunks[0]));
		JSONObject payload = new JSONObject(decode(chunks[1]));
		
		if ( !payload.getString("software").equals("FichaTecnica") ) {
			flag = false;
		}
		if ( !payload.getString("name").equals("Gore-Rm") ) {
			flag = false;
		}
		
		return flag;
	}
	
	private static String decode(String encodedString) {
	    return new String(Base64.getUrlDecoder().decode(encodedString));
	}
}
