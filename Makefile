include ./Make.inc

JAR = jar
JAVA = java
JAVAC = javac -source 1.6 -target 1.6

DYNLIB = $(LIBPATH)/$(LIBNAME)
JARFILE = rmath.jar


all: $(JARFILE)

$(JARFILE): java/statr/rmath/Rmath.class $(DYNLIB)
	$(JAR) cf $@ -C java statr $(LIBPATH) -C prebuilt win32-x86 -C prebuilt win32-x86-64

java/statr/rmath/Rmath.class: java/statr/rmath/Rmath.java
	$(JAVAC) $<

$(DYNLIB):
	cd Rmath && make
	mkdir -p $(LIBPATH)
	cp Rmath/$(LIBNAME) $(DYNLIB)

clean:
	cd Rmath && make clean
	rm java/statr/rmath/*.class
	rm -r $(LIBPATH)
	rm $(JARFILE)
