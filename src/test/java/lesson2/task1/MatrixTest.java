package lesson2.task1;

import lesson1.task1.Matrix;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MatrixTest {

    private Matrix matrix;

    @Test
    public void sortByLineTest() {
        final int[][] array = new int[][]{{1, 2, 3}, {3, 3, 6}, {5, 5, 5}};
        matrix = new Matrix(array);
        final int[][] expectedArray = new int[][]{{1, 2, 3}, {3, 3, 6}, {5, 5, 5}};
        matrix.sortByLine();
        assertArrayEquals(expectedArray, matrix.getArray());
    }

    @Test
    public void sortByMinElementTest() {
        final int[][] array = new int[][]{{1, 2, 3}, {3, 3, 6}, {5, 5, 5}};
        matrix = new Matrix(array);
        final int[][] expectedArray = new int[][]{{1, 2, 3}, {3, 3, 6}, {5, 5, 5}};
        matrix.sortByMinElement();
        assertArrayEquals(expectedArray, matrix.getArray());
    }

    @Test
    public void sortByMaxElementTest() {
        final int[][] array = new int[][]{{1, 2, 3}, {3, 3, 6}, {5, 5, 5}};
        matrix = new Matrix(array);
        final int[][] expectedArray = new int[][]{{1, 2, 3}, {5, 5, 5}, {3, 3, 6}};
        matrix.sortByMaxElement();
        assertArrayEquals(expectedArray, matrix.getArray());
    }

    @Test
    public void sortByLineTestSecond() {
        final int[][] array = new int[][]{{6, 8, 9}, {3, 1, 6}, {5, 7, 9}};
        matrix = new Matrix(array);
        final int[][] expectedArray = new int[][]{{3, 1, 6}, {5, 7, 9}, {6, 8, 9}};
        matrix.sortByLine();
        assertArrayEquals(expectedArray, matrix.getArray());
    }

    @Test
    public void sortByMinElementTestSecond() {
        final int[][] array = new int[][]{{6, 8, 9}, {3, 1, 6}, {5, 7, 9}};
        matrix = new Matrix(array);
        final int[][] expectedArray = new int[][]{{3, 1, 6}, {5, 7, 9}, {6, 8, 9}};
        matrix.sortByMinElement();
        assertArrayEquals(expectedArray, matrix.getArray());
    }

    @Test
    public void sortByMaxElementTestSecond() {
        final int[][] array = new int[][]{{6, 8, 9}, {3, 1, 6}, {5, 7, 9}};
        matrix = new Matrix(array);
        final int[][] expectedArray = new int[][]{{3, 1, 6}, {6, 8, 9}, {5, 7, 9}};
        matrix.sortByMaxElement();
        assertArrayEquals(expectedArray, matrix.getArray());
    }
}
