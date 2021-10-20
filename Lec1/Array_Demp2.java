package Lec1;

public class Array_Demp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap1(arr, 0,1);
		System.out.println(arr[0] + " " + arr[1]);

	}

	
	
	public static void Swap1(int []arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j]= t;
	}

	public static void Swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
	}

}
