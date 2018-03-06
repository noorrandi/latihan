public class Circle2{
	/* the radius of the circle */
	double radius;

	/* the number of objects created */
	static int numberOfObjects = 0;

	/* construct a circle with radius 1 */
	Circle2(){
		radius = 1.0;
		numberOfObjects++;
	}

	/* construct a circle with a specifies radius */
	Circle2 (double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}

	/* return numberOfObjects */
	static int getNumberOfObjects(){
		return numberOfObjects;
	}

	/* return the area of this circle */
	double getArea(){
		return radius * radius * Math.PI;
	}
}