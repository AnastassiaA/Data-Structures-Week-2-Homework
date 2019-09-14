
public class Image {
	protected int pixels;
	protected int size;
	
	public Image() {
		this.pixels = 0;
		this.size = 0;
	}

	public Image(int pixels, int size) {
		super();
		this.pixels = pixels;
		this.size = size;
	}

	public int getPixels() {
		return pixels;
	}

	public void setPixels(int pixels) {
		this.pixels = pixels;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Image [pixels=" + pixels + ", size=" + size + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
}
