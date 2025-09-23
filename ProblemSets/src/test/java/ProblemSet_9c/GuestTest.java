package ProblemSet_9c;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GuestTest {

    @Test
    public void testMixed() {
	Guest guest = new Guest("Bob", "Ross", "10 Guildford Park Road, Guildford, Surrey", "01483 123456");

	Service service1 = new Service("ROOM12345", "Room", VATRate.LOW);
	guest.addCharge(service1, 50);

	Service service2 = new Service("ROOM12346", "Room", VATRate.LOW);
	guest.addCharge(service2, 100);

	Service service3 = new Service("DRIN25697", "Drinks", VATRate.STANDARD);
	guest.addCharge(service3, 30);

	Service service4 = new Service("BRFA65878", "Breakfast", VATRate.ZERO);
	guest.addCharge(service4, 15.90);

	assertEquals(195.9, guest.calculateTotalChargeWithoutVAT(), 0);
	assertEquals(0, guest.calculateVATChargeAtRate(VATRate.ZERO), 0);
	assertEquals(7.5, guest.calculateVATChargeAtRate(VATRate.LOW), 0);
	assertEquals(6, guest.calculateVATChargeAtRate(VATRate.STANDARD), 0);

    }

    @Test
    public void testMixedIncVAT() {
	Guest guest = new Guest("Bob", "Ross", "10 Guildford Park Road, Guildford, Surrey", "01483 123456");

	Service service1 = new Service("ROOM12345", "Room", VATRate.STANDARD);
	guest.addCharge(service1, 120);

	Service service2 = new Service("ROOM12346", "Room", VATRate.STANDARD);
	guest.addCharge(service2, 150);

	Service service3 = new Service("BRFA65878", "Breakfast", VATRate.LOW);
	guest.addCharge(service3, 47.80);

	assertEquals(374.19, guest.calculateTotalChargeIncVat(), 0);

    }

    @Test
    public void testSecondGuest() {
	Guest guest = new Guest("Mariyah", "Zaid", "25 South Lane, Guildford, Surrey", "01483 159357");

	assertEquals("Mariyah", guest.getForename());
	assertEquals("Zaid", guest.getSurname());
	assertEquals("25 South Lane, Guildford, Surrey", guest.getAddress());
	assertEquals("01483 159357", guest.getTelephone());

    }

    @Test
    public void testStandard() {
	Guest guest = new Guest("Bob", "Ross", "10 Guildford Park Road, Guildford, Surrey", "01483 123456");

	Service service1 = new Service("ROOM12345", "Room", VATRate.STANDARD);
	guest.addCharge(service1, 60);

	Service service2 = new Service("ROOM12345", "Room", VATRate.STANDARD);
	guest.addCharge(service2, 80);

	assertEquals(140, guest.calculateTotalChargeWithoutVAT(), 0);
	assertEquals(28, guest.calculateVATChargeAtRate(VATRate.STANDARD), 0);
	assertEquals(168, guest.calculateTotalChargeIncVat(), 0);

    }

    @Test
    public void testToStringOutput() {
	Guest guest = new Guest("Alice", "Wonderland", "55 Guildford Park Avenue, Guildford, Surrey", "01483 654987");

	assertEquals("Alice Wonderland, 55 Guildford Park Avenue, Guildford, Surrey, 01483 654987", guest.toString());
    }

}