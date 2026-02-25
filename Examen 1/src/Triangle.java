public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){}
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        if(side1 + side2 < side3 || side2 + side3 < side1 || side1 + side2 < side3){
            throw new IllegalTriangleException();
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){
        return this.side1;
    }

    public double getSide2(){
        return  this.side2;
    }

    public double getSide3(){
        return this.side3;
    }

    public double getArea(){
        return Math.sqrt(getPerimeter());
    }

    public double getPerimeter(){
        return (this.side1 + this.side2 + this.side3);
    }

    @Override
    public String toString(){
        return "Triangulo: side  = " + side1 + " + side2 + " + side2 + " + side3 + " + side3;
    }
}
