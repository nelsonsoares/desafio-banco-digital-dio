package account;

public enum AccountType {
    CURRENT("Conta Corrente"),
    SAVINGS("Conta Poupança");

    private final String descriptor;

    AccountType(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getDescriptor() {
        return descriptor;
    }
}
