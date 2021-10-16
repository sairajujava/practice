package collections;

import java.util.Arrays;

public class ArrayListCustom<E> {

	// initial capacity of AL

	private static final int INITIAL_CAPACITY = 10;

	// initial size of an AL

	private int size = 0;
	private final int BUFFER_SIZE = 1;

	private Object[] customArr = {};

	public ArrayListCustom() {

		customArr = new Object[INITIAL_CAPACITY];

	}

	private int capacity() {

		return customArr.length;

	}

	private void add(E e) {

		if (size == customArr.length) {

			// increase the capacity
			ensureCapacity();
		}

		customArr[size] = e;
		size++;

	}

	private int size() {

		return size;

	}

	// It will be increasing the size
	private void ensureCapacity() {

		int newCapacity = customArr.length * 2 + BUFFER_SIZE;
		System.out.println("New Capacity:" + newCapacity);

		customArr = Arrays.copyOf(customArr, newCapacity);

	}

	private void display() {

		for (Object obj : customArr) {
			System.out.println(obj);
		}

	}

	@SuppressWarnings("unchecked")
	private E get(int index) {

		if (index < 0 || index >= size) {

			throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size " + index);

		}

		return (E) customArr[index];
	}

	private Object remove(int index) {
		if (index < 0 || index >= size) {

			throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size " + index);

		}
		Object removedElement =  customArr[index];
		for (int i = index; i < size - 1; i++) {
			customArr[i] = customArr[i + 1];
     }
     size--; // reduce size of ArrayListCustom after removal of element.

     return removedElement;
		

	}

	public static void main(String[] args) {
		ArrayListCustom<Integer> al = new ArrayListCustom<Integer>();
		int size = al.size();

		System.out.println("Before Adding CustomArray Size :" + al.size);

		System.out.println("Initial Capacity:" + al.capacity());

		al.add(10);
		al.add(101);
		al.add(102);
		al.add(103);
		al.add(104);
		al.add(105);
		al.add(106);
		al.add(107);
		al.add(109);
		al.add(108);
		al.add(102);
		al.add(110);
		System.out.println("After adding CustomArray Size :" + al.size);

		al.display();
		int element = al.get(10);
		System.out.println("get:" + element);
		Object obj = al.remove(9);
		System.out.println("remove:"+obj);
	}

}
