public class Main {
    public static void main(String[] args) {

//        Calculator calc = new Calculator();
//        System.out.println(
//                calc.newFormula()
//                        .addOperand(5)
//                        .addOperand(15)
//                        .calculate(Calculator.Operation.MULT)
//                        .result()
//        );

        Ints calc = new IntsCalculator();

        System.out.println(calc.mult(5, 6));
        System.out.println(calc.pow(5, 2));
        System.out.println(calc.sum(50, 50));


    }
}
