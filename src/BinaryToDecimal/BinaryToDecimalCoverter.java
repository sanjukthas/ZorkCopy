package BinaryToDecimal;

import java.util.Scanner;

public class BinaryToDecimalCoverter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = in.nextInt();
		int copy = number;
		
		
		
		boolean dec = false;
		while(copy > 0) {
	        int tmp = copy % 10;
	        if (tmp > 1) {
	        	dec = true;
	        	break;
	        }	        
	        copy /= 10;
	    }
		if (dec) {
			StringBuilder binDec = new StringBuilder();
			while(number > 0) {
		        int tmp = number %2;
		        binDec = binDec.append(tmp);
		        number /= 2;
		    }
			System.out.println(binDec.reverse());
		} else {
			int result = 0;
			int pow = 0;
			while(number > 0) {
		        int tmp = number % 10;
		        result += Math.pow(2, pow)*tmp;
		        pow++;
		        number /= 10;
		    }
			System.out.println(result);
		}
		
		
		

	}

}
