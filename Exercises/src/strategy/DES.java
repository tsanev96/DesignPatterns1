package strategy;

public class DES implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting using des algorithm");
        return "encrypted message";
    }
}
