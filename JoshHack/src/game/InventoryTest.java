package game;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventoryTest {

	private Inventory inventory;
	private Item item;
	@Before
	public void setUp() throws Exception {
		inventory = new Inventory(2);
		item = new Item('A', null, "sword","shiny");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetItems() {
		//fail("Not yet implemented");
		inventory.add(item);
		assertEquals(item, inventory.getItems());
	}
	
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		inventory.add(item);
		assertEquals(item, inventory.get(0));
	}

	@Test
	public void testRemove() {
		//fail("Not yet implemented");
		inventory.add(item);
		inventory.remove(item);
		assertNull(inventory.get(0));
	}

	@Test
	public void testIsFull() {
		//fail("Not yet implemented");
		inventory.add(item);
		inventory.add(item);
		assertTrue(inventory.isFull());
	}

	@Test
	public void testIsFull2() {
		//fail("Not yet implemented");
		inventory.add(item);
		assertFalse(inventory.isFull());
	}
	
}
