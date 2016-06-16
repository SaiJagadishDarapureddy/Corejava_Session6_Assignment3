package interf_shapes;

public class Circle implements Shape {
	 
    private double radius;
 
    public Circle(double r){
        this.radius = r;
    }
     
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
     // TODO Auto-generated method stub
    }
     
    @Override
    public double getArea(){
        return 3.14*this.radius*this.radius;
     // TODO Auto-generated method stub
    }
 
    public double getRadius(){
        return this.radius;
    }
}
