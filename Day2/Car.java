import java.io.*;
import java.util.*;
class Car
{
    String brand;
    String model;
    int price;
    public Car(String brand, String model,int price) {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    public void displayDetails() {
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price Rs: "+price);
    }

    public int calculateDiscountedPrice(int discountPercent) {
        return price-(price*discountPercent/100);
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String brands=obj.nextLine();
        String models=obj.nextLine();
        int prices=obj.nextInt();
        int discountPercent=obj.nextInt();
        Car car = new Car(brands,models,prices);
        car.displayDetails();
        System.out.println("Discounted Price Rs: " + car.calculateDiscountedPrice(discountPercent));
    }
}
