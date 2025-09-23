package ProblemSet_3b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "AnnualSalary" class.
 *
 * @author Stella Kazamia
 */
public class AnnualSalaryTest {

    /**
     * Test accessors and mutators for a salary.
     */
    @Test
    public void testAccessorsMutators() {
        // Create a salary object.
        AnnualSalary salary = new AnnualSalary();

        // Test setting and getting the salary.
        assertEquals(0, salary.getSalary(), 0);
        salary.setSalary(10000);
        assertEquals(10000, salary.getSalary(), 0);
    }

    /**
     * Test that the basic rate of tax is applied when calculating tax.
     */
    @Test
    public void testCalculateTaxBasic() {
        // Create a salary object which should be above the personal allowance, but
        // below the higher threshold.
        AnnualSalary salary = new AnnualSalary();

        // Tax should be paid at 20% on taxable salary
        salary.setSalary(16475);
        assertEquals(781.0, salary.calculateTax(), 0);

    }

    /**
     * Test that the higher rate of tax is applied when calculating tax.
     */
    @Test
    public void testCalculateTaxExtreme() {
        // Create a salary object which should be above the higher threshold.
        AnnualSalary salary = new AnnualSalary();

        salary.setSalary(125141);
        assertEquals(37488.45, salary.calculateTax(), 0);
    }

    /**
     * Test that the higher rate of tax is applied when calculating tax.
     */
    @Test
    public void testCalculateTaxHigher() {
        // Create a salary object which should be above the higher threshold.
        AnnualSalary salary = new AnnualSalary();

        salary.setSalary(53875);
        assertEquals(8982, salary.calculateTax(), 0);
    }

    /**
     * Test that the higher rate of tax is applied when calculating tax.
     */
    @Test
    public void testCalculateTaxHigherNew() {
        // Create a salary object which should be above the higher threshold.
        AnnualSalary salary = new AnnualSalary();

        // Tax should be paid at 20%, plus 40% on the taxable salary.
        salary.setSalary(100000);
        assertEquals(27432, salary.calculateTax(), 0);
    }

    /**
     * Test that the basic allowance is taken into account when calculating tax.
     */
    @Test
    public void testCalculateTaxNone() {
        // Create a salary object which should be below the personal allowance.
        AnnualSalary salary = new AnnualSalary();

        // No tax should be paid.
        salary.setSalary(1000);
        assertEquals(0, salary.calculateTax(), 0);
    }

    /**
     * Test that the basic allowance is taken into account when calculating tax.
     */
    @Test
    public void testCalculateTaxNoneNew() {
        // Create a salary object which should be below the personal allowance.
        AnnualSalary salary = new AnnualSalary();

        // No tax should be paid.
        salary.setSalary(12560);
        assertEquals(0, salary.calculateTax(), 0);
    }

    /**
     * Test that the basic allowance is taken into account when calculating tax.
     */
    @Test
    public void testCalculateTaxNoSalary() {
        // Create a salary object which should be below the personal allowance.
        AnnualSalary salary = new AnnualSalary();

        // No tax should be paid.
        salary.setSalary(0);
        assertEquals(0, salary.calculateTax(), 0);
    }
}
