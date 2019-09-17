package Generic;

import java.util.Random;

public class RandomGenerator {
	
	public String RandomString(int size) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        
        while (salt.length() < size) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        
        return saltStr;

		
	}

	
	public static int RandomNumbers(int size) {
		String SALTCHARS = "0123456789";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        
        while (salt.length() < size) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        
        return parseInt(saltStr);

		
	}

	private static int parseInt(String saltStr) {
		// TODO Auto-generated method stub
		return 0;
	}


	public static void RandomAlphaNumeric() {
		

		
	}

}
