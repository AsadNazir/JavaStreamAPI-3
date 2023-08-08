package org.example;

public class Customer {
    private String name;
    private int age;
    private String city;
    private Gender gender;
    private double purchaseAmount;

    // Constructor
    public Customer(String name, int age, String city, Gender gender, double purchaseAmount) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
        this.purchaseAmount = purchaseAmount;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", gender=" + gender +
                ", purchaseAmount=" + purchaseAmount +
                '}';
    }

    // Gender enum
    public enum Gender {
        MALE, FEMALE, OTHER
    }
}
