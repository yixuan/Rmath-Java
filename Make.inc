CC = gcc
CFLAGS_EXTRA = -Wall -O3

## OS detection
## Reference: http://stackoverflow.com/questions/714100/os-detecting-makefile

ifeq ($(OS), Windows_NT)

    SHLIB_EXT = dll
    PREFIX_OS = win32-

    ifeq ($(PROCESSOR_ARCHITECTURE), AMD64)
        PREFIX_ARCH = x86-64
    endif

    ifeq ($(PROCESSOR_ARCHITECTURE), x86)
        PREFIX_ARCH = x86
    endif

else

    UNAME_P := $(shell uname -p)

    ifeq ($(UNAME_P), x86_64)
        PREFIX_ARCH = x86-64
    endif

    ifneq ($(filter %86, $(UNAME_P)),)
        PREFIX_ARCH = x86
    endif

    ifneq ($(filter arm%, $(UNAME_P)),)
        PREFIX_ARCH = arm
    endif

    UNAME_S := $(shell uname -s)

    ifeq ($(UNAME_S), Linux)
        SHLIB_EXT = so
        PREFIX_OS = linux-
        CFLAGS_EXTRA += -fPIC
    endif

    ifeq ($(UNAME_S), FreeBSD)
        SHLIB_EXT = so
        PREFIX_OS = freebsd-
        CFLAGS_EXTRA += -fPIC
    endif

    ifeq ($(UNAME_S), OpenBSD)
        SHLIB_EXT = so
        PREFIX_OS = openbsd-
        CFLAGS_EXTRA += -fPIC
    endif

    ifeq ($(UNAME_S), Darwin)
        SHLIB_EXT = dylib
        PREFIX_OS = darwin
        PREFIX_ARCH =
        CFLAGS_EXTRA += -fPIC
    endif

    ifeq ($(UNAME_S), SunOS)
        SHLIB_EXT = so
        PREFIX_OS = sunos-
        CFLAGS_EXTRA += -fPIC
    endif
endif

LIBPATH = $(PREFIX_OS)$(PREFIX_ARCH)
LIBNAME = libRmath.$(SHLIB_EXT)

ifeq ($(OS), Windows_NT)
    LIBNAME = Rmath.dll
endif
