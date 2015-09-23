# Rmath-Java

Rmath-Java is a Java wrapper of the Rmath library from [R](http://www.r-project.org),
which contains functions related to statistical distributions.

## Dependency

This library uses [JNA](https://github.com/java-native-access/jna) to call native
code in Rmath. See the next section for download link of JNA.

## Getting Rmath-Java

### Download

- [JNA (4.2.0)](https://maven.java.net/content/repositories/releases/net/java/dev/jna/jna/4.2.0/jna-4.2.0.jar)
- [Rmath-Java](https://github.com/yixuan/Rmath-Java/raw/master/prebuilt/rmath.jar) for Windows
and 64-bit Linux. For other systems and architectures, the jar file can be built
from source.

### Build from source

To build Rmath-Java from source, one needs:

- GCC/Clang compiler
- JDK
- make

Then simply enter the source directory and type `make`.

## Examples

For Java,

```java
import statr.rmath.Rmath;

public class TestRmath {
    public static void main(String[] args) {
        System.out.println("dnorm(1.2, mu = 3.4, sd = 5.6) = " +
                           Rmath.dnorm(1.2, 3.4, 5.6));
    }
}
```

or in Scala,

```scala
import statr.rmath.Rmath

Rmath.dnorm(1.2, 3.4, 5.6)
```

## License

Rmath-Java includes code from the R project which is licensed under
[GPL (>= 2)](https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html).
Rmath-Java itself is also licensed under GPL (>= 2).
