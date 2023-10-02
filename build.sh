#!/usr/bin/env bash
echo Hello
javac org/*/*.java
jar --create --file SimpleApp.jar --manifest=MANIFEST.MF org/*/*.class
java -jar ./SimpleApp.jar
