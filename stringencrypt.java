import java.io.*;
import java.util.Scanner;
class StringEncryptionDecryption {

    // Method to encrypt the string
    public static String encryptString(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (char ch : input.toCharArray()) {
            // Encrypt by replacing with the next character in ASCII
            encrypted.append((char)(ch + 1));
        }
        return encrypted.toString();
    }

    // Method to decrypt the string
    public static String decryptString(String input) {
        StringBuilder decrypted = new StringBuilder();
        for (char ch : input.toCharArray()) {
            // Decrypt by replacing with the previous character in ASCII
            decrypted.append((char)(ch - 1));
        }
        return decrypted.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read input string
        System.out.print("Enter the string to encrypt: ");
        String inputString = scanner.nextLine();

        // Step 2: Encrypt the string
        String encryptedString = encryptString(inputString);
        System.out.println("Encrypted String: " + encryptedString);

        // Step 3: Write the encrypted string to the file 'sample.txt'
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sample.txt"))) {
            writer.write(encryptedString);
            System.out.println("Encrypted string has been written to sample.txt.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Step 4: Read the encrypted string from the file
        String readEncryptedString = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            readEncryptedString = reader.readLine();
            System.out.println("Encrypted string read from file: " + readEncryptedString);
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        // Step 5: Decrypt the string
        String decryptedString = decryptString(readEncryptedString);
        System.out.println("Decrypted String: " + decryptedString);

        scanner.close();
    }
}