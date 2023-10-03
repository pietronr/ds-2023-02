public class SquareRootCalculator {
    
    public static double calculateSquareRoot(double number, double tolerance) {
        if (number < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo");
        }
        
        if (number == 0) {
            return 0;
        }
        
        double guess = number / 2.0;
        double previousGuess;
        
        do {
            previousGuess = guess;
            guess = 0.5 * (guess + number / guess);
        } while (Math.abs(guess - previousGuess) > tolerance);
        
        return guess;
    }
}