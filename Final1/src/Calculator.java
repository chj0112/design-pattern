public class Calculator {
    State start;
    State operand1;
    State operand2;
    State operator;
    State state;
    private int op1;
    private int op2;
    private char op;
    private int result;
    public Calculator() {
        start = new Start(this);
        operand1 = new Operand1(this);
        operand2 = new Operand2(this);
        operator = new Operator(this);
        state = start;
        op1 = 0;
        op2 = 0;
        op = 0;
        result = 0;
    }
    public void processDigit(int digit) {
        state.processDigit(digit);
    }
    public void processArithmeticOperator(char ch) {
        state.processArithmeticOperator(ch);
    }
    public void processEqualOperator() {
        state.processEqualOperator();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getStart() {
        return start;
    }

    public State getOperand1() {
        return operand1;
    }

    public State getOperand2() {
        return operand2;
    }

    public State getOperator() {
        return operator;
    }

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
