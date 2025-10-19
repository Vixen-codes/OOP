package lab_2;

public class NumberInfo {
  
	private int limit;
	private int value;
	
	public NumberInfo(int Limit) {
		this.limit = Limit;
	}

	public int getValue() {
		return value;
	}

	public void increment() {
		this.value = (this.value) % this.limit;
		this.value++;
	}
}
