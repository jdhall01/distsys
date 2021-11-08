package algorithms.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Knapsack01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] values = {0, 60, 100, 120};
		int[] weights = {0, 10, 20, 30};
		int capacity = 50;
		
		/*
		ArrayList<Integer> weightsCol = IntStream.of(weights)
				.boxed()
				.collect(Collectors.toCollection(ArrayList::new));*/
		int rowDim = weights.length;
		int colDim = 1 + capacity/10;
		int[][] table = new int[rowDim][colDim];
		
		for(int i = 1; i < rowDim; i++) {
			for(int j = 1; j < colDim; j++) {
				int colIndex = j - (weights[i]/10);
				if(weights[i]/10 > j) {
					table[i][j] = table[i-1][j];
				} else {
					table[i][j] = Math.max(table[i-1][j], values[i] + table[i-1][j - (weights[i]/10)]);
				}
			}
		}
		
		List<Integer> itemsChosen = new LinkedList<Integer>();
		
		int i = rowDim-1, j = colDim-1;
		while (i > 0 && j > 0) {
			if(table[i][j] != table[i-1][j]) {//item i was included
				itemsChosen.add(i);
				j-=weights[i]/10;
				i-=1;
			} else {
				i-=1;//item i was excluded
			}
		}
		
		System.out.println(itemsChosen.toString());
	}
}
