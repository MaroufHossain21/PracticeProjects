package iquestions;

import org.openqa.selenium.json.JsonOutput;

public class NoSuchElement {
    String name;
    public static void main(String[] args){

        NoSuchElement dog1 = new NoSuchElement();
        dog1.bark();
        dog1.name = "Tommy";
        dog1.eat();

        NoSuchElement[] myDogs = new NoSuchElement[3];
        myDogs[0] = new NoSuchElement();
        myDogs[1] = new NoSuchElement();
        myDogs[2] =dog1;


        myDogs[0].name = "Pit";
        myDogs[1].name = "Bull";

        System.out.println("last dog's name is ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            myDogs[x].eat();
            x = x + 1;
        }



    }

    private void bark() {
        System.out.println(name + " screams Ruff!" );
    }

    private void eat(){
        System.out.println(name + " is hungry af! ");
    }

    private void chaseTigers(){}
}
