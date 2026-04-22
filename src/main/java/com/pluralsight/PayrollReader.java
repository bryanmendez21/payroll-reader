package com.pluralsight;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PayrollReader {
    public static void main(String[] args) throws IOException {
        try {
            Scanner userInput = new Scanner(System.in);
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            System.out.print("Enter the name of the file employee file to process: ");
            String nameOfFile = userInput.nextLine();
            System.out.print("Enter the name of the payroll file to Create: ");
            String fileCreated = userInput.nextLine();

            FileWriter fileWriter = new FileWriter(fileCreated);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            if (nameOfFile.equalsIgnoreCase("employees.csv")) {
                String dataFromFile;
                bufReader.readLine();
                while ((dataFromFile = bufReader.readLine()) != null) {

                    String[] splitData = dataFromFile.split(Pattern.quote("|"));
                    // Parse First
                    int employeeId = Integer.parseInt(splitData[0]);
                    String name = splitData[1];
                    double hoursWorked = Double.parseDouble(splitData[2]);
                    double payRate = Double.parseDouble(splitData[3]);

                    Employee employeeProfile = new Employee(employeeId, name, payRate, hoursWorked);
                    //System.out.printf("%d | %s | %.2f\n",employeeProfile.getEmployeeId(),employeeProfile.getName(),employeeProfile.getGrossPay());

                    String text;

                    text = String.format("%d | %s | %.2f\n", employeeProfile.getEmployeeId(), employeeProfile.getName(), employeeProfile.getGrossPay());
                    bufWriter.write(text);
                }
                bufWriter.close();
                bufReader.close();
            } else {
                System.out.println("Invalid name");

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
