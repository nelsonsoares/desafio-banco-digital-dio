package client;

public enum TypeClient {
    CPF("Pessoa Física"),
    CNPJ("Pessoa Jurídica");

   private final String descriptor;

    TypeClient(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getDescriptor() {
        return descriptor;
    }
}
