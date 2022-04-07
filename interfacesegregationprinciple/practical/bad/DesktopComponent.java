
public class DesktopComponent implements Component {

	public void mouseover(String event) {
		System.out.println("Mouse over event fired");

	}
	public void clickCursor(String event) {
		System.out.println("mouse click event fired");

	}

	public void pinch(String event) {
		throw new UnsupportedOperationException("pinch not supported");

	}
	public void swipe(String event) {
		throw new UnsupportedOperationException("swipe not supported");
	}

}
