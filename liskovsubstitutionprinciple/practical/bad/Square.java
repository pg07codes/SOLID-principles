
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
		rectangle.setHeight(getHeightFromSomeAPI());
		rectangle.setWidth(getWidthFromSomeAPI());
		// .
		// . something happening ...grrr ..ggrr
	
		return rectangle.computeArea(); // this wont work as expected if rectangle is an instance of `square` as setWidth will override the value setHeight `set` which might not be desirable
	}
}

