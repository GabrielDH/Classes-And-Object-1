package pet;

public class car {
	private int age;
	private String model;
	private String make;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public car () {
		
	}

	public car(String model,String make) {
		this.model=model;
		this.make=make;
		this.age=2020;
	}
	
	public car(String model,String make,int age) {
		this.model=model;
		this.make=make;
		this.age=age;
	}
}

