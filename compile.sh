#!/bin/bash

printf "copmiling..\n\n"

javac -d bin --module-source-path src $(find src -name "*.java")


