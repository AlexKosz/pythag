import java.lang.Math;

public class PythagTheorem {

    public double calcHypo(int legA, int legB) {
        int c = (legA * legA) + (legB * legB);
        return (Math.sqrt(c));
    }
}