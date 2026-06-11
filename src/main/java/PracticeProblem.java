/*

	Author - Salma Danane
	File Name - Practice problem 5.2; Arrays, searching, copying, deleting
	Date created - June 1st, 2026
	Date last modified - June 11th, 2026

*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int findValue(int num, int[] arr) {

		int valav;
		valav = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				valav = i;
				
				i = arr.length;
				
			}
		}
		
		return valav;
		
	}

	public static int findThirdValue(String word, String[] arr) {
		
		int count = 0;

			for (int i = 0; i < arr.length; i++) {
			if (word.equals(arr[i])) {
				count++;
			}
			if (count == 3) {
				return i;
			}
		}
		return -1;
	}

	public static double[] append(double num, double[] arr) {
		
		double[] arr2 = new double[arr.length + 1];
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		arr2[arr.length] = num;
		return arr2;
	}
	}

