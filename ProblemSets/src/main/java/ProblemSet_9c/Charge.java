package ProblemSet_9c;

public class Charge {
    private Service service;
    private double charge;

    public Charge(Service service, double charge) {
    	if (service == null) {
    		throw new IllegalArgumentException("Service cannot be null");
    }
    	if (charge <= 0) {
    		throw new IllegalArgumentException("Charge must be greater "
    				+ "than zero");
    	}
    	this.service = service;
    	this.charge = charge;
    }

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}
	//this calcs the VAT amount for this charge.
	//since different services get charged VAT at diff rates
	//the VAT rate has to be takn from the object it is referring to from service
	//and it is calculated by multiplying the charge with the VAT rate
    public double calculateVAT() {
    	return charge * service.getRate().getRate();
    }
}
