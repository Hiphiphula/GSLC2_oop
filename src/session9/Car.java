package session9;
//child class
public class Car extends transportations implements Details{ 
	
	public Car(String model, int year, int days) {
		super(model, year, days);
	}

	@Override
	public String printType()
	{
		return "car";
	}
	
	@Override
	public long rentCost() { //to calculate the total cost
		
		long cost = 500000 * super.getdays(); //I assume all cars have the same rent cost per day
		
		return cost;
	}
	
	@Override
	public String getmodel() {
		return super.getmodel();
	}
	
	@Override
	public int getyear() {
		return super.getyear();
	}
	
}
