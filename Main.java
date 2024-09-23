/*Create a class called HeartRates. The class attributes
should include the person’s first name, last name and date of birth (consisting of separate attributes
for the month, day and year of birth). Your class should have a constructor that receives this data as
parameters. For each attribute provide set and get methods. The class also should include a method
that calculates and returns the person’s age (in years), a method that calculates and returns the person’s maximum heart rate and a method that calculates and returns the person’s target heart rate.
Write a Java app that prompts for the person’s information, instantiates an object of class HeartRates and prints the information from that object—including the person’s first name, last name and
date of birth—then calculates and prints the person’s age in (years), maximum heart rate and target heart - rate range*/

import java.time.LocalDateTime; // Import the LocalDateTime class

import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Main {

  public static void main(String[] args) {

    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);

    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}