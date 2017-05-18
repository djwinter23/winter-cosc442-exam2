package game;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SpellTest {

	private Spell spell;
	private Effect effect;
	@Before
	public void setUp() throws Exception {
		effect = new Effect(4);
		spell = new Spell("evil spell", 3, effect);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testName() {
		assertEquals("evil spell", spell.name());
	}

	@Test
	public void testManaCost() {
		assertEquals(3, spell.manaCost());
	}

	@Test
	public void testEffect() {
		assertEquals(effect.duration, spell.effect().duration);
	}


	@Test
	public void testRequiresTarget() {
		assertTrue(spell.requiresTarget());
	}

	@Test
	public void testSpell() {
		Spell spell2 = new Spell("potion", 6, effect);
		assertEquals("potion", spell2.name());
		assertEquals(6, spell2.manaCost());
		assertEquals(effect.duration, spell2.effect().duration);
	}
	

}
