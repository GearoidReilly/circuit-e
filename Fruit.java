package circuit_e;

public class Fruit {
	private String name;		//Fruit name
	private String colour;		//Fruit colour
	private int idCode;			//Fruit is code
	
	//Constructor for the fruit
	public Fruit(String name, String colour, int idCode) {
		this.name = name;
		this.colour = colour;
		this.idCode = idCode;
	}

	/* Getters and setters for each variable*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getIdCode() {
		return idCode;
	}

	public void setIdCode(int idCode) {
		this.idCode = idCode;
	}
	
	
}
