public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        a += 10;
        System.out.println("a bigger by 10 is : " +a);

        int b = 100;
        // make b smaller by 7
        b -= 7;
        System.out.println("b smaller by 7 is : " +b);

        int c = 44;
        // please double c's value
        c *= 2;
        System.out.println("double of c is : " +c);

        int d = 125;
        // please divide by 5 d's value
        d /= 5;
        System.out.println("d divided by 5 is : " +d);

        int e = 8;
        // please cube of e's value
        e *= e *= e;
        System.out.println("cube of e is : " +e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        boolean biggerNumber = f1 > f2;
        System.out.println("f1 is bigger than f2 : " +biggerNumber);

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        g2 *= g2;
        boolean doubleBigger = g2 > g1;
        System.out.println("double of g2 is bigger than g1 : " +doubleBigger);

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        h /= 11;
        boolean divisor = h <= 0;
        System.out.println("h has 11 as a divisor : " +divisor);

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        boolean compareI1I2;
        compareI1I2 = i1 > (i2 *= i2) && i1 < (i2 *= i2);
        System.out.println("i1 is higher than i2 squared and smaller than i2 cubed: " +compareI1I2);


        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        boolean jDividable;
        jDividable = (j % 3) <= 0 || (j % 5) <= 0;
        System.out.println("j is dividable by 3 or 5 : " +jDividable);
    }
}
