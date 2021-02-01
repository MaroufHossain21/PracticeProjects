package iquestions;

public class Car {
    private String color;
    private String make;
    private String model;
    private int price;
    private int year;

    void increaseSpeed(){
        System.out.println("Increasing the speed");
    }

    public String getColor(){
        return this.color;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake(){
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }



    public int getYear(){
        return this.year;

    }


 public void setYear(int year){
        if(year > 1900){
            this.year = year;
            System.out.println("This year is not valid");
        }
 }



}


