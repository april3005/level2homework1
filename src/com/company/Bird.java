package com.company;

public class Bird extends Animal {
    private Location location;

    public Location getLocation() {
        return location;
    }

    public Bird (String name, int age, Location location) {
        super(name, age);
        this.location = location;
    }

    final public void greeting (){
        System.out.println("Hello");
    }

    public void greeting (String greeting){
        System.out.println(greeting);
    }

    public String getInfo(){
        return getName() + " " + getAge() + " " + getLocation().getName();
    }


}