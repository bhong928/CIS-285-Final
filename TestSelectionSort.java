import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSelectionSort {

    SelectionSort sorter = new SelectionSort();

    @Test
    public void testPositive() {
        int[] actual = {5, 9, 3, 1, 2};
        int[] expected = {1, 2, 3, 5, 9};
        sorter.selectionSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNegatives() {
        int[] actual = {-3, -1, -4, -2, -5};
        int[] expected = {-5, -4, -3, -2, -1};
        sorter.selectionSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMixed() {
        int[] actual = {-2, 3, 1, 0, -5, 4};
        int[] expected = {-5, -2, 0, 1, 3, 4};
        sorter.selectionSort(actual);
        assertArrayEquals(expected, actual);
    }
}
