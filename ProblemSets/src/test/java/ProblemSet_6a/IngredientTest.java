package ProblemSet_6a;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class IngredientTest {

	@Test
	public void testGetCookedWeightVeg() {
		Supplier supplier = new Supplier("Bobby", "01483-111252");
		Ingredient ingredient = new Ingredient("Asparagus", IngredientType.VEGETABLE, supplier, 134);

		assertEquals(107.2, ingredient.getCookedWeight(), 0);
	}

	@Test
	public void testIngredient() {
		Supplier supplier = new Supplier("Bloggs", "01483-681234");
		Ingredient ingredient = new Ingredient("Coconut Cream", IngredientType.VEGETABLE, supplier, 250);

		assertEquals("Coconut Cream", ingredient.getName());
		assertEquals(IngredientType.VEGETABLE, ingredient.getType());
		assertEquals(supplier.toString(), ingredient.getSupplier());
		assertEquals(250, ingredient.getRawWeight(), 0);

	}

	@Test
	public void testIngredientCookedMeat() {

		try {
			Supplier supplier = new Supplier("Bobby", "08001111");
			Ingredient ingredient = new Ingredient("Lamb Chop", IngredientType.MEAT, supplier, 260);
			fail("Expected IllegalArgumentException was not thrown");
		} catch (IllegalArgumentException e) {
		}
	}

	@Test
	public void testIngredientMeat() {
		Supplier supplier = new Supplier("Bobby", "01483123456");
		Ingredient ingredient = new Ingredient("Lamb Chop", IngredientType.MEAT, supplier, 245);

		assertEquals("Lamb Chop", ingredient.getName());
		assertEquals(IngredientType.MEAT, ingredient.getType());
		assertEquals(196.0, ingredient.getCookedWeight(), 0);

	}

}
