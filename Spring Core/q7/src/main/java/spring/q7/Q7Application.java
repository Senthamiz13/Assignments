package spring.q7;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Q7Application {
	public static void main(String[] args) {
		ExpressionParser expressionParser = new SpelExpressionParser();

		Expression expression = expressionParser.parseExpression("'Hello SpEL'");
		String strVal = expression.getValue(String.class);
		System.out.println("1. Literal expression value:\n" + strVal);

		expression = expressionParser.parseExpression("'Hello SpEL'.concat('!')");
		strVal = expression.getValue(String.class);
		System.out.println("2. Method invocation value:\n" + strVal);

		expression = expressionParser.parseExpression("16 * 5");
		Integer intVal = expression.getValue(Integer.class);
		System.out.println("3. Mathematical operator value:\n" + intVal);

		expression = expressionParser.parseExpression("5 < 9");
		boolean boolVal = expression.getValue(Boolean.class);
		System.out.println("4. Mathematical operator value:\n" + boolVal);

		expression = expressionParser.parseExpression("400 > 200 && 200 < 500");
		boolVal = expression.getValue(Boolean.class);
		System.out.println("5. Logical operator value:\n" + boolVal);

		expression = expressionParser.parseExpression("'some value' != null ? 'some value' : 'default'");
		strVal = expression.getValue(String.class);
		System.out.println("6. Ternary operator value:\n" + strVal);

		expression = expressionParser.parseExpression("'some value' ?: 'default'");
		strVal = expression.getValue(String.class);
		System.out.println("7. Elvis operator value:\n" + strVal);

		expression = expressionParser.parseExpression("'UPPERCASE STRING' matches '[A-Z\\s]+'");
		boolVal = expression.getValue(Boolean.class);
		System.out.println("8. Regex/matches operator value:\n" + boolVal);
	}
}
