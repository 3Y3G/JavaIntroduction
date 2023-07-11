package exercises.exercises;

import java.util.ArrayList;

public class Calculator {


    public double result(String task){

        String a = "5+20-15+8";
        System.out.println(a);
        String operators[] = a.split("[0-9]+");
        String operands[] = a.split("[+-]");
        ArrayList<String> devideMult = new ArrayList<>();
        for (int i = 0; i < operands.length; i++){
             = operands[i].split("[*/]");
        }

        double agregate = Integer.parseInt(operands[0]);
        for (int i = 1; i < ){

        }
        for (int i = 1; i < operands.length;i++){
            if(operators[i].equals("+"))
                agregate += Integer.parseInt(operands[i]);

            else
                agregate -= Integer.parseInt(operands[i]);
        }
        System.out.println(agregate);

        return agregate;
    }
}
