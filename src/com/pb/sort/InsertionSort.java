package com.pb.sort;

import com.pb.util.CommonUtils;

/**
 * 插入排序 时间复杂度：Θ(n²)
 * 
 * @author PB
 *
 */
public class InsertionSort {

	public static void main(String[] args) {

		int array[] = { 1, 52, 42, 12, 23, 56, 14 };
		sort1(array);
		CommonUtils.print(array);

	}

	/**
	 * 将比较的元素临时保存，将后面的元素依次复制到前面的元素中， 直到遇到合适的位置 再将临时保存的元素与该位置的元素进行替换
	 * 
	 * @param array
	 */
	public static void sort(int array[]) {
		int len = array.length;
		for (int i = 1; i < len; i++) {
			int temp = array[i];
			for (int j = i - 1; j >= 0; j--) {
				if (temp < array[j]) {
					CommonUtils.exch(array, j, j + 1);
				} else {
					array[j + 1] = temp;
					break;
				}
			}
		}
	}

	/**
	 * 将待插入的元素依次与后面的元素进行比较，然后直接替换
	 * 
	 * @param array
	 */
	public static void sort1(int array[]) {
		int len = array.length;
		for (int i = 1; i < len; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (array[j + 1] < array[j]) {
					CommonUtils.exch(array, j + 1, j);
				} else
					break;
			}
		}

	}
}
