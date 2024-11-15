class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        } else if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        return switch(operation) {
            case "+" -> String.format("%d + %d = %d", operand1, operand2, operand1 + operand2);
            case "*" -> String.format("%d * %d = %d", operand1, operand2, operand1 * operand2);
            case "/" -> {
                try {
                    yield String.format("%d / %d = %d", operand1, operand2, operand1 / operand2);
                } catch(ArithmeticException ex) {
                    throw new IllegalOperationException("Division by zero is not allowed", ex);
                }
            }
            default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        };
    }

}
