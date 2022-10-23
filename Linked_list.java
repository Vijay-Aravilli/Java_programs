package hii;
class Node{
	int data;
	Node next;
	public Node() {
		this.data=data;
		this.next=null;
	}
}

public class Linked_list {
	Node root=null;
	int size_ll=0;
	public void insert_ll(int pos, int data) {
		
		
		if(pos>=1 && pos<=size_ll+1) {
			Node temp=new Node();
			temp.data=data;
			if(pos==1) {
				temp.next=root;
				root=temp;
				
			}
			else {
				int count=1;
				Node prev=root;
				while(count<=pos-1) {
					
					prev=prev.next;
					count++;
				}
				temp.next=prev.next;
				prev.next=temp;
			}
			size_ll++;
			
		}
	}
	public void add() {
		insert_ll(1,23);
		
	}
	public void print() {
		Node m=new Node();
		while(m!=null) {
			m=m.next;
			System.out.print(m.data);
		}
	}
}
