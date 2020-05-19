
public class List<T>{
	
	private Node<T> head;
	
	public List(){
		this.head =null;
	}
	
	public boolean isEmpty() {
		if(this.head ==null) {
			return true;
		}
		return false;
	}

	public Node<T>  getFirst(){
		return this.head;
	}
	
	public void add(T x) {
		this.head=new Node<T>(x,head);
	}
	
	public int length() {
		Node<T> temp =this.head;
		int length =0;
		while(temp.getNext()!=null) {
			length++;
		}
		return length;
	}
	
	public void remove(T info){
		Node<T> temp ,prev;
		temp =this.head;
		prev =null;
		for(;temp!=null;temp =temp.getNext()) {
			if(temp.getInfo() == info) {
				prev.setNext(temp.getNext());
			}
			prev =temp;
		}
	}
	
	//Proof of concept
	public String PrintRevers() {
		String str ="";
		Node<T> temp = this.head;
		for(;temp!=null;temp=temp.getNext()) {
			str = temp.getInfo() + str;
		}
		return str;
	}
	
	
	public void insert(int pos, T n) {
		Node<T> temp = new Node<T>(n);
		temp=this.head;
		for(int i=0; temp!=null;i++) {
			if(i==pos) {
				temp.setNext(new Node<T>(n,temp.getNext()));
			}temp = temp.getNext();
		}
		
	}
	
	public void Inverter() {
		Node<T> prv,cur;
		cur=this.head;
		prv=null;
		while(cur!=null) {
			this.head = this.head.getNext();
			cur.setNext(prv);
			prv=cur;
			cur=this.head;
		}
		head=prv;
	}
	
	public String toString() {
		Node<T> temp =this.head;
		String str ="[";
		while(temp!=null) {
			str = str + temp.getInfo() + ",";
			temp=temp.getNext();
		}
		str = str + "]"; 
		return str;
	}



}
