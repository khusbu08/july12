

public class SimpleInterest {

    public static void main(String[] args) {
        // wap to calculate SI, PTR not Zero.
        int si = 0;
        int p;
        p = 0;
        int r = 0;
        int t;
        t = 0;
        if (p != 0 && t !=0 && r !=0) {

            si = (p * r * t) / 100;
            System.out.println("Simple interest is :" + si);
        }

    }
}
