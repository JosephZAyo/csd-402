/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m1_programming_assignment;

/**
 *
 * @author Joseph Ayo
 * 1/12/2025
 * Project Assignment M1 - CSD 402
 * Program Function: Utilize given equations to calculate the Joules required to heat water from initialTemperature to finalTemperature.
 */
import java.util.Scanner;

public class WaterEnergyCalculator {
    public static void main(String[] args) {
        // Get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the amount of water in kg
        System.out.print("Please enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        // Prompt the user for the initial temperature (in Celsius)
        System.out.print("Please enter the initial temperature of the water (in Celsius): ");
        double initialTemperature = scanner.nextDouble();

        // Prompt the user for the final temperature (in Celsius)
        System.out.print("Please enter the final temperature of the water (in Celsius): ");
        double finalTemperature = scanner.nextDouble();

        // Calculate the energy needed to heat the water using the formula
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Output the result
        System.out.println("The energy required to heat the water is: " + energy + " Joules");

        // Close the scanner
        scanner.close();
    }
}