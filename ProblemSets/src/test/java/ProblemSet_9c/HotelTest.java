package ProblemSet_9c;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HotelTest {

    /**
     * Dummy implementation of the IGuest interface.
     */
    public class Guest implements IGuest {

	/**
	 * Adds a charge to a guest's record.
	 *
	 * @param service The service the charge has been incurred for.
	 * @param charge  The value of the charge for the service.
	 */
	public void addCharge(Service service, double charge) {
	    // Do nothing.
	}

	public double calculateTotalChargeIncVat() {
	    // Do nothing.
	    return 0;
	}

	/**
	 * Calculates the total charge for the guest without VAT as the total total
	 * charge for each service the guest has used.
	 *
	 * @return The total charge for the guest without VAT.
	 */
	public double calculateTotalChargeWithoutVAT() {
	    // Do nothing.
	    return 0;
	}

	/**
	 * Calculates the total VAT to be charged for all the charges that the guest has
	 * incurred at the specified VAT rate.
	 *
	 * @param rate The required VAT rate.
	 *
	 * @return The total VAT to charge at the specified rate.
	 */
	public double calculateVATChargeAtRate(VATRate rate) {
	    // Do nothing.
	    return 0;
	}

	/**
	 * A string representation of the guest's details, including forename, surname,
	 * address and telephone number.
	 *
	 * @return A string representation of the guest's details.
	 */
	@Override
	public String toString() {
	    return "Forename Surname, Address, Telephone";
	}
    }

    @Test
    public void testGuests() {
	Hotel hotel = new Hotel("Ritz");

	IGuest guest1 = new Guest();
	IGuest guest2 = new Guest();

	hotel.addGuest(guest1);
	hotel.addGuest(guest2);

	assertEquals(2, hotel.getGuests().size());

	assertEquals(
		"Ritz Hotel\n"
			+ "Guest List\nForename Surname, Address, Telephone\nForename Surname, Address, Telephone\n",
		hotel.printGuestList());
    }

    @Test
    public void testValid() {
	Hotel hotel = new Hotel("Holiday Inn");

	assertEquals("Holiday Inn", hotel.getName());
	assertEquals(0, hotel.getGuests().size());
    }

}
