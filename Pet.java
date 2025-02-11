// Author: Andrew Hudak
// CPSC1302: Module 2 Assignment 2

public class Pet {

    //private data fields
    private String name;

//public Constructor
public Pet()
    {
    this.setName("");
    }
//public set or mutator method
public void setName(String newName)
    {
    this.name = newName;
    }
//public get or accessor method
public String getName()
    {
    return this.name;
    }
//public toString method to be printed
public String toString()
    {
    String output = "Pet name: ";
    output+= this.getName();
    return output;
    }
//main
    public static void main(String[] args)
    {
        //instantiate Pet 1
        Pet myPet1 = new Pet();
        myPet1.setName("Zelda");
        System.out.println("Pet information:");
        //System.out.println(myPet1.getName());  (commented out to display just like the example in the assignment)
        System.out.println(myPet1);

        //instantiate Pet 2
        Pet myPet2 = new Pet();
        myPet2.setName("Buster");
        System.out.println("Pet information:");
        //System.out.println(myPet2.getName());  (commented out to display just like the example in the assignment)
        System.out.println(myPet2);
    }
}
