/**

Convert

    double dunif(double x, double a, double b, int lg);
    double punif(double x, double a, double b, int lt, int lg);

into

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

*/


val s = "double punif(double x, double a, double b, int lt, int lg);"

def print_methods(s: String) : Unit = {
    val java_sig = s.replace(";", "").
        replace("int lt", "boolean lt").
        replace("int lg", "boolean lg")
    val java_sig_overload = java_sig.replace(", boolean lt", "").replace(", boolean lg", "")

    val java_call = s.replace(";", "").
        replace("double ", "").
        replace("int lt", "lt ? 1 : 0").
        replace("int lg", "lg ? 1 : 0")
    val java_call_overload = s.replace(";", "").
        replace("double ", "").
        replace("int lt", "1").
        replace("int lg", "0")

    val fun_name = java_call.split('(')(0)

    val prefix = "public static "

    val java_fun = prefix + java_sig + " {\n" + "    return Instance." + java_call + ";\n}"
    val java_fun_overload = prefix + java_sig_overload + " {\n" + "    return Instance." + java_call_overload + ";\n}"
    println(java_fun)
    println(java_fun_overload)
}

// print_methods(s)
// print_methods("double dunif(double x, double a, double b, int lg);")


import scala.io.Source

val filename = "funs.txt"
for(line <- Source.fromFile(filename).getLines()) {
    if(line.isEmpty())
        println("\n\n")
    else
        print_methods(line)
}

