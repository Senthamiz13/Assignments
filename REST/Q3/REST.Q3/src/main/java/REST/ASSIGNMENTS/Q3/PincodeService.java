package REST.ASSIGNMENTS.Q3;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PincodeService {

	private List<Pincode> PinCodeList = Arrays.asList(new Pincode(636002, "TN", "Chennai", "India"),
			new Pincode(646835, "Mh", "Mumbai", "India"), new Pincode(634557, "AP", "Hyderabad", "India"),
			new Pincode(465474, "KN", "Bangalore", "India"), new Pincode(643564, "MH", "Pune", "India"),
			new Pincode(605014, "PY", "Pondicherry", "India"));

	public Pincode getDetails(int pincode) {
		for (Pincode p : PinCodeList) {
			if (p.getPin() == pincode) {
				System.out.println(p);
				return p;
			}
		}
		return null;
	}

	public List<Pincode> getall(){
		return PinCodeList;
	}
	
}
