public class Calculator {
    int numberA;
    int numberB;
    int result;
    double pi = Math.PI;
    double radius;

    public Calculator() {
    }

    public Calculator(int numberA, int numberB, double radius) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.radius = radius;
    }

    public int sum() {
        return this.numberA + this.numberB;
    }

    public int minus() {
        return this.numberA - numberB;
    }

    public int multiply() {
        return this.numberA * this.numberB;
    }

    public int divide() {
        return this.numberA / this.numberB;
    }

    public int add(int numberA) {
        result += numberA;
        return result;
    }

    public int multiplication(int numberA) {
        result *= numberA;
        return result;
    }

    public double circleArea() {
        return radius * radius * pi;
    }


    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getResult() {
        return result;
    }


}
