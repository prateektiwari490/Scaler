package Class_69_Heaps_I;

import java.util.Arrays;
import java.util.List;

public class Maximum_array_sum_after_B_negations {
	private static int capacity = 5;
	private static int size = 0;

	public static int[] items = new int[capacity];
	
	public static void initialize() {
		capacity = 5;
		size = 0;
		for (int i = 0; i < capacity; i++) {
			items[0] = 0;
		}
	}

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
		List<Integer> A = Arrays.asList(57, 3, -14, -87, 42, 38, 31, -7, -28, -61);
		int B = 10;
		
		int n = A.size();
		
		int ans = 0;
		for(int i=0;i<n;i++) {
			if(A.get(i) > 0) {
				ans += A.get(i);
			}else {
				ans -= A.get(i);
			}
			add(A.get(i));
		}
		System.out.println(ans);
		while(B-- >0) {
			if(peek() < 0) {
				int temp = poll();
				temp = -temp;
				add(temp);
			}else {
				break;
			}
		}
		B++;
		if(B%2 != 0) {
			int temp = poll();
			temp = -temp;
			add(temp);
		}
		while(peek() < 0) {
			int temp = poll();
			ans += temp*2;
		}
		System.out.println(ans);
	}

}