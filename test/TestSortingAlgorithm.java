import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestSortingAlgorithm {

	private int[] collection = new int[10];
    private int[] sortedCollection;

	@Before
	public void setup() {
		for (int i = 0; i < 10; i++) {
			collection[i] = (int) (Math.random() * 100);
		}

        sortedCollection = Arrays.copyOf(collection, collection.length);
        Arrays.sort(sortedCollection);
	}

	@Test
	public void shouldReturnSortedCollectionFromBubbleSortAlgorithm() {
		int[] actualSortedCollection = SortingAlgorithm.sortInBubbleSort(collection);
		System.out.println("Data set After Bubble Sorting : \t" + Arrays.toString(actualSortedCollection));
		assertEquals(Arrays.toString(sortedCollection), Arrays.toString(collection));
	}

	@Test
	public void shouldFail() {
        int[] theOG = Arrays.copyOf(collection, collection.length);

		int[] actualSortedCollection = SortingAlgorithm.sortInBubbleSort(collection);
		System.out.println("Data set After Bubble Sorting : \t" + Arrays.toString(actualSortedCollection));
		assertEquals(Arrays.toString(sortedCollection), Arrays.toString(collection));
		assertEquals(Arrays.toString(theOG), Arrays.toString(actualSortedCollection));
	}

}