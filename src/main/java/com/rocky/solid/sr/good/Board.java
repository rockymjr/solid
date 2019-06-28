package com.rocky.solid.sr.good;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrk on 4/7/14.
 */
public class Board {
	int size;
	ArrayList<String> spots;

	public Board(int size) {
		this.size = size;
		this.spots = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			this.spots.add(String.valueOf(3 * i));
			this.spots.add(String.valueOf(3 * i + 1));
			this.spots.add(String.valueOf(3 * i + 2));
		}
	}

	public List<String> valuesAt(List<Integer> indexes) {
		List<String> values = new ArrayList<>();
		for (int index : indexes) {
			values.add(this.spots.get(index));
		}
		return values;
	}
}
