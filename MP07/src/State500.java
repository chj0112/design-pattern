public class State500 implements State {
    VendingMachine vm;
    public State500(VendingMachine vm) {
        this.vm = vm;
    }
    public void addHundred() {
        vm.setBalance(vm.getBalance() + 100);
        vm.setMsg("");
        vm.setState(vm.getStateLess1000());
    }
    public void addFiveHundred() {
        vm.setBalance(vm.getBalance() + 500);
        vm.setMsg("");
        vm.setState(vm.getStateEqualOrMore1000());
    }
    public void addThousand() {
        vm.setBalance(vm.getBalance() + 1000);
        vm.setMsg("");
        vm.setState(vm.getStateEqualOrMore1000());
    }
    public void returnChanges() {
        vm.setMsg("" + vm.getBalance() + "원을 반환합니다");
        vm.setBalance(0);
        vm.setState(vm.getState0());
    }
    public void selectBeverage() {
        vm.setMsg("1000원 이상을 넣은 후에 눌러주세요");
    }
}
