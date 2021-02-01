package iquestions;

public class CarDemo {
    public static void main(String[] args) {

        Car bmw = new Car();
        bmw.setMake("BMW");
        bmw.setModel("7-series");
        bmw.setPrice(75599);
        System.out.println("Make of BMW is: " + bmw.getMake() + " Price: $" + bmw.getPrice());
        System.out.println("Model of BMW is: " + bmw.getModel());

        Car benz = new Car();
        benz.setMake("Benz");
        benz.setColor("Black");
        benz.setModel("S550");
        benz.setYear(2020);
        System.out.println("Benz: year,make,model,color" + "   Benz: " + benz.getYear()+ ", " + benz.getMake()
        + ", " + benz.getModel() + ", "+ benz.getColor());

    }

}
