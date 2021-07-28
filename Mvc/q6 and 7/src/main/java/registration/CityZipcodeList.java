package registration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CityZipcodeList {

	Map<String, String> zipCodes = new HashMap<>();

	public CityZipcodeList() {
		zipCodes.put("609605", "Karaikal");
		zipCodes.put("600028", "Chennai");
		zipCodes.put("641001", "Coimbatore");
		zipCodes.put("629001", "Nagercoil");
		zipCodes.put("110006", "Delhi");
		zipCodes.put("400029", "Mumbai");
		zipCodes.put("673593", "Kerala");
	}

	public Map<String, String> getZipCodes() {
		return zipCodes;
	}

	public void setZipCodes(Map<String, String> zipCodes) {
		this.zipCodes = zipCodes;
	}

}
