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
	        // Valid formats: "01483-123456" or "01483123456"
	        if (phone == null) {
	            return false;
	        }
	        // Check for format with dash: 01483-123456
	        if (phone.matches("01483-\\d{6}")) {
	            return true;
	        }
	        // Check for format without dash: 01483123456
	        if (phone.matches("01483\\d{6}")) {
	            return true;
	        }
	        return false;
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
