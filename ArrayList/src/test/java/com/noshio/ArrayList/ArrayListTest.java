package com.noshio.ArrayList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {
	ArrayList<Integer> ar;

	@Before
	public void setUp() throws Exception {
		ar = new ArrayList<Integer>();
	}

	@Test
	public void testAdd() {
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
	}

	@Test
	public void testGet() {
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		int elm1 = ar.get(0);
		int elm2 = ar.get(1);
		int elm3 = ar.get(2);
		int elm4 = ar.get(3);
		assertEquals(10, elm1);
		assertEquals(20, elm2);
		assertEquals(30, elm3);
		assertEquals(40, elm4);
	}

	@Test
	public void testRemove() {
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.remove(2);
		assertEquals(3, ar.size());
		int elm1 = ar.get(0);
		int elm2 = ar.get(1);
		int elm3 = ar.get(2);
		assertEquals(10, elm1);
		assertEquals(20, elm2);
		assertEquals(40, elm3);
	}

	@Test
	public void testSize() {
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		assertEquals(4, ar.size());
	}

	@Test
	public void testIsEmpty() {
		assertTrue(ar.isEmpty());
	}

	@Test
	public void testClear() {
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.clear();
		assertTrue(ar.isEmpty());
	}

}
