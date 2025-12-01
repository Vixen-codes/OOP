package ProblemSet_9b;

public enum VATRate {
  ZERO(0.0),
  LOW(0.05),
  STANDARD(0.20);

	private final double rate;
	private VATRate(double rate) {
		this.rate = rate;
	}
	public double getRate() {
		return rate;
	}
	public double getPercentage() {
		return rate * 100;
	}
}
