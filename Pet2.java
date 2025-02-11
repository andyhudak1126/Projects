// Author: Andrew Hudak
// CPSC1302: Module 3 Assignment 1

public class Pet2

{
    // Private data fields
    private String name;
    private String type;
    private int age;

    // Default constructor
    public Pet2()

    {
        this.name = "Pet Name";
        this.type = "Animal";
        this.age = 1;
    }

    // Custom constructor with parameters for type, name, and age
    public Pet2(String type, String name, int age)

    {
        this.setType(type);
        this.setName(name);
        this.setAge(age);
    }

    // Getter and setter methods for name
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // Getter and setter methods for type
    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    // Getter and setter methods for age
    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if (age < 0)
        {
            System.out.println("Age cannot be negative. Setting to default value 1.");
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    // toString method to display pet information
    public String toString()
    {
        return "Pet information:\nType: " + type + "\nName: " + name + "\nSound: " + speak() + "\nAge: " + age;
    }

    // Speak method to return sound based on the pet's type
    public String speak()
    {
        if (type.equalsIgnoreCase("dog"))
        {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat"))
        {
            return "Meow";
        } else
        {
            return "Yowl";
        }
    }
}
