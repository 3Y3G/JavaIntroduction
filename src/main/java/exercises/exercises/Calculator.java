package exercises.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public static String inputRAW = "6+5+(5*5)+(4+6)";
    public static String input(String in) {
        in = in.replaceAll(" ", "");
        in = in.replaceAll("minus", "-");
        in = in.replaceAll("plus", "+");
        if (in.contains("(") && in.contains(")")){
            System.out.println("IN IF");

            String test = in;
            Pattern p = Pattern.compile("\\((.*?)\\)");
            Matcher m = p.matcher(test);
            List<String> tasks = new ArrayList<>();
            while(m.find()) {
                tasks.add(m.group(1));
            }

            System.out.println("tasks = " + tasks);

            for (String value: tasks) {
                String in1 = in;
                String temp, temp1, temp2;
                System.out.println("value = " + value);
                temp1 = in1.substring(in1.indexOf("("), in1.indexOf(")") + 1);
                System.out.println("temp1 = " + temp1);
                temp = in1.substring(in1.indexOf("(")+1, in1.indexOf(")"));
                temp2 = in1.substring(in1.indexOf(")")+1);
                System.out.println("temp2 = " + temp2);
                in = in1.substring(0, in1.indexOf(temp1)) + result(value) + temp2;
                System.out.println("in = " + in);

            }
           // System.out.println("OUT OF IF IF");
        }else{
           // System.out.println("NOT IN IF");
        }

        //6+6+(5+5)+(4+4)
        //6+6+[5+5]+[4+4]



        return in;
    }

    public static String result(String task) {
       // System.out.println();
        String a = input(task);
      //  System.out.println(a);
        List<String> operands = Arrays.asList(a.split("[+-]"));
       // System.out.println("operands = " + operands);
        String rawValue = operands.get(0) + " ";
        for (int i = 1; i < operands.size(); i++){
            rawValue += operands.get(i) + " ";
        }
        if (operands.contains("/") || operands.contains("/")){
            for (String value: operands
            ) {

                //System.out.println("operands value = " + value);
               // System.out.println(a.substring(0, a.indexOf(value)));
               // System.out.println("a before replace = " + a);
                a = a.substring(0, a.indexOf(value) +1).replaceAll(value, " ");
              //  System.out.println("a cycle = " + a);
                if (value == operands.get(0)){

                }else{

                }


            }
        }

        //System.out.println("a = " +a);
        //System.out.println("rawvalue = " + rawValue);

        List<String> ops = Arrays.asList(rawValue.split(" "));
        String opTemp = "";
        for (int i = 0; i < ops.size();i++){
            System.out.println("operands value123123 = " + ops.get(i));
            System.out.println("a + " + a);
            System.out.println(a.substring(0, a.indexOf(ops.get(i)) +1));
            a = a.replaceAll(a.substring(0, a.indexOf(ops.get(i)) +1), "" );
            System.out.println("asdasd +" + a);
            //System.out.println(a.substring(0, a.indexOf(value)));
            //System.out.println("a before replace = " + a);
            //a = a.substring(0, a.indexOf(value) +1).replaceAll(value, " ");
            //System.out.println("a cycle = " + a);
            //if (value == operands.get(0)){

           // }else{

          //  }
        }
        String[] operators = a.replaceAll("/", "")
                .replaceAll("\\*", "")
                .split(" ");
        for (String value : operators
             ) {
            System.out.println("value = " + value);
        }
        List<String> operandsTemp = new ArrayList<>();
        for (String op : operands) {
            if (op.contains("/") || op.contains("*")) {
                operandsTemp.add(op);
            }
        }
        List<String> operatorsTemp = new ArrayList<>();
        List<Double> calculated = new ArrayList<>();
        for (String s : operandsTemp) {
            String[] operators2 = s.replaceAll("\\+", "")
                    .replaceAll("-", "")
                    .split("[0-9]+");
            operatorsTemp.addAll(Arrays.asList(s.split("[/*]")));
            double agregate = Double.parseDouble(operatorsTemp.get(0));
            for (int k = 1; k < operatorsTemp.size(); k++) {
                if (operators2[k].equals("*")) {
                    agregate *= Double.parseDouble(operatorsTemp.get(k));
                }
                if (operators2[k].equals("/")) {
                    agregate /= Double.parseDouble(operatorsTemp.get(k));
                }
            }
            calculated.add(agregate);
            operatorsTemp.clear();
        }
        for (int i = 0; i < operandsTemp.size(); i++) {
            operands.set(operands.indexOf(operandsTemp.get(i)), String.valueOf(calculated.get(i)));
        }
        double agregate = Double.parseDouble(operands.get(0));
        for (int i = 0; i < operators.length; i++) {
            System.out.println("operators[i]"+operators[i]);
            if (operators[i].equals("+")) {
                System.out.println(" SUBIRA");
                agregate += Double.parseDouble(operands.get(i));
            } else if (operators[i].equals("-")) {
                agregate -= Double.parseDouble(operands.get(i));
            }
        }
        System.out.println();
        System.out.println(operands);
        System.out.println(Arrays.toString(operators));

        System.out.println(agregate);
        return String.valueOf(agregate);
    }
}