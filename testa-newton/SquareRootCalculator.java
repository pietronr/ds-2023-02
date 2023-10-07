import java.util.function.Function;

public class SquareRootCalculator implements Function<Double, Double> {
    
    public Double applyDouble(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo");
        }
        
        if (x == 0) {
            return 0;
        }
        
        double guess = x / 2.0;
        double previousGuess;
        
        do {
            previousGuess = guess;
            guess = 0.5 * (guess + x / guess);
        } while (Math.abs(guess - previousGuess) > tolerance);
        
        return guess;
    }
}