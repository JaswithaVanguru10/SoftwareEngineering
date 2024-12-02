import javax.swing.*;

public class QuadraticSolver {

    public static void main(String[] args) {
        // Example coefficients for testing
        double a = 1.0;
        double b = -3.0;
        double c = 2.0;

        // Solve the quadratic equation
        QuadraticCalculator.solveQuadratic(a, b, c);

        // Plot the quadratic equation
        QuadraticPlotter.plotQuadratic(a, b, c);
    }
}