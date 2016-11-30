//y = mx + b
public class LinearFunction implements LinearFunctionMethods{
	double y; //y value
	double m; //slope
	double x; //x value
	double b; //y intercept
	public LinearFunction(double slope, double YIntc){
		m = slope;
		b = YIntc;
	}
	public double getSlope(){
		return m;
	}
	public double getYintercept(){
		return b;
	}
	public double getRoot(){
		return (-b)/m;
	}
	public double getYvalue(double x1){
		return m * x1 + b;
	}
	public double getXvalue(double y1){
		return (y1 - b)/m;
	}
}
