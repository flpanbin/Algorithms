package com.pb.util;

public class CommonUtils {
	public static void exch(int array[], int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void print(int array[]) {
		for (int a : array) {
			System.out.println(a);
		}
	}
}
