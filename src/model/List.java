package model;

public class List {

	Turn head;
	Turn tail;

	public void add() {
		Turn nodeturn = new Turn();
		if (head == null) {
			nodeturn.setValue(1);

			head = nodeturn;
			tail = nodeturn;
			head.setNext(head);
			head.setPrev(head);

		} else {

			int t = tail.getValue() + 1;
			nodeturn.setValue(t);
			tail.setNext(nodeturn);

			nodeturn.setPrev(tail);

			head.setPrev(nodeturn);
			nodeturn.setNext(head);

			tail = nodeturn;

		}
	}

	public void print() {
		if (null == head) {
			String message = "The list dont have turns";
			return;
		}

		System.out.println(head.getValue());
	}

	public void pass() {
		if (null == head) {
			String message = "The list dont have turns";
			return;
		}

		head.setNum(head.getNum() + 1);
		if (head.getNum() >= 3) {
			delete();
		} else {
			Turn t = head.getNext();
			tail = head;
			head = t;
		}
	}

	public boolean delete() {
		boolean out = false;
		if (head == null) {
			return false;
		} else {
			if (head == head.getNext()) {
				head = null;
				return true;
			}
			tail.setNext(head.getNext());
			head.getNext().setPrev(tail);
			head = head.getNext();
			out = true;
		}
		return out;
	}

}
