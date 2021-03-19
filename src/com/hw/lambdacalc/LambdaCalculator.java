package com.hw.lambdacalc;

import java.util.HashMap;
import java.util.Map;

public enum LambdaCalculator  implements Operation {
    ADD((a, b) -> (a + b)),
    SUBTRACT((a, b) -> a - b),
    MULTIPLY((a, b) -> a * b),
    DIVIDE((a, b) -> a / b);

    Operation operation;

    LambdaCalculator(Operation operation) {
        this.operation = operation;
    }

    public static Map<String, Operation> operationMap = new HashMap<>() {{
        put("ADD",ADD);
        put("add",ADD);
        put("+",ADD);
        put("SUBTRACT",SUBTRACT);
        put("subtract",SUBTRACT);
        put("-",SUBTRACT);
        put("MULTIPLY",MULTIPLY);
        put("multiply",MULTIPLY);
        put("*",MULTIPLY);
        put("DIVIDE",DIVIDE);
        put("divide",DIVIDE);
        put("/",DIVIDE);

    }};

    @Override
    public int calculate(int a, int b) {
        return operation.calculate(a,b);
    }
    public static void result(int a,String LambdaCalculator, int b){
        System.out.println( "Result= "+operationMap.get(LambdaCalculator).calculate(a,b));
    }
}