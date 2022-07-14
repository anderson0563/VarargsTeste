public class VarargsTest
{
    public static double average ( double... numbers )
    {
        double total = 0.0;
        for (double d: numbers )
        {
            total+=d;
        }
        return total / numbers.length;
    }

    public static void main( String args[] )
    {
        double d1 = 10.0, d2=20.0, d3=30.0, d4=40.0;

        System.out.printf("%.1f  %.1f   %.1f   %.1f \n", d1, d2, d3, d4);
        System.out.printf("%.1f\n", average(d1, d2));
        System.out.printf("%.1f\n", average(d1, d2, d3));
    }
}