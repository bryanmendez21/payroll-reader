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
        Employee employeeProfile = new Employee(  );

        String dataFromFile;


        while ((dataFromFile = bufReader.readLine()) != null){

            String[] splitData = dataFromFile.split(Pattern.quote("|"));

            int employeeID = Integer.parseInt(splitData[0]);
            String employeeName = splitData[1];
            double hoursWorked = Double.parseDouble(splitData[2]);
            double payRate = Double.parseDouble(splitData[3]);

            System.out.println(employeeID);


        }

    }

}
