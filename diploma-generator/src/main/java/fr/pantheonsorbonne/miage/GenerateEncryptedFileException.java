package fr.pantheonsorbonne.miage;

public class GenerateEncryptedFileException extends RuntimeException {
    public GenerateEncryptedFileException(String failedToGenerateEncryptedFile) {
        super(failedToGenerateEncryptedFile);
    }
}
