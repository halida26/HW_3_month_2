public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount = amount + sum;
        System.out.println("Вы положили деньги в размере " + sum + " сом на счет.");
    }
    public  void withDraw(int sum) throws LimitException {
        if (sum < amount) {
            throw new LimitException("На Вашем счету недостаточно средств для снятия данной суммы.", amount);
        } else {
            amount = amount - sum;
            System.out.println("Вы сняли деньги в размере " + sum + " сом со счета.");
        }
    }
}
