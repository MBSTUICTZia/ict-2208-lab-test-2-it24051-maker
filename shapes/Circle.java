package shapes;
class Circle extends Shape{
	private double radius;
	public Circle(String color,boolean filled,double radius){
		super(color,filled);
		this.radius=radius;
	}
	@Override
	public double getArea(){
		return 3.1416*radius*radius;
	}
	@Override
	public double getPerimeter(){
		return 2*3.1416*radius;
	}
	@Override
	public String toString(){
		return "Circle["+super.toString()+",radius="+radius+"]";
	}
}
