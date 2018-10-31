#!/usr/bin/env bash
java -jar $PWD/antlr-4.7.1-complete.jar -Dlanguage=Go -o ../parser ../syntax/X.g4