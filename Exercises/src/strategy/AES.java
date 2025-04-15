package strategy;

public class AES implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting using AES algorithm");
        return "encrypted message";
    }
}
