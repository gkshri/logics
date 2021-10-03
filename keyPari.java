// Java program to demonstrate
// genKeyPair() method

import java.security.*;
import java.util.*;

public class GFG1 {
	public static void main(String[] argv) throws Exception
	{
		try {

			// creating the object of KeyPairGenerator
			KeyPairGenerator kpg = KeyPairGenerator
									.getInstance("RSA");

			// fetching the Algorithm
			// using getAlgorithm() method
			String algo = kpg.getAlgorithm();

			// printing the string algo
			System.out.println("Algorithm : " + algo);
		}

		catch (NoSuchAlgorithmException e) {

			System.out.println("Exception thrown : " + e);
		}
	}
}
