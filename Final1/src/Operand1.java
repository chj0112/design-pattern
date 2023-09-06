public class Operand1 implements State {
    Calculator c;
    public Operand1(Calculator c) {
        this.c = c;
    }
    @Override
    public void processDigit(int digit) {
        c.setOp1(c.getOp1() * 10 + digit);
    }

    @Override
    public void processArithmeticOperator(char ch) {
        c.setOp(ch);
        c.setState(c.getOperator());
    }
}
