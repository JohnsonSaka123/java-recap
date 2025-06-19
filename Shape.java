public class Shape {
  
  public double getArea(){
      return 0;
  }


  public static void main(String[] args) {

    Rectangle rec = new Rectangle();
    rec.width = 23;
    rec.height = 22;
    Circle circ = new Circle();
    circ.radius = 20.0;
    Shape[] shapes = { rec, circ };

    for (Shape s : shapes) {
      System.out.println("Area: "  + s.getArea());

    }
  }

}

class Rectangle extends Shape {
  int width;
  int height;

  @Override
  public double getArea(){
    return width * height ;
  }
}

class Circle extends Shape{
  double radius;

  @Override
  public double getArea(){
    return Math.PI * (radius * radius) ;
  }


  
}


   