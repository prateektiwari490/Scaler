package Class_69_Heaps_I;

import java.util.Arrays;
import java.util.List;

public class Connect_ropes {
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
		while (hasParent(index) && parent(index) > items[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}

	private static void heapifyDown() {
		int index = 0;
		while (hasLeftChild(index)) {
			int smallerChildIndex = getLeftChildIndex(index);
			if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
				smallerChildIndex = getRightChildIndex(index);
			}
			if (items[index] < items[smallerChildIndex]) {
				break;
			} else {
				swap(index, smallerChildIndex);
			}
			index = smallerChildIndex;
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
		List<Integer> A = Arrays.asList(1, 2, 3, 4, 5);
		
		int n = A.size();
		
		for(int i=0;i<n;i++) {
			add(A.get(i));
		}
		int ans = 0;
		int curr = poll();
		for(int i=1;i<n;i++) {
			int temp = poll();
			curr += temp;
			ans += curr;
			System.out.println(curr + " " + ans + " " + temp);
			add(curr);
			curr = poll();
		}
		System.out.println(ans);
	}
}