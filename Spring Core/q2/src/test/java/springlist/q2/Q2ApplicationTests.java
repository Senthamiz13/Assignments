package springlist.q2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

//SpringBootTest
class Q2ApplicationTests {
	@Test
	void contextLoads() {
		Question ob1 =new Question();
		ob1.setQuestion("Types of pollution");
		ob1.setQuestionId(1234);
		List<String > mylist = new ArrayList<>();
		mylist.add("Air Pollution");
		mylist.add("Water Pollution");
		mylist.add("Light Pollution");
		mylist.add("Soil Pollution");
		ob1.setAnswers(mylist);

		assertEquals(ob1.getQuestionId(),1234,"id");
	}

}
