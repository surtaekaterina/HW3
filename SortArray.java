
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 2, 6, 4, 12, 6 };
		int[] resArr = bubbleSort(arr);

	for(int i = 0; i < resArr.length; i++) {
		System.out.println(resArr[i] + " ");
	}
	
	}
	/*private void swap(int[] resArr, int index) {
		int temp = resArr[index - 1];
		resArr[index - 1] = resArr[index];
		resArr[index] = temp;

	}*/

	static int[] bubbleSort(int arr[]) {
		int[] resArr = arr;
		for (int i = 1; i <= resArr.length; i++) {
			for (int j = resArr.length - 1; j >= i; j--) {
				if (resArr[j - i] > resArr[j]) {
					int temp = resArr[j - 1];
					resArr[j - 1] = resArr[j];
					resArr[j] = temp;
				}
			}
		}
		return resArr;
	}

}
