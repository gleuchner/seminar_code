package seminar.quadrilateral;

public class FloatingPointUtil {

	public static final float EPS = 0.0001f;

	public static boolean compareFloatingPoint(double d, double d2) {
		return Math.abs(d - d2) <= EPS;
	}
}
