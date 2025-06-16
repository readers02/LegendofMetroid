/**********************************************************
* Program	:  Sorting Methods
* Author	:  Scott Reader
* Due Date	:  Uncertain
* Description	:  Performs several sorting methods
***********************************************************/

package activities;

import java.util.Arrays;

public class SortingMethods {
	
	public static int[] SelectionSort(int[] arr) {
		int minVal = 0;
		int minValIndex = 0;
		int temp = 0;
		int startVal = 0;
		while (true) {
			for (int i = startVal; i < arr.length; i++) {
				if (i == startVal) {
					minVal = arr[i];
				}else if(minVal > arr[i]) {
					minVal = arr[i];
					minValIndex = i;
					temp = minVal;
					arr[minValIndex] = arr[startVal];
					arr[startVal] = temp;
				}
			}

			startVal++;
			if (startVal == arr.length){
				break;
			}
		}
		return arr;
	}
	
	public static int[] InsertionSort(int[] arr) {
		int temp = 0;
		int temp2 = 0;
		for(int i = 0; i < arr.length-1; i++) {
			temp = arr[i+1];
			for(int iRev = i; iRev > -1; iRev--) {
				if(arr[iRev+1] < arr[iRev]) {
					temp2 = arr[iRev+1];
					arr[iRev+1] = arr[iRev];
					arr[iRev] = temp2;
				}
			}
		}
		return arr;
	}

	public static int[] MergeSort(int[] arr) {
		if (arr.length <= 1) return arr;
		int[] left = Arrays.copyOfRange(arr, 0, arr.length/2);
		int[] right = Arrays.copyOfRange(arr, arr.length/2, arr.length);
		left = MergeSort(left);
		right = MergeSort(right);
		
		return Merge(left, right);
	}
	
	public static int[] Merge (int[] left, int[] right) {
		int[] sorted = new int[left.length + right.length];
		int l = 0;
		int r = 0;
		int i = 0;
		for(; l < left.length && r < right.length; i++) {
			if (left[l] < right[r]) {
				sorted[i] = left[l];
				l++;
			}else {
				sorted[i] = right[r];
				r++;
			}
		}
		for (;l == left.length && r < right.length; r++) {
			sorted[i] = right[r];
		}
		for (;r == right.length && l < left.length; l++) {
			sorted[i] = left[l];
		}
		return sorted;
	}
	
	public static int[] CountingSort(int[] arr) {
		int[] sorted = new int[arr.length];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) 
				max = arr[i];
		}
		int[] countArr = new int[max+1];
		for (int i = 0; i < arr.length; i++) {
			countArr[arr[i]]++;
		}

		for (int i = 0; i < countArr.length-1; i++) {
			countArr[i+1]= countArr[i] + countArr[i+1];
		}
		
		for (int i = 0; i < arr.length; i++) {
			countArr[arr[i]]--;
			sorted[countArr[arr[i]]] = arr[i];
		}

		return sorted;
	}
	
//	for (int r = 0; r < arr.length; r++) {
//		if (i < arr.length-1) {
//			System.out.print(arr[r] + ", ");
//		}else {
//			System.out.println(arr[r]);
//		}
//	}
//	System.out.println("\n");
	
	public static int[] reset() {
		int arr[] = {7, 10, 5, 6, 2, 8, 5};
		return arr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test = {7, 10, 5, 6, 2, 8, 5};
		
		test = SelectionSort(test);
		
		for (int i = 0; i < test.length; i++) {
			if (i < test.length-1) {
				System.out.print(test[i] + ", ");
			}else {
				System.out.println(test[i]);
			}
		}
		
		System.out.println("\n");
		test = reset();
		
		test = InsertionSort(test);
		
		for (int i = 0; i < test.length; i++) {
			if (i < test.length-1) {
				System.out.print(test[i] + ", ");
			}else {
				System.out.println(test[i]);
			}
		}
		
		System.out.println("\n");
		test = reset();
		
		test = MergeSort(test);
		
		for (int i = 0; i < test.length; i++) {
			if (i < test.length-1) {
				System.out.print(test[i] + ", ");
			}else {
				System.out.println(test[i]);
			}
		}
		
		System.out.println("\n");
		test = reset();
		
		test = CountingSort(test);
		
		for (int i = 0; i < test.length; i++) {
			if (i < test.length-1) {
				System.out.print(test[i] + ", ");
			}else {
				System.out.println(test[i]);
			}
		}

	}

}
