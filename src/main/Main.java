package main;

import java.util.Scanner;

import model.Turn;
import model.List;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static List list = new List();

	public static void main(String[] args) {

		boolean out = false;
		int option;

		while (!out) {
			System.out.println("\n	Select a option "
					+ "\n 1. Give turn"
					+ "\n 2. Show turn"
					+ "\n 3. Pass turn"
					+ "\n 4. Delete turn"
					+ "\n 5. bye bye ");

			System.out.println("¿What action do you want to do?");
			option = sc.nextInt();

			switch (option) {
				case 1:
					System.out.println("Give turn");
					giveTurn();

					break;
				case 2:
					System.out.println("Show turn");
					showTurn();
					break;
				case 3:
					System.out.println("Pass turn");
					passTurn();

					break;
				case 4:
					System.out.println("Delete turn");
					delturn();

					break;
				case 5:
					out = true;
					break;
				default:
					System.out.println("Write only numbers from 1 to 5");
			}

		}

	}

	private static void giveTurn() {
		list.add();
		System.out.println("Assigned turn");
	}

	private static void showTurn() {
		System.out.println("The following turn is: \n");
		list.print();
	}

	private static void passTurn() {
		System.out.println("The turn has passed");
		list.pass();
	}

	private static void delturn() {
		boolean del = list.delete();

		if (del) {
			System.out.println("Turn delete successfully");
		} else {
			System.out.println("error");
		}

	}

}
