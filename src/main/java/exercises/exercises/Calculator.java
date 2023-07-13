package exercises.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static Scanner cin = new Scanner(System.in);

    public double result(String task){
        String a = "1*9/2-320+12343*1232";
        System.out.println(a);


        String operators[] = a.replaceAll("/", "").replaceAll("\\*", "").split("[0-9]+");
        List<String> operands = Arrays.asList(a.split("[+-]"));
        List<String> operandsTemp = new ArrayList<>();
        for (String op : operands) {
            if (op.contains("/") || op.contains("*")) {
                operandsTemp.add(op);
            }
        }
        List<String> operatorsTemp = new ArrayList<>();
        List<Double> calculated = new ArrayList<>();
        for (int i = 0; i < operandsTemp.size(); i++) {
            String operators2[] = operandsTemp.get(i).replaceAll("\\+", "").replaceAll("-", "").split("[0-9]+");
            operatorsTemp.addAll(Arrays.asList(operandsTemp.get(i).split("[/\\*]")));
            double agregate = Double.parseDouble(operatorsTemp.get(0));
            for (int k = 1; k < operatorsTemp.size();k++) {
                if(operators2[k].equals("*")) {
                    agregate *= Double.parseDouble(operatorsTemp.get(k));
                }
                if(operators2[k].equals("/")) {
                    agregate /= Double.parseDouble(operatorsTemp.get(k));
                }
            }
            calculated.add(agregate);
            operatorsTemp.clear();
        }
        for(int i = 0; i < operandsTemp.size();i++) {
            operands.set( operands.indexOf(operandsTemp.get(i)) , String.valueOf(calculated.get(i)));
        }
        double agregate = Double.parseDouble(operands.get(0));
        for (int i = 0; i < operators.length; i++) {
            if(operators[i].equals("+")) {
                agregate += Double.parseDouble(operands.get(i));
            }
            else if(operators[i].equals("-")) {
                agregate -= Double.parseDouble(operands.get(i));
            }
        }
        System.out.println(agregate);
        return agregate;
    }
}