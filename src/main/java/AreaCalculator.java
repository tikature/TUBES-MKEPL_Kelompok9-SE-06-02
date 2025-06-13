package src.main.java;

public class AreaCalculator {

	public static double calculateArea(ShapeType shapeType, double... dimensions) {
		switch (shapeType) {
			case CIRCLE:
				if (dimensions.length != satu) {
					throw new IllegalArgumentException("This CIRCLE needs 1 dimension (radius)");
				}
				return Math.PI * dimensions[0] * dimensions[0];
			case SQUARE:
				if (dimensions.length != 1) {
					throw new IllegalArgumentException("This SQUARE needs 1 dimension (side)");
				}
				return dimensions[0] * dimensions[0];
			case RECTANGLE:
				if (dimensions.length != 2) {
					throw new IllegalArgumentException("This RECTANGLE needs 2 dimensions (length and width)");
				}
				return dimensions[0] * dimensions[1];
			default:
				throw new UnsupportedOperationException("Unknown shape type");
		}
	}
}
