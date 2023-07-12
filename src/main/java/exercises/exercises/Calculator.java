package exercises.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {


    public double result(String task){

        String a = "18+23/4+45-7*5*5/5/5";
        System.out.println(a);
        String operators[] = a.replaceAll("/", "").replaceAll("\\*", "").split("[0-9]+");
        String operators2[] = a.replaceAll("\\+", "").replaceAll("-", "").split("[0-9]+");
        String operands[] = a.split("[+-]");
        for (int i = 0; i < operators2.length; i++){
            System.out.println(operators2[i]);
        }
        List<String> operandsTemp = new ArrayList<>();
        for (String op: operands
             ) {
            if (op.contains("/") || op.contains("*")){
                operandsTemp.add(op);
            }

        }
        List<String> operatorsTemp = new ArrayList<>();
        for (String op: operandsTemp
        ) {
                operatorsTemp.addAll(Arrays.asList(op.split("[/\\*]")));
            }
        System.out.println(operatorsTemp);


            System.out.println(operandsTemp);
        double agregate = Integer.parseInt(operands[0]);
        List<Double> calcNumbers = new ArrayList<>();
        double testif = 0d;
        int count = 0;
        for (int i = 0; i < operatorsTemp.size();i++){
            /*if (operands[i].contains("/")){
                String temp[] = operands[i].split("[/]");
                double tempDi = 0d;
                for (int j = 0; j< temp.length; j++){
                    String temp2[] = temp[j].split("[*]");
                    double tempD = 1d;
                    if (calcNumbers.size() > 0){
                        if (j != 0){
                            tempD = calcNumbers.get(calcNumbers.size()-1)/Double.parseDouble(temp2[0]);
                        }
                    }else{
                        tempD = Double.parseDouble(temp2[0]); //10
                    }
                    if(temp2.length >= 2){
                        for (int f = 1; f < temp2.length; f++){
                            tempD = tempD*Double.parseDouble(temp2[f]);
                        }
                    }
                    calcNumbers.add(tempD);
                    testif = tempD;
                }
                System.out.println(testif);
                operands[i] = testif + "";
            }
            */


            if(op[i].equals("*")) {
                System.out.println(operandsTemp.get(i-1) + "*" + operandsTemp.get(i) + "  i = " + i);
                //agregate *= Double.parseDouble(operandsTemp.get(i));
                System.out.println("agregate: " + agregate);
            }
            System.out.println("op: " + operators2[i]);
            if(operators2[i].equals("/")) {
                System.out.println(operandsTemp.get(i-1) + "/" + operandsTemp.get(i) + "  i = " + i);
                agregate /= Double.parseDouble(operands[i]);
                System.out.println("agregate: " + agregate);
            }
            /*if(operators[i].equals("+")) {
                System.out.println(agregate + "+" + operands[i]);
                agregate += Double.parseDouble(operands[i]);
                System.out.println("agregate: " + agregate);
            }
            else if(operators[i].equals("-")){
                System.out.println(agregate + "-" + operands[i]);
                agregate -= Double.parseDouble(operands[i]);
                System.out.println("agregate: " + agregate);
            }*/
           ;
        }
        System.out.println(agregate);
        return agregate;
    }
}