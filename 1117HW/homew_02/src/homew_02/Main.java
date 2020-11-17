package homew_02;
import java.util.LinkedList;
import java.util.Scanner;

class Node<E> {
	public E value; 
	public Node<E> prev, next;
}

class Queue<E> {
	Node<E> head;
	
	Queue() {
		head = new Node();
		head.prev = head;
		head.next = head;
	}
	
	public void add(E v) {
		Node<E> newNode = new Node();
		newNode.value = v;
		newNode.prev = head;
		newNode.next = head.next;
		head.next.prev = newNode;
		head.next = newNode;
	}
	
	public void remove() {
		Node<E> tmp = head.prev;
		tmp.prev.next = head;
		head.prev = tmp.prev;
	}
	
	public E peek() {
		return head.prev.value;
	}
	
	public boolean empty() {
		return head.prev == head;
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> que = new LinkedList<>();
		int cnt = sc.nextInt();
		for(int i = 0; i<n; i++) {
			String a = sc.next();
			if(a.equals("push")) {
				que.add(sc.nextInt());
			}else if(a.equals("pop")) {
				if(que.size()<1){
                    System.out.println(-1);
                }
				
				//System.out.println("Empty?  "+que.isEmpty(), que.peek());
				//System.out.println(que.isEmpty(), que.peek());
			}
		}
		

	}

}
