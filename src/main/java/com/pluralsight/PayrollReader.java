package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class PayrollReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/employees.csv");
        BufferedReader bufReader = new BufferedReader(fileReader);

        String dataFromFile;
        Employee[] employeeList = new Employee[10];
        int counter = 0;

        bufReader.readLine();
        while ((dataFromFile = bufReader.readLine()) != null) {

            String[] splitData = dataFromFile.split(Pattern.quote("|"));
            // Parse First
            int employeeId = Integer.parseInt(splitData[0]);
            String name = splitData[1];
            double hoursWorked = Double.parseDouble(splitData[2]);
            double payRate = Double.parseDouble(splitData[3]);

            Employee employeeProfile = new Employee(employeeId, name, payRate,hoursWorked);
            employeeList[counter] = employeeProfile;
            counter++;



        }
        System.out.println(employeeList[1].getName());
    }

}
