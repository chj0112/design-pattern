public class VendingMachine {
    State state0;
    State stateLess500;
    State state500;
    State stateLess1000;
    State stateEqualOrMore1000;
    State state;
    private int balance;
    private String msg;

    public VendingMachine() {
        state0 = new State0(this);
        stateLess500 = new StateLess500(this);
        state500 = new State500(this);
        stateLess1000 = new StateLess1000(this);
        stateEqualOrMore1000 = new StateEqualOrMore1000(this);
        state = state0;
        balance = 0;
        msg = "";
    }

    public void addHundred() {
        state.addHundred();
    }

    public void addFiveHundred() {
        state.addFiveHundred();
    }

    public void addThousand() {
        state.addThousand();
    }

    public void returnChanges() {
        state.returnChanges();
    }

    public void selectBeverage() {
        state.selectBeverage();
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public State getState0() {
        return state0;
    }

    public State getStateLess500() {
        return stateLess500;
    }

    public State getState500() {
        return state500;
    }

    public State getStateLess1000() {
        return stateLess1000;
    }

    public State getStateEqualOrMore1000() {
        return stateEqualOrMore1000;
    }
}
