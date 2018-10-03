
public class HW3Task1 {

	public static void main(String[] args) {
		// Объявить 2 массива: целого и вещественного типа.
		// Посчитать сумму элементов к каждом массиве,
		// вывести на экран.
		// Разделить каждый элемент массива целого типа
		// на максимальный элемент.
		// Разделить каждый элемент массива вещественного типа
		// на минимальный элемент.

		// *Поменять местами максимальный элемент
		// массива вещественного типа с минимальным
		// элементом массива целого типа.
		// Прирешении задачи создать не менее 10 методов
		int[] arr = new int[] { 1, 2, 3, 4, 5, };
		double[] arr2 = new double[] { 1.1, 2.2, 3.3 };
		// int sum = 0;
		int sum = calcSum(arr);
		printSum(sum);
		double sum2 = calcSum(arr2);
		printSum(sum2);
		int maxValue = findMaxValue(arr);
		double minValue = findMinValue(arr2);
		int[] dividedIntArray = divideByValue(arr, maxValue);
		double[] dividedDoubleArray = divideByValue(arr2, minValue);
		System.out.println("Divided Int Array:");
		printArray(dividedIntArray);
		System.out.println("Divided Double Array:");
		printArray(dividedDoubleArray);
		int maxPosition = findMaxPosition(arr);
		int minPosition = findMinPosition(arr2);
		updateMaxPositionValue(arr, maxPosition, (int) minValue);
		updateMinPositionValue(arr2, minPosition, (double) maxValue);
		System.out.println("Updated Int Array:");
		printArray(arr);
		System.out.println("Updated Double Array:");
		printArray(arr2);

	}

	static int calcSum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		return sum;

	}

	static double calcSum(double arr2[]) {
		double sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			sum = sum + arr2[i];

		}
		return sum;

	}

	static void printSum(int x) {
		System.out.println("Sum of INT array elements:" + x);
	}

	static void printSum(double x) {
		System.out.println("Sum of DOUBLE array elements:" + x);
	}

	static int findMaxValue(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	static double findMinValue(double arr2[]) {
		double min2 = arr2[0];
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] < min2) {
				min2 = arr2[i];
			}
		}
		return min2;
	}

	static int[] divideByValue(int arr[], int max) {
		int updatedArray[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			updatedArray[i] = arr[i] / max;
		}
		
		return updatedArray;
	}

	static double[] divideByValue(double arr2[], double min) {
		double updatedArray[] = new double[arr2.length];
		for (int i = 0; i < arr2.length; i++) {
			updatedArray[i] = arr2[i] / min;
		}
		return updatedArray;
	}

	static void printArray(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	static void printArray(double[] a) {
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	static int[] updateMaxPositionValue(int arr[], int maxPosition, int minValue) {
		arr[maxPosition] = minValue;

		return arr;
	}

	static int findMaxPosition(int arr[]) {
		int max = arr[0];
		int maxPosition = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				// max = arr[i];
				maxPosition = i;
			}
		}
		return maxPosition;
	}

	static int findMinPosition(double arr2[]) {
		double min = arr2[0];
		int minPosition = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] < min) {
				minPosition = i;
			}
		}
		return minPosition;
	}

	static double[] updateMinPositionValue(double arr2[], int minPosition, double maxValue) {
		arr2[minPosition] = maxValue;

		return arr2;
	}

}
