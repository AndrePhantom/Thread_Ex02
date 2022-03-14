package view;

import Controller.Matriz;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			Thread t = new Matriz(i);
			t.start();
		}
		
	}

}
