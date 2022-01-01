package Class_69_Heaps_I;

import java.util.Arrays;

public class _max_heap_Implementation {
	private static int capacity = 5;
	private static int size = 0;

	public static int[] items = new int[capacity];

	private static int getLeftChildIndex(int parentIndex) {
		return 2 * parentIndex + 1;
	}

	private static int getRightChildIndex(int parentIndex) {
		return 2 * parentIndex + 2;
	}

	private static int getParentIndex(int childIndex) {
		return (childIndex - 1) / 2;
	}

	private static boolean hasLeftChild(int index) {
		return getLeftChildIndex(index) < size;
	}

	private static boolean hasRightChild(int index) {
		return getRightChildIndex(index) < size;
	}

	private static boolean hasParent(int index) {
		return getParentIndex(index) >= 0;
	}

	private static int leftChild(int index) {
		return items[getLeftChildIndex(index)];
	}

	private static int rightChild(int index) {
		return items[getRightChildIndex(index)];
	}

	private static int parent(int index) {
		return items[getParentIndex(index)];
	}

	private static void swap(int indexOne, int indexTwo) {
		int temp = items[indexOne];
		items[indexOne] = items[indexTwo];
		items[indexTwo] = temp;
	}

	private static void ensureExtraCapacity() {
		if (size == capacity) {
			items = Arrays.copyOf(items, capacity * 2);
			capacity *= 2;
		}
	}

	public static int peek() {
		if (size == 0)
			throw new IllegalStateException();
		return items[0];
	}

	public static int poll() {
		if (size == 0)
			throw new IllegalStateException();

		int item = items[0];
		items[0] = items[size - 1];
		size--;
		heapifyDown();
		return item;
	}

	public static void add(int item) {
		ensureExtraCapacity();
		items[size] = item;
		size++;
		heapifyUp();
	}

	private static void heapifyUp() {
		int index = size - 1;
		while (hasParent(index) && parent(index) < items[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}

	private static void heapifyDown() {
		int index = 0;
		while (hasLeftChild(index)) {
			int biggerChildIndex = getLeftChildIndex(index);
			if (hasRightChild(index) && rightChild(index) > leftChild(index)) {
				biggerChildIndex = getRightChildIndex(index);
			}
			if (items[index] > items[biggerChildIndex]) {
				break;
			} else {
				swap(index, biggerChildIndex);
			}
			index = biggerChildIndex;
		}
	}
	
	public static void print()
    {
        for (int i = 0; i < size / 2; i++) {
            System.out.print(
                " PARENT : " + items[i]
                + " LEFT CHILD : " + items[2 * i + 1]
                + " RIGHT CHILD :" + items[2 * i + 2]);
 
            System.out.println();
        }
    }
	
	public static void main(String[] args) {
		add(5);
		add(3);
		add(17);
		add(10);
		add(84);
		add(6);
		add(22);
		add(9);
		
		print();
	}

}