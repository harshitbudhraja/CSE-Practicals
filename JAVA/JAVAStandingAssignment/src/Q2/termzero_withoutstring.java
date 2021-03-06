package Q2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author arachnis
 *
 */
public class termzero_withoutstring {

	/**
	 * 
	 */
	public static BigInteger factorial(Integer N)
	{
		BigInteger fac = new BigInteger(String.valueOf(1));
		for(int i=1;i<=N;i++)
		{
			fac=fac.multiply(BigInteger.valueOf(i));
		}
		return fac;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int inputnum = s.nextInt();
		Integer N = new Integer(inputnum);
		BigInteger factval = factorial(N);
		int count=0;
		System.out.println(N.toString()+"! = "+factval.toString());
		BigInteger f = new BigInteger(factval.toString());
		while(f.mod(BigInteger.valueOf(10)).equals(BigInteger.valueOf(0)))
		{
			count++;
			f = f.divide(BigInteger.valueOf(10));
		}
		//System.out.println("No. of digits in this factorial = " + String.valueOf(len));
		System.out.println("No. of terminal zeroes = " + String.valueOf(count));
	}

}