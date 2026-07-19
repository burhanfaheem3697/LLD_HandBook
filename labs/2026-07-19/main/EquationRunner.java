
public class EquationRunner {
    public double solveLinear(double m,double x,double c){
        if(m == 0.0){
            throw new IllegalArgumentException("The value of m can't be zero!");
        }

        return m*x + c;
    }

    public double solveQuardratic(double a,double b, double c,double x){
        if(a == 0.0){
            throw new IllegalArgumentException("The value of coefficient of x^2 can't be zero ");
        }

        double linearPortion = solveLinear(b, x, c);

        return a*x*x + linearPortion;
    }
}