package com.noshio.ArrayList;

/**
 * the noshio ArrayList is a resizable arrayList that does not implement any
 * interface. As in the standard java ArrayList it capacity grows automatically.
 * This array list should not be used for high volumes of data, but is useful
 * for small learning projects.
 * 
 * @author martins
 *
 * @param <T>
 */
public class ArrayList<T> {

	private T[] bag;
	private int currentBagElements = 0;
	private int currentBagDimension = 0;

	public ArrayList() {
		DataStrucureinitialize();
	}


	/**
	 * Returns true if this list contains no elements.
	 * @param element
	 * @return boolean
	 */
	public boolean add(T element) {
		bag[currentBagElements] = element;
		currentBagElements++;
		return increaseBagSize();
	}

	/**
	 * Returns the element at the specified position in this list.
	 * @param position
	 * @return int
	 */
	public T get(int position) {
		if (position > currentBagDimension) {
			throw new IndexOutOfBoundsException("Non existing position in referenced ArrayList");
		}
		return bag[position];
	}

	/**
	 * Removes the element at the specified position in this list.
	 * @param position
	 * @return boolean
	 */
	public boolean remove(int position) {
		if (position > currentBagDimension-1) {
			throw new IndexOutOfBoundsException("Non existing position in referenced ArrayList");
		}
		@SuppressWarnings("unchecked")
		T[] tempbag = (T[]) new Object[bag.length - 1];
		currentBagDimension--;
		System.arraycopy(bag, 0, tempbag, 0, position);// partial copy without requested element to remove
		System.arraycopy(bag, position + 1, tempbag, position, tempbag.length - position);// copy remainder of list
		currentBagElements--;
		bag = tempbag;
		tempbag = null;// release tempBag
		return true;
	}

	/**
	 * Returns the number of elements in this list.
	 * @return int
	 */
	public int size() {
		return currentBagElements;
	}
	
	/**
	 * Returns true if this list contains no elements.
	 * @return boolean
	 */
	public boolean isEmpty() {
		return (currentBagElements==0?true:false);	
	}

	/**
	 * Removes all of the elements from this list.
	 *  @return void
	 */
	public void clear() {
		bag = null;
		currentBagElements=0;
		currentBagDimension=0;
		DataStrucureinitialize();
	}

	@SuppressWarnings("unchecked")
	private void DataStrucureinitialize() {
		bag = (T[]) new Object[1];
		currentBagDimension++;
	}

	private boolean increaseBagSize() {
		@SuppressWarnings("unchecked")
		T[] tempBag = (T[]) new Object[bag.length + 1];
		currentBagDimension++;
		System.arraycopy(bag, 0, tempBag, 0, bag.length);
		bag = tempBag;
		tempBag = null;// release tempBag
		return true;
	}

}
