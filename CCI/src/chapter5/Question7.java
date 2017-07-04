package chapter5;

import CtCILibrary.AssortedMethods;

public class Question7 {

	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(3, 3, 0, 9);
		AssortedMethods.printMatrix(matrix);
        AssortedMethods.printMatrix(Question7.setzeroes(matrix));
        
	}

	public static int[][] setzeroes(int[][] matrix) {
		boolean[] columns = new boolean[matrix.length];
		boolean[] rows = new boolean[matrix[0].length];

		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == 0) {
					columns[j] = true;
					rows[i] = true;
				}
			}
		}

		for (int j = 0; j < columns.length; j++) {
			boolean k = columns[j];
			if(k){
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[i][j] = 0;

			}}
		}

		for (int i = 0; i < rows.length; i++) {
			if(rows[i]){
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = 0;
			}}

		}

		return matrix;
	}

}
