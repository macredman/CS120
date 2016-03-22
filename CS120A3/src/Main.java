import javax.swing.JOptionPane;

public class Main{
	
    String print = "";
	
    //takes user input and gets long from fact method
	public static void partOne(){
		
		JOptionPane.showMessageDialog(null, "Welcome to the factorial calculator");
		String thing;
		thing = JOptionPane.showInputDialog("Please input an integer");
		long other = Long.parseLong(thing);
		JOptionPane.showMessageDialog(null,"Here is your result " + fact(other));
		
	}
	
	//calculates factorial from user input
	public static long fact(long n){
		if(n <= 1){
			return n;
		}
		else{
			return n * fact(n-1);
		}
	}
	
	//takes user input and returns word 
	public static void partThree(){
			
			JOptionPane.showMessageDialog(null, "Welcome to the permutation calculator");
			String word = JOptionPane.showInputDialog(null,"Please enter a String.");
			permutationCalculator("", word);
			
		}

	//calculates permutation of string from previous method
	public static void permutationCalculator(String beginningString, String endingString) {
	    if (endingString.length() <= 1)
	      System.out.println(beginningString + endingString);
	    else
	      for (int i = 0; i < endingString.length(); i++) {
	        try {
	          String newString = endingString.substring(0, i) + endingString.substring(i + 1);
	
	          permutationCalculator(beginningString + endingString.charAt(i), newString);
	        } catch (StringIndexOutOfBoundsException exception) {
	          exception.printStackTrace();
	        }
	      }
		}
	
		//prints a string with recursion
	    public String printString(String str){
	         
	        if(str.length() > 1){
	            return str;
	        } else {
	            print += str.charAt(str.length()-1)
	                    +printString(str.substring(0,str.length()-1));
	            return print;
	        }
	    }
}		
	
