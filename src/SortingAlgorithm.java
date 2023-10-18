public class SortingAlgorithm {

	/**
	 * Sort collection with Optimised Bubble Sort algorithm.
	 * 
	 * @param dataCollection
	 *            unsorted collection
	 * @return sorted collection
	 */
	public static int[] sortInBubbleSort(int[] dataCollection) {
		int i = 0, n = dataCollection.length;
		boolean swapNeeded = true;
		while (i < n - 1 && swapNeeded) {
			swapNeeded = false;
			for (int j = 1; j < n - i; j++) {
				if (dataCollection[j - 1] > dataCollection[j]) {
					int temp = dataCollection[j - 1];
					dataCollection[j - 1] = dataCollection[j];
					dataCollection[j] = temp;
					swapNeeded = true;
				}
			}
			if(!swapNeeded) {
				break;
			}
			i++;
		}
		
		return dataCollection;
	}
}
