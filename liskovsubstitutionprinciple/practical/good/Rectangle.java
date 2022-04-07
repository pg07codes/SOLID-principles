
public class Rectangle {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// notice : the idea is to not use explicit setHeight,setWidth methods which might cause issues
	// thus, we use constructor to set it and only get methods are present. This will make sure the issue we // //// noticed in bad example does not happen 

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double computeArea() {
		return width * height;
	}

}
