package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {// TODO Auto-generated method stub
		Integer number = 10;
		Integer nth  = Recursion(number);
		System.out.println("The " + number+"th term of the Fibonacci sequence is "+nth+".");
	}
/**
 
 * This method take the number parameter and return the nth to main
 * 
 * @param numb from the Recursion method.
 * @return returns the nth number to main
 */
	public static  Integer Recursion(Integer numb){
		if(numb == 0){
			return 0;
		}
		if(numb == 1 || numb == 2){
				return 1;
			}
		 return Recursion(numb-2) + Recursion(numb-1);
	}
   }

