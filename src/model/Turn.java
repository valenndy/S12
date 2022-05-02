package model;

public class Turn {

	private int value;
	private int num;

	private Turn prev;
	private Turn next;

	public Turn() {
		this.num = 0;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Turn getPrev() {
		return prev;
	}

	public void setPrev(Turn prev) {
		this.prev = prev;
	}

	public Turn getNext() {
		return next;
	}

	public void setNext(Turn next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
