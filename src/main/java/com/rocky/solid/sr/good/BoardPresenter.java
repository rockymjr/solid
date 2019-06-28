package com.rocky.solid.sr.good;

/**
 * Created by mrk on 4/7/14.
 */
public class BoardPresenter {
	private Board board;

	public BoardPresenter(Board board) {
		this.board = board;
	}

	public void displayBoard() {
		StringBuilder formattedBoard = new StringBuilder();
		for (int i = 0; i < this.board.size * this.board.size; i++) {
			String borderOrNewline = "";
			if ((i + 1) % board.size == 0) {
				borderOrNewline += "\n";
			} else {
				borderOrNewline += "|";
			}
			formattedBoard.append(board.spots.get(i));
			formattedBoard.append(borderOrNewline);
		}
		System.out.print(formattedBoard);
	}
}
