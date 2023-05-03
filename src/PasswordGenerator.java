import java.util.Random;

class PasswordGenerator {
    public static String generatePassword() {
        char[] specialCharacters = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '?'};
        char[] digits = {'0', '1', '2', '3', '4'};
        char[] caps = {65, 66, 67, 68};
        char[] lowerCase = {'a', 'b', 'c', 'd', 'e'};
        int[] randomNumbers = {1, 2, 6, 101, 0, 33, 65, 69, 88};
        int randomNumber = 13;
        char[] password = new char[randomNumber];

        Random rand = new Random();
        for (int i = 0; i < password.length; i++) {
            int type = rand.nextInt(5);
            if (type == 0) {
                password[i] = specialCharacters[rand.nextInt(specialCharacters.length)];
            } else if (type == 1) {
                password[i] = digits[rand.nextInt(digits.length)];
            } else if (type == 2) {
                password[i] = caps[rand.nextInt(caps.length)];
            } else if (type == 3) {
                password[i] = lowerCase[rand.nextInt(lowerCase.length)];
            } else if (type == 4) {
                password[i] = (char) randomNumbers[rand.nextInt(randomNumbers.length)];
            }
        }

        return new String(password);
    }
}
