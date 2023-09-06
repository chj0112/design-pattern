public class Start implements State {
    Calculator c;
    public Start(Calculator c) {
        this.c = c;
        c.setOp1(0);
        c.setOp2(0);
    }
    @Override
    public void processDigit(int digit) {
        c.setOp1(digit);
        c.setState(c.getOperand1());
    }
}
