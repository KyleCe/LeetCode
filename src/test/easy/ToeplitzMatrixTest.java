package test.easy;import org.junit.Assert;import org.junit.Test;import algorithm.easy.ToeplitzMatrix;public class ToeplitzMatrixTest {    @Test    public void isToeplitzMatrix() {        int[][] matrix = {                {1, 2, 3, 4},                {5, 1, 2, 3},                {9, 5, 1, 2}        };        Assert.assertTrue(new ToeplitzMatrix().isToeplitzMatrix(matrix));        Assert.assertFalse(new ToeplitzMatrix().isToeplitzMatrix(new int[][]{                {1, 2},                {2, 2}        }));    }}