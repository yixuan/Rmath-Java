include ./Make.inc

JAR = jar
JAVA = java
JAVAC = javac

DYNLIB = $(LIBPATH)/$(LIBNAME)
JARFILE = rmath.jar


all: $(JARFILE)

$(JARFILE): java/statr/rmath/Rmath.class $(DYNLIB)
	$(JAR) cf $@ -C java statr $(DYNLIB)

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
