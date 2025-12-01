package ProblemSet_9a;

public class Charge {
    private Service service;
    private double charge;

    public Charge(Service service, double charge) {
    	if (service == null) {
    		throw new IllegalArgumentException("Service cannot be null");
    }
    	if (charge <=0) {
    		throw new IllegalArgumentException("Charge must be greater than zero");
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
    public double calculateVAT() {
    	return charge * service.getRate().getRate();
    }
}
