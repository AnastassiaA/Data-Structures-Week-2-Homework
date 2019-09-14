

public class House {
	protected int ID;
	protected float price;
	protected String location;
	protected String advertiser;
	protected Image photo;
	
	
	public House() {
		ID = 0;
		price = 0.0f;
		location = "";
		advertiser = "";
		photo = new Image();
	}

	public House(int iD, float price, String location, String advertiser, Image photo) {
		super();
		ID = iD;
		this.price = price;
		this.location = location;
		this.advertiser = advertiser;
		this.photo = photo;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAdvertiser() {
		return advertiser;
	}

	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}

	public Image getPhoto() {
		return photo;
	}

	public void setPhoto(Image photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "House [ID=" + ID + ", price=" + price + ", location=" + location + ", advertiser=" + advertiser
				+ ", photo=" + photo + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
	
}
