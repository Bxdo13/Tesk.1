public class Example2 {
    public static void main(String[] args) {
        Time time =new Time(5,27,53);
        System.out.println(time);
    }
    public class Circle{
        private double radius;
        private String color;

        public Circle() {
        }

        public Circle(double radius) {
        }

        public double getRadius() {
            return radius;
        }

        public double getArea(double radius) {
            return radius * radius * Math.PI;
        }

        @Override
        public String toString() {
            return "radius :"+ getRadius()+"area :"+getArea(radius);
        }
    }
    public class Cylinder extends Circle{

        private double height;

        public Cylinder(){

        }
        public Cylinder(double radius){
            super(radius);
        }
        public  Cylinder(double radius,double height){
            super(radius);
            this.height=height;
        }

        public double getHeight() {
            return height;
        }
        public double getArea(double height,double radius){
            return (2*22*(radius + height))/7;
        }
    }
}
