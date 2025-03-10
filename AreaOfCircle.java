class AreaOfCircle{

    private double radius;

    public AreaOfCircle(double radius){
        this.radius = radius;
    }

    public static double Area(double radius){
        return Math.PI*(radius*radius);
    }
    public static double Circumference(double radius){
        return 2*Math.PI*radius;
    }

    public void getDetails(){
        System.out.println("Radius is "+ radius);
        System.out.printf("Area is %.2f%n", Area(radius));
        System.out.printf("Radius is %.2f%n", Circumference(radius));
    }

    public static void main(String[] args) {

        AreaOfCircle obj = new AreaOfCircle(7);
        obj.getDetails();
    }
}