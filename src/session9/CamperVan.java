package session9;
//child class
public class CamperVan extends transportations implements Details{ 
	public CamperVan(String model, int year, int days) {
		super(model, year, days);
	}

	@Override
	public String printType()
	{
		return "campervan";
	}
	
	@Override
	public long rentCost() { //to calculate the total cost
		 
		long cost = 1000000 * super.getdays(); //I assume all campervans have the same rent cost per day
		
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
