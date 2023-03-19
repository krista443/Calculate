public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void calculate() {
        double number1 = view.getNumber1();
        double number2 = view.getNumber2();
        String operation = view.getOperation();

        switch (operation) {
            case "+":
                model.add(number1, number2);
                break;
            case "-":
                model.subtract(number1, number2);
                break;
            case "*":
                model.multiply(number1, number2);
                break;
            case "/":
                model.divide(number1, number2);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        double result = model.getResult();
        view.displayResult(result);
    }
}