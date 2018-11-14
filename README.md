# Duplicate input error

## Problem description

We have two files with identical names `input.js` but in separate namespaces and dirs
but build script does not distinguish them and puts by the same path in the `target/cljsbuild-compiler-0` dir.

## Steps to reproduce

1. `lein cljsbuild once`

### Actual result

```
Compiling ClojureScript...
Compiling ["/<path-to-project>/lighthouse/target/cljsbuild-main.js"] from ["src"]...
Nov 14, 2018 1:15:42 PM com.google.javascript.jscomp.LoggerErrorManager println
SEVERE: ERROR - Duplicate input: /<path-to-project>/lighthouse/target/cljsbuild-compiler-0/input.js

Nov 14, 2018 1:15:42 PM com.google.javascript.jscomp.LoggerErrorManager printSummary
WARNING: 1 error(s), 0 warning(s)
ERROR: JSC_DUPLICATE_INPUT. Duplicate input: /<path-to-project>/lighthouse/target/cljsbuild-compiler-0/input.js at (unknown source) line (unknown line) : (unknown column)
Compiling ["/<path-to-project>/lighthouse/target/cljsbuild-main.js"] failed.
java.lang.Exception: Closure compilation failed
```

### Expected result

Compiling finished without errors
