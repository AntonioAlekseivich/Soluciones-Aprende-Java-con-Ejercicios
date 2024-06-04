package ejercicio_03_14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class RandomExceptionGenerator {

    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int randomNumber = random.nextInt(5);

        switch (randomNumber) {
            case 0:
                throw new NumberFormatException();
            case 1:
                throw new IOException();
            case 2:
                throw new FileNotFoundException();
            case 3:
                throw new IndexOutOfBoundsException();
            case 4:
                throw new ArithmeticException();
            default:
                throw new RuntimeException("Unexpected exception generated");
        }
    }
}