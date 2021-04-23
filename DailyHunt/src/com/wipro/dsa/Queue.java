package com.wipro.dsa;

public class Queue {

	static class Q {

		int[] arr;
		int front, rear, size, capacity;

		Q(int weight) {
			arr = new int[weight];
			capacity = weight;
			rear = capacity - 1;
			front = size = 0;
		}

		public void enqueue(int element) {

			if (isFull()) {
				System.out.println("Queue being overflown");
				return; // for stack overflow
			}

			rear = (rear + 1) % capacity;

			arr[rear] = element;
			System.out.println("Enqueueing " + arr[rear]);
			size++;
		}

		public void dequeue() {

			if (isEmpty()) {
				System.out.println("Queue is empty");
				return; // for empty stack
			}

			System.out.println("Dequeuing " + arr[front]);
			front = (front + 1) % capacity;
			size--;
		}

		public void peek() {

			if (isEmpty()) {
				System.out.println("Printing empty Queue!!");
				return;
			}

			System.out.println("The Peek is :" + arr[front]);
		}

		private boolean isFull() {
			return (size == capacity);
		}

		private boolean isEmpty() {
			return (size == 0);
		}

	}

	public static void main(String[] args) {

		Queue.Q queue = new Q(6);

		for (int i = 10; i < 70; i += 10)
			queue.enqueue(i); // Enqueueing

		for (int i = 0; i < 6; i++) {

			queue.peek();
			queue.dequeue(); // Dequeuing
		}

		queue.peek(); // Making empty
		queue.dequeue();

		/* inserting once again.. */
		for (int i = 100; i > 40; i -= 10)
			queue.enqueue(i);

		for (int i = 0; i < 6; i++) {

			queue.peek();
			queue.dequeue(); // Dequeuing
		}

		queue.peek(); // Making empty
		queue.dequeue();
	}

}
