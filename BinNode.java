
public class BinNode<T> {

	private BinNode<T> left;
	private T  info;
	private BinNode<T> right;
	
	public BinNode(BinNode<T> left, T info, BinNode<T> right) {
		this.left = left;
		this.right = right;
		this.info = info;
	}
	
	public BinNode(T info) {
		this.info = info;
		this.left =null;
		this.right =null;
	}

	public void setInfo(T x) {
		this.info = x;
	}

	public T getInfo() {
		return this.info;
	}

	public void setLeft(BinNode<T> left) {
		this.left = left;
	}

	public void setRight(BinNode<T> right) {
		this.right = right;
	}
	
	public BinNode<T> getLeft(){
		return this.left;
	}
	
	public BinNode<T> getRight(){
		return this.right;
	}

	public boolean hasRight() {
		if(this.right != null) {
			return true;
		}
		return false;
	}
	
	public boolean hasLeft() {
		if(this.left != null) {
			return true;
		}
		return false;
	}

	public boolean isEmpty(BinNode<T> x) {
		if(x.hasLeft() && x.hasRight()) {
			return false;
		}
		return true;
	}
	
}
