package springCore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


//SpringBootTest
class Q1ApplicationTests {

	@Test
	void mytest() {
		Customer obj1 = new Customer(123,
				"Sen",
				975474739,
				new Address("Abdul kalam st","Puducherry","Puducherry",605014,"India"));

		assertEquals(obj1.getCustomerId(),123,"Customer ID");
		assertEquals(obj1.getCustomerName(),"Sen","Customer Name");
		assertEquals(obj1.getCustomerContact(),975474739,"Customer CONTACT");
		assertEquals(obj1.getCustomerAddress().getStreet(),"Abdul kalam st","Street");
		assertEquals(obj1.getCustomerAddress().getCity(),"Puducherry","City");
		assertEquals(obj1.getCustomerAddress().getState(),"Puducherry","State");
		assertEquals(obj1.getCustomerAddress().getZip(),605014,"zip");
		assertEquals(obj1.getCustomerAddress().getCountry(),"India","Country");
	}

}
