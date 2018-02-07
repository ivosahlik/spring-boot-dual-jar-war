#!/usr/bin/env bash

echo "Start";
mvn clean package -Pdev; java -jar target/dual.jar
echo "End";