package com.rocky.solid.sr.good;

import java.util.ArrayList;
import java.util.List;

public class BoardShaper {
	private int size;

	public BoardShaper(int size) {
		this.size = size;
	}

	public List<ArrayList<Integer>> rowIndexes() {
		List<ArrayList<Integer>> rowIndexes = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < this.size; i++) {
			ArrayList<Integer> row = new ArrayList<>();
			for (int j = 0; j < this.size; j++) {
				row.add(i * size + j);
			}
			rowIndexes.add(row);
		}
		return rowIndexes;
	}
	
	public int getSize() {
		return size;
	}
}
