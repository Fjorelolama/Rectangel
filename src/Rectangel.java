

class areaRectangle {

    double width, height;

    areaRectangle() {
       width = 1;
       height = 1;
    }

    areaRectangle(double width, double height) {

        this.width = width;
        this.height = height;
    }
    double getArea() {
        return (height * width);
    }

    double getPerimeter() {
        return (2 * (height + width));
    }
}

public class Rectangel {
    public static void main(String[] args) {
        areaRectangle rect1 = new areaRectangle(4, 40);
        areaRectangle rect2 = new areaRectangle(3.5,35.9);


        System.out.println("Area of first object = " + rect1.getArea());
        System.out.println("Perimeter of first object = " + rect1.getPerimeter());
        System.out.println("Area of first object = " + rect2.getArea());
        System.out.println("Perimeter of first object = " + rect2.getPerimeter());
    }
}
