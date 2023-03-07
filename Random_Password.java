import java.util.Random;

public class Random_Password {
    public static void main(String[] args) {
        System.out.println(passwordGenerator(8));
    }

    private static char[] passwordGenerator(int length){
        String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetter = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*/?";
        String numbers = "0123456789";
        String combinedChars = capitalLetter + lowerLetter + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = lowerLetter.charAt(random.nextInt(lowerLetter.length()));
        password[1] = capitalLetter.charAt(random.nextInt(capitalLetter.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for(int i=4; i<length; i++){
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }
}
