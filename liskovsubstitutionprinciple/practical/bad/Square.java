
public class Square extends Rectangle {

	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		super.setWidth(height);
	}

	@Override
	public void setWidth(double width) {
		super.setHeight(width);
		super.setWidth(width);
	}

}

// Now we see where this will cause issues. below is *someMethod* in some class
class SomeClass{
	public void someComplexMethod(Rectangle rectangle){
		System.out.println("Old height is " + rectangle.getHeight());
		rectangle.setHeight(getUpdatedHeightFromSomeAPI());
		System.out.println("Old width is " + rectangle.getWidth()); // wont work as expected for square
		rectangle.setHeight(getUpdatedWidthFromSomeAPI());
		
	
	    // this wont work as expected if rectangle is an instance of `square` as setHeight will override the width also which we could not print out to user then
	}
}

