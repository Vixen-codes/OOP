/**
 * FoodTest.java
 */

package ProblemSet_2b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "Food" class.
 *
 * @author Stella Kazamia
 */
public class FoodTest {

    /**
     * Main entry point for the "Meal/Food" exercise.
     *
     */

    @Test
    public void testFoodOne() {
	Food food = new Food("Fish and Chips", 0.2);
	assertEquals("Fish and Chips", food.getName());

    }

    @Test
    public void testFoodTwo() {
	Food food = new Food("Double Chocolate Brownie", 92);
	assertEquals(92, food.getAmountOfSugar(), 0);

    }

}
