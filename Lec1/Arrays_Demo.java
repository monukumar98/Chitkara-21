package Lec1;

import java.util.Arrays;

public class Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=89;
		int [] arr =new int [5];
		System.out.println(arr[2]);
		System.out.println(arr.length);
		//set
		for (int i = 0; i < arr.length; i++) {
			arr[i]=10*(i+1);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int[] other = arr;
		arr[0]=-90;
		Arrays.copyOfRange(arr, 1, 3);
		System.out.println(other[0]);
		

	}

}
