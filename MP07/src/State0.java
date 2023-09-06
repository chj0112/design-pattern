public class State0 implements State {
    VendingMachine vm;
    public State0(VendingMachine vm) {
        this.vm = vm;
    }
    public void addHundred() {
        vm.setBalance(vm.getBalance() + 100);
        vm.setMsg("");
        vm.setState(vm.getStateLess500());
    }
    public void addFiveHundred() {
        vm.setBalance(vm.getBalance() + 500);
        vm.setMsg("");
        vm.setState(vm.getState500());

    }
    public void addThousand() {
        vm.setBalance(vm.getBalance() + 1000);
        vm.setMsg("");
        vm.setState(vm.getStateEqualOrMore1000());
    }
    public void returnChanges() {
        vm.setMsg("");
    }
    public void selectBeverage() {
        vm.setMsg("돈을 넣은 후에 눌러주세요");
    }
}