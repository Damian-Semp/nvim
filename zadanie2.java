ppublic class Konto {
    private double saldo;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double nowaWartosc) {
        if (nowaWartosc > 0) {
            this.saldo = nowaWartosc;
        } else {
            System.out.println("Błąd: Nowe saldo musi być większe od zera.");
        }
    };
}
