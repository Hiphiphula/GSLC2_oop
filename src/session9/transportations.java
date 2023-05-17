package session9;
//parent abstract class
public abstract class transportations{ 
	String model;
	int year;
	int days;
	
//	constructor 
	public transportations(String model, int year,int days){
		this.model = model;
		this.year = year;
		this.days = days;
	}
	
//	getter
	public String getmodel()
	{
		return model;
	}
	
	public int getyear()
	{
		return year;
	}
	
	public int getdays()
	{
		return days;
	}
}
