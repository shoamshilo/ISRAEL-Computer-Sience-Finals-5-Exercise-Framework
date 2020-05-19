
public class Node<T> {
	private T info;
	private Node<T> next;
	
	public Node(T info) {
		this.info=info;
		this.next =null;
	}
	public Node(T info,Node<T> next) {
		this.info=info;
		this.next=next;
	}

	public T getInfo() {return this.info;}
	public void setInfo(T info) {this.info=info;}
	public Node<T> getNext() {return this.next;}
	public void setNext(Node<T> next) {this.next=next;}
	public String toString() {return "" + this.info;}

}
