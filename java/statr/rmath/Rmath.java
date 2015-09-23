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

        /* Beta Distribution */
        double dbeta(double x, double a, double b, int lg);
        double pbeta(double x, double p, double q, int lt, int lg);
        double qbeta(double a, double p, double q, int lt, int lg);
        // double rbeta(double a, double b);

        /* Lognormal Distribution */
        double dlnorm(double x, double ml, double sl, int lg);
        double plnorm(double x, double ml, double sl, int lt, int lg);
        double qlnorm(double p, double ml, double sl, int lt, int lg);
        // double rlnorm(double ml, double sl);

        /* Chi-squared Distribution */
        double dchisq(double x, double df, int lg);
        double pchisq(double x, double df, int lt, int lg);
        double qchisq(double p, double df, int lt, int lg);
        // double rchisq(double df);

        /* Non-central Chi-squared Distribution */
        double dnchisq(double x, double df, double ncp, int lg);
        double pnchisq(double x, double df, double ncp, int lt, int lg);
        double qnchisq(double p, double df, double ncp, int lt, int lg);
        // double rnchisq(double df, double lb);

        /* F Distibution */
        double df(double x, double df1, double df2, int lg);
        double pf(double x, double df1, double df2, int lt, int lg);
        double qf(double p, double df1, double df2, int lt, int lg);
        // double rf(double df1, double df2);

        /* Student t Distibution */
        double dt(double x, double n, int lg);
        double pt(double x, double n, int lt, int lg);
        double qt(double p, double n, int lt, int lg);
        // double rt(double n);

        /* Binomial Distribution */
        double dbinom(double x, double n, double p, int lg);
        double pbinom(double x, double n, double p, int lt, int lg);
        double qbinom(double p, double n, double m, int lt, int lg);
        // double rbinom(double n, double p);

        /* Multnomial Distribution */
        // void rmultinom(int n, double* prob, int k, int* rn);

        /* Cauchy Distribution */
        double dcauchy(double x, double lc, double sl, int lg);
        double pcauchy(double x, double lc, double sl, int lt, int lg);
        double qcauchy(double p, double lc, double sl, int lt, int lg);
        // double rcauchy(double lc, double sl);

        /* Exponential Distribution */
        double dexp(double x, double sl, int lg);
        double pexp(double x, double sl, int lt, int lg);
        double qexp(double p, double sl, int lt, int lg);
        // double rexp(double sl);

        /* Geometric Distribution */
        double dgeom(double x, double p, int lg);
        double pgeom(double x, double p, int lt, int lg);
        double qgeom(double p, double pb, int lt, int lg);
        // double rgeom(double p);

        /* Hypergeometric Distibution */
        double dhyper(double x, double r, double b, double n, int lg);
        double phyper(double x, double r, double b, double n, int lt, int lg);
        double qhyper(double p, double r, double b, double n, int lt, int lg);
        // double rhyper(double r, double b, double n);

        /* Negative Binomial Distribution */
        double dnbinom(double x, double sz, double pb, int lg);
        double pnbinom(double x, double sz, double pb, int lt, int lg);
        double qnbinom(double p, double sz, double pb, int lt, int lg);
        // double rnbinom(double sz, double pb);

        /* Poisson Distribution */
        double dpois(double x, double lb, int lg);
        double ppois(double x, double lb, int lt, int lg);
        double qpois(double p, double lb, int lt, int lg);
        // double rpois(double mu);

        /* Weibull Distribution */
        double dweibull(double x, double sh, double sl, int lg);
        double pweibull(double x, double sh, double sl, int lt, int lg);
        double qweibull(double p, double sh, double sl, int lt, int lg);
        // double rweibull(double sh, double sl);

        /* Logistic Distribution */
        double dlogis(double x, double lc, double sl, int lg);
        double plogis(double x, double lc, double sl, int lt, int lg);
        double qlogis(double p, double lc, double sl, int lt, int lg);
        // double rlogis(double lc, double sl);

        /* Non-central Beta Distribution */
        double dnbeta(double x, double a, double b, double ncp, int lg);
        double pnbeta(double x, double a, double b, double ncp, int lt, int lg);
        double qnbeta(double p, double a, double b, double ncp, int lt, int lg);
        // double rnbeta(double a, double b, double np);

        /* Non-central F Distribution */
        double dnf(double x, double df1, double df2, double ncp, int lg);
        double pnf(double x, double df1, double df2, double ncp, int lt, int lg);
        double qnf(double p, double df1, double df2, double ncp, int lt, int lg);

        /* Non-central Student t Distribution */
        double dnt(double x, double df, double ncp, int lg);
        double pnt(double x, double df, double ncp, int lt, int lg);
        double qnt(double p, double df, double ncp, int lt, int lg);

        /* Studentized Range Distribution */
        double ptukey(double q, double rr, double cc, double df, int lt, int lg);
        double qtukey(double p, double rr, double cc, double df, int lt, int lg);

        /* Wilcoxon Rank Sum Distribution */
        double dwilcox(double x, double m, double n, int lg);
        double pwilcox(double q, double m, double n, int lt, int lg);
        double qwilcox(double x, double m, double n, int lt, int lg);
        // double rwilcox(double m, double n);

        /* Wilcoxon Signed Rank Distribution */
        double dsignrank(double x, double n, int lg);
        double psignrank(double x, double n, int lt, int lg);
        double qsignrank(double x, double n, int lt, int lg);
        // double rsignrank(double n);
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



    /* Uniform Distribution */
    public static double dunif(double x, double a, double b, boolean lg) {
        return Instance.dunif(x, a, b, lg ? 1 : 0);
    }
    public static double dunif(double x, double a, double b) {
        return Instance.dunif(x, a, b, 0);
    }
    public static double punif(double x, double a, double b, boolean lt, boolean lg) {
        return Instance.punif(x, a, b, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double punif(double x, double a, double b) {
        return Instance.punif(x, a, b, 1, 0);
    }
    public static double qunif(double p, double a, double b, boolean lt, boolean lg) {
        return Instance.qunif(p, a, b, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qunif(double p, double a, double b) {
        return Instance.qunif(p, a, b, 1, 0);
    }



    /* Gamma Distribution */
    public static double dgamma(double x, double shp, double scl, boolean lg) {
        return Instance.dgamma(x, shp, scl, lg ? 1 : 0);
    }
    public static double dgamma(double x, double shp, double scl) {
        return Instance.dgamma(x, shp, scl, 0);
    }
    public static double pgamma(double x, double alp, double scl, boolean lt, boolean lg) {
        return Instance.pgamma(x, alp, scl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pgamma(double x, double alp, double scl) {
        return Instance.pgamma(x, alp, scl, 1, 0);
    }
    public static double qgamma(double p, double alp, double scl, boolean lt, boolean lg) {
        return Instance.qgamma(p, alp, scl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qgamma(double p, double alp, double scl) {
        return Instance.qgamma(p, alp, scl, 1, 0);
    }



    /* Beta Distribution */
    public static double dbeta(double x, double a, double b, boolean lg) {
        return Instance.dbeta(x, a, b, lg ? 1 : 0);
    }
    public static double dbeta(double x, double a, double b) {
        return Instance.dbeta(x, a, b, 0);
    }
    public static double pbeta(double x, double p, double q, boolean lt, boolean lg) {
        return Instance.pbeta(x, p, q, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pbeta(double x, double p, double q) {
        return Instance.pbeta(x, p, q, 1, 0);
    }
    public static double qbeta(double a, double p, double q, boolean lt, boolean lg) {
        return Instance.qbeta(a, p, q, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qbeta(double a, double p, double q) {
        return Instance.qbeta(a, p, q, 1, 0);
    }



    /* Lognormal Distribution */
    public static double dlnorm(double x, double ml, double sl, boolean lg) {
        return Instance.dlnorm(x, ml, sl, lg ? 1 : 0);
    }
    public static double dlnorm(double x, double ml, double sl) {
        return Instance.dlnorm(x, ml, sl, 0);
    }
    public static double plnorm(double x, double ml, double sl, boolean lt, boolean lg) {
        return Instance.plnorm(x, ml, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double plnorm(double x, double ml, double sl) {
        return Instance.plnorm(x, ml, sl, 1, 0);
    }
    public static double qlnorm(double p, double ml, double sl, boolean lt, boolean lg) {
        return Instance.qlnorm(p, ml, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qlnorm(double p, double ml, double sl) {
        return Instance.qlnorm(p, ml, sl, 1, 0);
    }



    /* Chi-squared Distribution */
    public static double dchisq(double x, double df, boolean lg) {
        return Instance.dchisq(x, df, lg ? 1 : 0);
    }
    public static double dchisq(double x, double df) {
        return Instance.dchisq(x, df, 0);
    }
    public static double pchisq(double x, double df, boolean lt, boolean lg) {
        return Instance.pchisq(x, df, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pchisq(double x, double df) {
        return Instance.pchisq(x, df, 1, 0);
    }
    public static double qchisq(double p, double df, boolean lt, boolean lg) {
        return Instance.qchisq(p, df, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qchisq(double p, double df) {
        return Instance.qchisq(p, df, 1, 0);
    }



    /* Non-central Chi-squared Distribution */
    public static double dnchisq(double x, double df, double ncp, boolean lg) {
        return Instance.dnchisq(x, df, ncp, lg ? 1 : 0);
    }
    public static double dnchisq(double x, double df, double ncp) {
        return Instance.dnchisq(x, df, ncp, 0);
    }
    public static double pnchisq(double x, double df, double ncp, boolean lt, boolean lg) {
        return Instance.pnchisq(x, df, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pnchisq(double x, double df, double ncp) {
        return Instance.pnchisq(x, df, ncp, 1, 0);
    }
    public static double qnchisq(double p, double df, double ncp, boolean lt, boolean lg) {
        return Instance.qnchisq(p, df, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qnchisq(double p, double df, double ncp) {
        return Instance.qnchisq(p, df, ncp, 1, 0);
    }



    /* F Distibution */
    public static double df(double x, double df1, double df2, boolean lg) {
        return Instance.df(x, df1, df2, lg ? 1 : 0);
    }
    public static double df(double x, double df1, double df2) {
        return Instance.df(x, df1, df2, 0);
    }
    public static double pf(double x, double df1, double df2, boolean lt, boolean lg) {
        return Instance.pf(x, df1, df2, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pf(double x, double df1, double df2) {
        return Instance.pf(x, df1, df2, 1, 0);
    }
    public static double qf(double p, double df1, double df2, boolean lt, boolean lg) {
        return Instance.qf(p, df1, df2, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qf(double p, double df1, double df2) {
        return Instance.qf(p, df1, df2, 1, 0);
    }



    /* Student t Distibution */
    public static double dt(double x, double n, boolean lg) {
        return Instance.dt(x, n, lg ? 1 : 0);
    }
    public static double dt(double x, double n) {
        return Instance.dt(x, n, 0);
    }
    public static double pt(double x, double n, boolean lt, boolean lg) {
        return Instance.pt(x, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pt(double x, double n) {
        return Instance.pt(x, n, 1, 0);
    }
    public static double qt(double p, double n, boolean lt, boolean lg) {
        return Instance.qt(p, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qt(double p, double n) {
        return Instance.qt(p, n, 1, 0);
    }



    /* Binomial Distribution */
    public static double dbinom(double x, double n, double p, boolean lg) {
        return Instance.dbinom(x, n, p, lg ? 1 : 0);
    }
    public static double dbinom(double x, double n, double p) {
        return Instance.dbinom(x, n, p, 0);
    }
    public static double pbinom(double x, double n, double p, boolean lt, boolean lg) {
        return Instance.pbinom(x, n, p, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pbinom(double x, double n, double p) {
        return Instance.pbinom(x, n, p, 1, 0);
    }
    public static double qbinom(double p, double n, double m, boolean lt, boolean lg) {
        return Instance.qbinom(p, n, m, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qbinom(double p, double n, double m) {
        return Instance.qbinom(p, n, m, 1, 0);
    }



    /* Cauchy Distribution */
    public static double dcauchy(double x, double lc, double sl, boolean lg) {
        return Instance.dcauchy(x, lc, sl, lg ? 1 : 0);
    }
    public static double dcauchy(double x, double lc, double sl) {
        return Instance.dcauchy(x, lc, sl, 0);
    }
    public static double pcauchy(double x, double lc, double sl, boolean lt, boolean lg) {
        return Instance.pcauchy(x, lc, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pcauchy(double x, double lc, double sl) {
        return Instance.pcauchy(x, lc, sl, 1, 0);
    }
    public static double qcauchy(double p, double lc, double sl, boolean lt, boolean lg) {
        return Instance.qcauchy(p, lc, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qcauchy(double p, double lc, double sl) {
        return Instance.qcauchy(p, lc, sl, 1, 0);
    }



    /* Exponential Distribution */
    public static double dexp(double x, double sl, boolean lg) {
        return Instance.dexp(x, sl, lg ? 1 : 0);
    }
    public static double dexp(double x, double sl) {
        return Instance.dexp(x, sl, 0);
    }
    public static double pexp(double x, double sl, boolean lt, boolean lg) {
        return Instance.pexp(x, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pexp(double x, double sl) {
        return Instance.pexp(x, sl, 1, 0);
    }
    public static double qexp(double p, double sl, boolean lt, boolean lg) {
        return Instance.qexp(p, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qexp(double p, double sl) {
        return Instance.qexp(p, sl, 1, 0);
    }



    /* Geometric Distribution */
    public static double dgeom(double x, double p, boolean lg) {
        return Instance.dgeom(x, p, lg ? 1 : 0);
    }
    public static double dgeom(double x, double p) {
        return Instance.dgeom(x, p, 0);
    }
    public static double pgeom(double x, double p, boolean lt, boolean lg) {
        return Instance.pgeom(x, p, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pgeom(double x, double p) {
        return Instance.pgeom(x, p, 1, 0);
    }
    public static double qgeom(double p, double pb, boolean lt, boolean lg) {
        return Instance.qgeom(p, pb, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qgeom(double p, double pb) {
        return Instance.qgeom(p, pb, 1, 0);
    }



    /* Hypergeometric Distibution */
    public static double dhyper(double x, double r, double b, double n, boolean lg) {
        return Instance.dhyper(x, r, b, n, lg ? 1 : 0);
    }
    public static double dhyper(double x, double r, double b, double n) {
        return Instance.dhyper(x, r, b, n, 0);
    }
    public static double phyper(double x, double r, double b, double n, boolean lt, boolean lg) {
        return Instance.phyper(x, r, b, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double phyper(double x, double r, double b, double n) {
        return Instance.phyper(x, r, b, n, 1, 0);
    }
    public static double qhyper(double p, double r, double b, double n, boolean lt, boolean lg) {
        return Instance.qhyper(p, r, b, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qhyper(double p, double r, double b, double n) {
        return Instance.qhyper(p, r, b, n, 1, 0);
    }



    /* Negative Binomial Distribution */
    public static double dnbinom(double x, double sz, double pb, boolean lg) {
        return Instance.dnbinom(x, sz, pb, lg ? 1 : 0);
    }
    public static double dnbinom(double x, double sz, double pb) {
        return Instance.dnbinom(x, sz, pb, 0);
    }
    public static double pnbinom(double x, double sz, double pb, boolean lt, boolean lg) {
        return Instance.pnbinom(x, sz, pb, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pnbinom(double x, double sz, double pb) {
        return Instance.pnbinom(x, sz, pb, 1, 0);
    }
    public static double qnbinom(double p, double sz, double pb, boolean lt, boolean lg) {
        return Instance.qnbinom(p, sz, pb, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qnbinom(double p, double sz, double pb) {
        return Instance.qnbinom(p, sz, pb, 1, 0);
    }



    /* Poisson Distribution */
    public static double dpois(double x, double lb, boolean lg) {
        return Instance.dpois(x, lb, lg ? 1 : 0);
    }
    public static double dpois(double x, double lb) {
        return Instance.dpois(x, lb, 0);
    }
    public static double ppois(double x, double lb, boolean lt, boolean lg) {
        return Instance.ppois(x, lb, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double ppois(double x, double lb) {
        return Instance.ppois(x, lb, 1, 0);
    }
    public static double qpois(double p, double lb, boolean lt, boolean lg) {
        return Instance.qpois(p, lb, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qpois(double p, double lb) {
        return Instance.qpois(p, lb, 1, 0);
    }



    /* Weibull Distribution */
    public static double dweibull(double x, double sh, double sl, boolean lg) {
        return Instance.dweibull(x, sh, sl, lg ? 1 : 0);
    }
    public static double dweibull(double x, double sh, double sl) {
        return Instance.dweibull(x, sh, sl, 0);
    }
    public static double pweibull(double x, double sh, double sl, boolean lt, boolean lg) {
        return Instance.pweibull(x, sh, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pweibull(double x, double sh, double sl) {
        return Instance.pweibull(x, sh, sl, 1, 0);
    }
    public static double qweibull(double p, double sh, double sl, boolean lt, boolean lg) {
        return Instance.qweibull(p, sh, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qweibull(double p, double sh, double sl) {
        return Instance.qweibull(p, sh, sl, 1, 0);
    }



    /* Logistic Distribution */
    public static double dlogis(double x, double lc, double sl, boolean lg) {
        return Instance.dlogis(x, lc, sl, lg ? 1 : 0);
    }
    public static double dlogis(double x, double lc, double sl) {
        return Instance.dlogis(x, lc, sl, 0);
    }
    public static double plogis(double x, double lc, double sl, boolean lt, boolean lg) {
        return Instance.plogis(x, lc, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double plogis(double x, double lc, double sl) {
        return Instance.plogis(x, lc, sl, 1, 0);
    }
    public static double qlogis(double p, double lc, double sl, boolean lt, boolean lg) {
        return Instance.qlogis(p, lc, sl, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qlogis(double p, double lc, double sl) {
        return Instance.qlogis(p, lc, sl, 1, 0);
    }



    /* Non-central Beta Distribution */
    public static double dnbeta(double x, double a, double b, double ncp, boolean lg) {
        return Instance.dnbeta(x, a, b, ncp, lg ? 1 : 0);
    }
    public static double dnbeta(double x, double a, double b, double ncp) {
        return Instance.dnbeta(x, a, b, ncp, 0);
    }
    public static double pnbeta(double x, double a, double b, double ncp, boolean lt, boolean lg) {
        return Instance.pnbeta(x, a, b, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pnbeta(double x, double a, double b, double ncp) {
        return Instance.pnbeta(x, a, b, ncp, 1, 0);
    }
    public static double qnbeta(double p, double a, double b, double ncp, boolean lt, boolean lg) {
        return Instance.qnbeta(p, a, b, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qnbeta(double p, double a, double b, double ncp) {
        return Instance.qnbeta(p, a, b, ncp, 1, 0);
    }



    /* Non-central F Distribution */
    public static double dnf(double x, double df1, double df2, double ncp, boolean lg) {
        return Instance.dnf(x, df1, df2, ncp, lg ? 1 : 0);
    }
    public static double dnf(double x, double df1, double df2, double ncp) {
        return Instance.dnf(x, df1, df2, ncp, 0);
    }
    public static double pnf(double x, double df1, double df2, double ncp, boolean lt, boolean lg) {
        return Instance.pnf(x, df1, df2, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pnf(double x, double df1, double df2, double ncp) {
        return Instance.pnf(x, df1, df2, ncp, 1, 0);
    }
    public static double qnf(double p, double df1, double df2, double ncp, boolean lt, boolean lg) {
        return Instance.qnf(p, df1, df2, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qnf(double p, double df1, double df2, double ncp) {
        return Instance.qnf(p, df1, df2, ncp, 1, 0);
    }



    /* Non-central Student t Distribution */
    public static double dnt(double x, double df, double ncp, boolean lg) {
        return Instance.dnt(x, df, ncp, lg ? 1 : 0);
    }
    public static double dnt(double x, double df, double ncp) {
        return Instance.dnt(x, df, ncp, 0);
    }
    public static double pnt(double x, double df, double ncp, boolean lt, boolean lg) {
        return Instance.pnt(x, df, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pnt(double x, double df, double ncp) {
        return Instance.pnt(x, df, ncp, 1, 0);
    }
    public static double qnt(double p, double df, double ncp, boolean lt, boolean lg) {
        return Instance.qnt(p, df, ncp, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qnt(double p, double df, double ncp) {
        return Instance.qnt(p, df, ncp, 1, 0);
    }



    /* Studentized Range Distribution */
    public static double ptukey(double q, double rr, double cc, double df, boolean lt, boolean lg) {
        return Instance.ptukey(q, rr, cc, df, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double ptukey(double q, double rr, double cc, double df) {
        return Instance.ptukey(q, rr, cc, df, 1, 0);
    }
    public static double qtukey(double p, double rr, double cc, double df, boolean lt, boolean lg) {
        return Instance.qtukey(p, rr, cc, df, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qtukey(double p, double rr, double cc, double df) {
        return Instance.qtukey(p, rr, cc, df, 1, 0);
    }



    /* Wilcoxon Rank Sum Distribution */
    public static double dwilcox(double x, double m, double n, boolean lg) {
        return Instance.dwilcox(x, m, n, lg ? 1 : 0);
    }
    public static double dwilcox(double x, double m, double n) {
        return Instance.dwilcox(x, m, n, 0);
    }
    public static double pwilcox(double q, double m, double n, boolean lt, boolean lg) {
        return Instance.pwilcox(q, m, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double pwilcox(double q, double m, double n) {
        return Instance.pwilcox(q, m, n, 1, 0);
    }
    public static double qwilcox(double x, double m, double n, boolean lt, boolean lg) {
        return Instance.qwilcox(x, m, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qwilcox(double x, double m, double n) {
        return Instance.qwilcox(x, m, n, 1, 0);
    }



    /* Wilcoxon Signed Rank Distribution */
    public static double dsignrank(double x, double n, boolean lg) {
        return Instance.dsignrank(x, n, lg ? 1 : 0);
    }
    public static double dsignrank(double x, double n) {
        return Instance.dsignrank(x, n, 0);
    }
    public static double psignrank(double x, double n, boolean lt, boolean lg) {
        return Instance.psignrank(x, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double psignrank(double x, double n) {
        return Instance.psignrank(x, n, 1, 0);
    }
    public static double qsignrank(double x, double n, boolean lt, boolean lg) {
        return Instance.qsignrank(x, n, lt ? 1 : 0, lg ? 1 : 0);
    }
    public static double qsignrank(double x, double n) {
        return Instance.qsignrank(x, n, 1, 0);
    }



    public static void main(String[] args) {
        System.out.println("dnorm(1.2, mu = 3.4, sd = 5.6) = " + Rmath.dnorm(1.2, 3.4, 5.6));
    }
}
