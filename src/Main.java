import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    loop();
  }

  public static ArrayList<String> getColors(){
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("red");
    colors.add("brown");
    colors.add("yellow");
    colors.add("orange");

    return  colors;
  }

  public static ArrayList<String> getDrinks(){
    ArrayList<String> drinks = new ArrayList<String>();
    drinks.add("pumpkin spiced latte");
    drinks.add("chai tea");
    drinks.add("hot cocoa");

    return  drinks;
  }

  public static String getRandomItem(ArrayList<String> items){
    Random rand = new Random();
    int index = rand.nextInt(items.size());

    return items.get(index);
  }

  public static void getTempFromUser(){

    Scanner keyboard = new Scanner(System.in);
    int temp = 0;

    System.out.print("Enter temperature: ");
    temp = keyboard.nextInt();

    printMessage(temp);

  }

  public static double getTempInC(int tempInF){
    return (tempInF - 32) * (5f / 9f);
  }

  public static void printMessage(int temp){

    if(temp >= 45 && temp <= 70){
      System.out.print("The temperature in Celsius is ");
      System.out.printf("%.2f", getTempInC(temp));
      System.out.println("\nToday's weather is a perfect fall day for a cup " +
              "of " + getRandomItem(getDrinks()) + ". The color of the leaves are " + getRandomItem(getColors()) + ".");
    }

    else if(temp < 45){
      System.out.print("The temperature in Celsius is ");
      System.out.printf("%.2f", getTempInC(temp));
      System.out.println("\nThe weather is a bit chilly for fall.");
    }

    else {
      System.out.print("The temperature in Celsius is ");
      System.out.printf("%.2f", getTempInC(temp));
      System.out.println("\nThe weather is a bit warm for fall.");
    }

  }

  public static void loop(){
    Scanner keyboard = new Scanner(System.in);
    String playAgain = "";

    do {
      getTempFromUser();

      System.out.print("Would you like to enter another temperature Y(yes) " +
              "or N(no): ");
      playAgain = keyboard.nextLine();
      System.out.println();

    } while(playAgain.equalsIgnoreCase("y"));
  }
}
