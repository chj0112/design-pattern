public class Operator implements State {
    Calculator c;
    public Operator(Calculator c) {
        this.c = c;
    }
    @Override
    public void processDigit(int digit) {
        c.setOp2(digit);
        c.setState(c.getOperand2());
    }

    @Override
    public void processArithmeticOperator(char ch) {
        c.setOp(ch);
    }
}
