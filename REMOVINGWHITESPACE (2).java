package removingwhitespace.java;

public class REMOVINGWHITE {

	public static void main(String[] args) {
		
		String str1 = "Hi!  Good    afternoon.\nHave a great day.";
		
		//remove white spaces 
		String resultStr = str1 .replaceAll("\\s", "");
		
		System.out.print(resultStr);
	

		
		}

	}


