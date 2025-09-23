package ProblemSet_9b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GuestTest {

    @Test
    public void testCharges() {
	Guest guest = new Guest("Sid", "James", "12 North Lane, Guildford, Surrey", "01483 654321");

	Service service1 = new Service("ROOM12345", "Room", VATRate.STANDARD);
	guest.addCharge(service1, 200);

	Service service2 = new Service("DRIN12346", "Drink", VATRate.LOW);
	guest.addCharge(service2, 10);

	Service service3 = new Service("NEWS12347", "Newspaper", VATRate.ZERO);
	guest.addCharge(service3, 1);

	assertEquals(3, guest.getCharges().size());
    }

    @Test
    public void testGuest() {
	Guest guest = new Guest("Sid", "James", "12 North Lane, Guildford, Surrey", "01483 654321");

	assertEquals("Sid", guest.getForename());
	assertEquals("James", guest.getSurname());
	assertEquals("12 North Lane, Guildford, Surrey", guest.getAddress());
	assertEquals("01483 654321", guest.getTelephone());

	System.out.println(guest);
    }

    @Test
    public void testLow() {
	Guest guest = new Guest("Sid", "James", "12 North Lane, Guildford, Surrey", "01483 654321");

	Service service1 = new Service("ROOM12345", "Room", VATRate.LOW);
	guest.addCharge(service1, 60);

	Service service2 = new Service("ROOM12345", "Room", VATRate.LOW);
	guest.addCharge(service2, 90);

	assertEquals(150, guest.calculateTotalChargeWithoutVAT(), 0);
	assertEquals(7.5, guest.calculateVATChargeAtRate(VATRate.LOW), 0);
    }

    @Test
    public void testStandard() {
	Guest guest = new Guest("Sid", "James", "12 North Lane, Guildford, Surrey", "01483 654321");

	Service service1 = new Service("ROOM12345", "Room", VATRate.STANDARD);
	guest.addCharge(service1, 60);

	Service service2 = new Service("ROOM12345", "Room", VATRate.STANDARD);
	guest.addCharge(service2, 90);

	assertEquals(150, guest.calculateTotalChargeWithoutVAT(), 0);
	assertEquals(30, guest.calculateVATChargeAtRate(VATRate.STANDARD), 0);
    }
}