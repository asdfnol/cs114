#!/bin/bash

if [ $# -lt 2 ]; then
    echo "Usage: ./run.sh <module-name> <main-class> [optional-args...]"
    echo "Example: ./run.sh lecture.one lecture.one.Main"
    exit 1
fi

MODULE=$1
MAIN_CLASS=$2
shift 2

# run the java application

printf "running java application...\n"
java -p bin -m "$MODULE/$MAIN_CLASS" "$@"

