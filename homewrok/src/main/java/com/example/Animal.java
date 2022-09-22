 /**
 * @author Lam Vinh Vong
 * Home work 1
 * Exercise 5
 * The class defines or inherits the following attributes of an Animal: 
 * type of the animal, name of the animal, age, male or female, 
 * which environment it lives in.
 * The class has the following functionality where the action is simply printed to command line: 
 * move(), sound(), eat(), sleep(), toString().
 */

package com.example;

public class Animal {
	/**
     * The attributes of Animal Class
     * 
     */
    private String type;
    private String name;
    private int age;
    private String gender;
    private String environment;
    private double speed;
    
    
    /**
     * The constructor 
     * @param type
     * @param name
     * @param age
     * @param gender
     * @param environment
     * @param speed
     */
	public Animal(String type, String name, String gender,
			String environment, int age, int speed) {
		this.type = type;
		this.name = name;
		this.gender = gender;
		this.environment = environment;
		this.age = age;
		this.speed = speed;
	}
	
	//Getter and Setter
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


@Override
public String toString(){
    return type + " " + name + " is "  + gender + ","
    		+ " live in " + environment + "," + age + "years old, " + 
    		"move with speed " + speed + " mile/hr";
}
}


interface Domesticated {
	void walk();

	void greetHuman();
}

interface Swimmers {
	void swim();

}

interface Scratcher {
	void scratch();
}

/**
* The Dog class is a type of animal and implements Domesticated interface
* It defines or inherits the following attributes of class Animal including: 
* type, name, age, male or female, living environment, and speed. 
* The class contains the functionalities of Animal: move(), sound(), eat(), sleep(), toString(). 
* The class contains the following functionality: bark(). 
* The class implements actions from interface Domesticated.
*/
class Dog extends Animal implements Domesticated {
	public Dog(String type, String name, String gender, String environment, int age, int speed) {
		super(type, name, gender, environment, age, speed);
	}

	void move() {
		System.out.println("The dog is moving");
	}

	public void sound() {
		System.out.println("The dog sounds 'Woowoo'");
	}

	public void eat() {
		System.out.println("The dog eats bone");
	}

	public void sleep() {
		System.out.println("The dog sleeps");
	}

	public void bark() {
		System.out.println("The dog barks");
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void walk() {
		System.out.println("The Dog is walking outside  ");
	}

	@Override
	public void greetHuman() {
		System.out.println("The dog wave its' tail to greet people");
	}
}

class Cat extends Animal implements Domesticated, Scratcher {
	public Cat(String type, String name, String gender, String environment, int age, int speed) {
		super(type, name, gender, environment, age, speed);
	}

	 public void move() {
		System.out.println("The cat climbs over tree");
	}

	 public void sound() {
		System.out.println("The cat sounds 'Meow' ");
	}

	public void eat() {
		System.out.println("The cat eats fish");
	}

	public void sleep() {
		System.out.println("cat sleeps ");
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	 public void walk() {
		System.out.println("The cats walk");
	}

	@Override
	public void greetHuman() {
		System.out.println("The cat greets human");
	}

	@Override
	 public void scratch() {
		System.out.println("The cat scratches the mat");
	}
}

class Racoon extends Animal implements Scratcher {
	public Racoon(String type, String name, String gender, String environment, int age, int speed) {
		super(type, name, gender, environment, age, speed);
	}

	 void move() {
		System.out.println("The racoon moves");
	}

	 void sound() {
		System.out.println("The racoon sounds");
	}

	public void eat() {
		System.out.println("The racoon eats wood");
	}

	 void sleep() {
		System.out.println("Racoon sleep");
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void scratch() {
		System.out.println("The racoon scratch");
	}
}

class Whale extends Animal implements Swimmers {
	public Whale(String type, String name, String gender, String environment, int age, int speed) {
		super(type, name, gender, environment, age, speed);
	}

	void move() {
		System.out.println("The whale move");
	}

	void sound() {
		System.out.println("The whale sound");
	}

	void eat() {
		System.out.println("The whale eats");
	}

	void sleep() {
		System.out.println("Whale whale sleep");
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void swim() {
		System.out.println("The whale swim");
	}
}

