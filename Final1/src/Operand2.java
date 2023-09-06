public class Operand2 implements State {
    Calculator c;
    public Operand2(Calculator c) {
        this.c = c;
    }
    @Override
    public void processDigit(int digit) {
        c.setOp2(c.getOp2() * 10 + digit);
    }

    @Override
    public void processEqualOperator() {
        int res = 0;
        char ch = c.getOp();
        if (ch == '+') {
            res = c.getOp1() + c.getOp2();
        } else if (ch == '-') {
            res = c.getOp1() - c.getOp2();
        } else if (ch == '*') {
            res = c.getOp1() * c.getOp2();
        } else if (ch == '/') {
            res = c.getOp1() / c.getOp2();
        } else if (ch == '%') {
            res = c.getOp1() % c.getOp2();
        }
        c.setResult(res);
        c.setState(c.getStart());
    }
}
