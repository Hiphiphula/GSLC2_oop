package session9;
//child class
public class Van extends transportations implements Details{ 

	public Van(String model, int year, int days) {
		super(model, year, days);
	}

	@Override
	public String printType()
	{
		return "van";
	}
	
	@Override
	public long rentCost() { //to calculate the total cost
		
		long cost = 800000 * super.days; //I assume all vans have the same rent cost per day
		
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
