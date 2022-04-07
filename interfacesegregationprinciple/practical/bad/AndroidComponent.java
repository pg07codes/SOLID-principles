
public class AndroidComponent implements Component {

	public void mouseover(String event) {
		throw new UnsupportedOperationException("mouseover not supported");

	}
	public void clickCursor(String event) {
		throw new UnsupportedOperationException("mouse cursor click not supported");
	}

	public void pinch(String event) {
		System.out.println("pinch event fired");
	}
	public void swipe(String event) {
		System.out.println("swipe event fired");
	}

}
