package is.ru.stringcalculator;

public class StringCalculator {

	private static String delim = ",|\n";

	public static int add(String text) throws Exception {
		int sum = 0;
		if(!text.isEmpty()){
			String[] numbers = text.split(delim);
			for(String n : numbers){
				int num = Integer.parseInt(n);
				if(num < 0){
					String negatives = handleNegatives(numbers);
					throw new Exception("Negatives not allowed: " + negatives);
				}
				if (num < 1000)
					sum += num;
			}
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
