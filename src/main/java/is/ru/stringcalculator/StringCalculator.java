package is.ru.stringcalculator;

public class StringCalculator {

	public static int add(String text) throws Exception {
		if(text == "")
			return 0;
		String[] numbers = text.split(",|\n");
		int sum = 0;
		for(String n : numbers){
			int num = Integer.parseInt(n);
			if(num < 0){
				String negatives = handleNegatives(numbers);
				throw new Exception("Negatives not allowed: " + negatives);
			}
			if (num < 1000)
				sum += num;
		}
		return sum;
	}

	public static String handleNegatives(String[] s){
		String negatives = "";
		for(String n : s)
			if(Integer.parseInt(n) < 0)
				negatives += (n + ",");
		return negatives.substring(0, negatives.length()-1);
	}
}
