public class StateEqualOrMore1000 implements State {
    VendingMachine vm;
    public StateEqualOrMore1000(VendingMachine vm) {
        this.vm = vm;
    }
    public void addHundred() {
        vm.setBalance(vm.getBalance() + 100);
        vm.setMsg("");
    }
    public void addFiveHundred() {
        vm.setBalance(vm.getBalance() + 500);
        vm.setMsg("");
    }
    public void addThousand() {
        vm.setBalance(vm.getBalance() + 1000);
        vm.setMsg("이미 충분한 돈이 투입되었습니다. 음료를 선택하세요");
    }
    public void returnChanges() {
        vm.setMsg("" + vm.getBalance() + "원을 반환합니다");
        vm.setBalance(0);
        vm.setState(vm.getState0());
    }
    public void selectBeverage() {
        String s = "음료를 내보냅니다. 배출구를 확인하세요.";
        vm.setBalance(vm.getBalance() - 1000);
        if (vm.getBalance() > 0) {
            s += " 거스름돈 " + vm.getBalance() + "원을 반환합니다.";
        }
        vm.setBalance(0);
        vm.setMsg(s);
        vm.setState(vm.getState0());
    }
}
