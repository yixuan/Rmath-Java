package statr.rmath;

import com.sun.jna.Library;
import com.sun.jna.Native;

public class Rmath {

    private interface RmathLib extends Library {

        /* Normal Distribution */
        double dnorm4(double x, double mu, double sigma, int lg);
        double pnorm5(double x, double mu, double sigma, int lt, int lg);
        double qnorm5(double p, double mu, double sigma, int lt, int lg);
        // double rnorm(double mu, double sigma);

        /* Uniform Distribution */
        double dunif(double x, double a, double b, int lg);
        double punif(double x, double a, double b, int lt, int lg);
        double qunif(double p, double a, double b, int lt, int lg);
        // double runif(double a, double b);

        /* Gamma Distribution */
        double dgamma(double x, double shp, double scl, int lg);
        double pgamma(double x, double alp, double scl, int lt, int lg);
        double qgamma(double p, double alp, double scl, int lt, int lg);
        // double rgamma(double a, double scl);

    }

    private static RmathLib Instance = (RmathLib) Native.loadLibrary("Rmath", RmathLib.class);


    /* Normal Distribution */
    public static double dnorm(double x, double mu, double sigma, boolean lg) {
        return Instance.dnorm4(x, mu, sigma, lg ? 1 : 0);
    }
    public static double dnorm(double x, double mu, double sigma) {
        return Instance.dnorm4(x, mu, sigma, 0);
    }
    public static double pnorm(double x, double mu, double sigma, boolean lt, boolean lg) {
        return Instance.pnorm5(x, mu, sigma, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pnorm(double x, double mu, double sigma) {
        return Instance.pnorm5(x, mu, sigma, 1, 0);
    }
    public static double qnorm(double p, double mu, double sigma, boolean lt, boolean lg) {
        return Instance.qnorm5(p, mu, sigma, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qnorm(double p, double mu, double sigma) {
        return Instance.qnorm5(p, mu, sigma, 1, 0);
    }



    public static void main(String[] args) {
        System.out.println("dnorm(1.2, mu = 3.4, sd = 5.6) = " + Rmath.dnorm(1.2, 3.4, 5.6));
    }
}
