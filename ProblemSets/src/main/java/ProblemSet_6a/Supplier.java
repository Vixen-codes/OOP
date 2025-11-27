package ProblemSet_6a;

public class Supplier {
	    private String name;
	    private String phone;
	    public Supplier(String name, String phone) {
	        if (!isValidPhone(phone)) {
	            throw new IllegalArgumentException("Invalid phone number");
	        }
	        this.name = name;
	        this.phone = phone;
	    }
	    private boolean isValidPhone(String phone) {
	        if (phone == null) {
	            return false;
	        }
	        // Remove any dash that might be there
	        String digits = phone.replace("-", "");
	        
	        // Must be exactly 11 digits and start with 01483
	        return digits.matches("01483\\d{6}");
	    }
	    public String getName() {
	        return name;
	    }
	    public String getPhone() {
	        return phone;
	    }
	    @Override
	    public String toString() {
	        return name + "(" + phone + ")";
	    }
	}
