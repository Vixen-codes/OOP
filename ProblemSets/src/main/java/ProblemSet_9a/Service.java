package ProblemSet_9a;

public class Service {
   private String code;
   private VATRate rate;
   private String name;
   public Service(String code,String name, VATRate rate) {
	   validateCode(code);
	   if (name == null) {
		   throw new IllegalArgumentException("name can't be null");
	   }
	   if (rate == null) {
		   throw new IllegalArgumentException("rate cant be null");
	   }
	   this.code = code;
	   this.name = name;
	   this.rate = rate;
   }
   private void validateCode(String code) {
   if (code == null) {
	throw new IllegalArgumentException("code cant be null");
	   }
   if (code.length()!=9) {
	throw new IllegalArgumentException("code must be 9 characters long");
   }
   String letters = code.substring(0, 4);
   String digits = code.substring(4,9);
   if (!letters.matches("[A-Z]{4}")) {
	   throw new IllegalArgumentException("first 4 letters must be letters");
   }
   if (!digits.matches("\\d{5}")) {
	   throw new IllegalArgumentException("last 5 characters must be digits");
   }
   }
   public String getCode() {
	return code;
   }
   public VATRate getRate() {
	return rate;
   }
   public String getName() {
	return name;
   }
}
