/**
 * MealTest.java
 */

package ProblemSet_2b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "Meal" class.
 *
 * @author Stella Kazamia
 */
public class MealTest {

    @Test
    public void testMealOne() {
	Meal meal = new Meal(new Food("fish and chips", 0.2), new Food("apple pie", 17));
	assertEquals(17.2, meal.calculateTotalSugarLevel(), 0);

    }

    /**
     * Main entry point for the "Meal/Food" exercise.
     *
     */
    @Test
    public void testMealOneValues() {
	Meal meal = new Meal(new Food("Fish and Chips", 0.2), new Food("Apple Pie", 17));
	assertEquals("Meal [mainCourse = Fish and Chips, dessert = Apple Pie]", meal.toString());
    }

    @Test
    public void testMealThree() {
	Meal meal = new Meal(new Food("Vegetarian Stuffed Peppers", 2), new Food("Fruit Salad", 45));
	assertEquals(47, meal.calculateTotalSugarLevel(), 0);

    }

    @Test
    public void testMealThreeValues() {
	Meal meal = new Meal(new Food("Vegetarian Stuffed Peppers", 2), new Food("Fruit Salad", 45));
	assertEquals("Meal [mainCourse = Vegetarian Stuffed Peppers, dessert = Fruit Salad]", meal.toString());

    }

    @Test
    public void testMealTwo() {
	Meal meal = new Meal(new Food("BLT Sandwich", 4.7), new Food("Dark Chocolate", 48));
	assertEquals(52.7, meal.calculateTotalSugarLevel(), 0);

    }

    @Test
    public void testMealTwoValues() {
	Meal meal = new Meal(new Food("BLT Sandwich", 4.7), new Food("Dark Chocolate", 48));
	assertEquals("Meal [mainCourse = BLT Sandwich, dessert = Dark Chocolate]", meal.toString());
    }
}
