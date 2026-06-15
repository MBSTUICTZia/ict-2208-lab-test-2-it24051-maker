package shapes;
class Rectangle extends Shape{
	protected double width;
	protected double length;
	
	public Rectangle(String color,boolean filled,double width,double length){
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	@Override
	public double getArea(){
		return width*length;
	}
	@Override
	public double getPerimeter(){
		return 2*(width+length);
	}
	@Override
	public String toString(){
		return "Rectangle["+super.toString()+",width="+width+",length="+length+"]";
		
	}
}
