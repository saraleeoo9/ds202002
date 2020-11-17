import java.util.Random;
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
		System.out.println("N ют╥б : ");
		int size = sc.nextInt();
		
		int[] stack = new int[1024];
		int top = -1;
		
		Queue<Integer> que = new Queue();
		
		Random rand = new Random();
		for(int i = 0; i<size; i++) {
			que.add(rand.nextInt(10000)+1); 
		}
		System.out.println("Front : "+que.peek());
		System.out.println(stack);
	}

}
