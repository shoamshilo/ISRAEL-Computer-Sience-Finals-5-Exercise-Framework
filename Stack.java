
public class Stack<T> {

	 private List<T> first;
	
	 public Stack(){
		 this.first = new List<T>();
	 }
	 
	 public boolean isEmpty() {
		 return this.first.isEmpty();
	 }
	 
	 public void push(T x) {
		 first.add(x);
	 }
	 
	 public T pop() {
		 Node<T> temp = this.first.getFirst();
		 T x = temp.getInfo();
		 this.first.remove(x);
		 return x;
	 }

	 public T top() {
		 return this.first.getFirst().getInfo();
	 }

	 public String toString() {
		 Node<T> temp = this.first.getFirst();
		 String str ="";
		 while(temp!=null) {
			 str = str + temp.getInfo();
			 temp =temp.getNext();
		 }
		 return str;
	 }
	 

}	


