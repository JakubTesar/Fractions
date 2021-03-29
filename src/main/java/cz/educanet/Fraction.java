package cz.educanet;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //Plus
    public Fraction plus(Fraction other) {
        int tf2 = MathUtils.findLowestCommonMultiple(denominator, other.denominator);
        int a = tf2 / denominator;
        int b = tf2 / other.denominator;

        int c = numerator * a;
        int d = other.numerator * b;

        int bojimSeMaze = c + d;

        return new Fraction(bojimSeMaze, tf2);
    }

    //Mínus
    public Fraction minus(Fraction other) {
        int tf2 = MathUtils.findLowestCommonMultiple(denominator, other.denominator);
        int a = tf2 / denominator;
        int b = tf2 / other.denominator;

        int c = numerator * a;
        int d = other.numerator * b;

        int bojimSeMaze = c - d;

        return new Fraction(bojimSeMaze, tf2);
    }

    //Násobení
    public Fraction times(Fraction other) {
        int timesNum = numerator * other.numerator;
        int timesDen = denominator * other.denominator;

        return new Fraction(timesNum, timesDen);
    }

    //Dělení
    public Fraction dividedBy(Fraction other) {
        int divideNum = numerator * other.denominator;
        int divideDen = denominator * other.numerator;

        return new Fraction(divideNum, divideDen);
    }

    // přehození
    public Fraction getReciprocal() {
        return new Fraction(getDenominator(), getNumerator());
    }

    //Zjednodušit
    public Fraction simplify() {
        int tf2PlsHrajte = MathUtils.findGreatestCommonDenominator(numerator, denominator);
        int a = numerator / tf2PlsHrajte;
        int b = denominator / tf2PlsHrajte;
        return new Fraction(a, b);
    }

    //Vydělit na desetinou blbost
    public float toFloat() {
        float desetinecislo = 0;
        if (denominator != 0) {
            desetinecislo = (float) numerator / (float) denominator;
        } else {
            System.out.println("Nulou se nedá dělit");
        }
        return desetinecislo;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
