import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LinkedIntListTest {

	@Test
	void testTrue() {
		//creates a sorted LinkedList of various elements
		//should test isSorted: True.
		LinkedIntList list = new LinkedIntList();
		list.add(-3);
		list.add(1);
		list.add(5);
		list.add(5);
		list.add(8);
		list.add(17);
		list.add(25);
		list.add(42);
		list.add(87);
		assertTrue(list.isSorted());
	}
	@Test
	void testIdenticalTrue() {
		//creates a LinkedList of all identical elements
		//should test isSorted: True.
		LinkedIntList list = new LinkedIntList();
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		assertTrue(list.isSorted());
	}
	@Test
	void testFalse() {
		//creates a LinkedList of unsorted elements
		//should test isSorted: False.
		LinkedIntList list = new LinkedIntList();
		list.add(-3);
		list.add(1);
		list.add(5);
		list.add(5);
		list.add(8);
		list.add(17);
		list.add(25);
		list.add(42);
		list.add(40);
		list.add(87);
		assertFalse(list.isSorted());
	}
	@Test
	void testSingleTrue() {
		//creates a LinkedList of only one element
		//should test isSorted: True.
		LinkedIntList list = new LinkedIntList();
		list.add(42);
		assertTrue(list.isSorted());
	}
	@Test
	void testEmptyTrue() {
		//creates a LinkedList that is empty
		//should test isSorted: True.
		LinkedIntList list = new LinkedIntList();
		assertTrue(list.isSorted());
	}
}
