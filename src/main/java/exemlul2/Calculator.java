package exemlul2;

public class Calculator {

        private  int a;
        private  int b;

        public Calculator(int a, int b) {
            this.a = a;
            this.b = b;
        }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
    public int suma() {
        return a + b;}
}

