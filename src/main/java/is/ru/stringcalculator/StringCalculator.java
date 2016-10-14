package is.ru.stringcalculator;

public class StringCalculator {

	public static int add(String text){
		if(text == "")
			return 0;
		String[] numbers = text.split(",");
		int sum = 0;
		for(String n : numbers){
			sum += Integer.parseInt(n);
		}
		return sum;
	}
}
