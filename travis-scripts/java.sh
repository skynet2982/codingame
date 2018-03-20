#!/bin/bash

rootDir=$1

# run java solutions tests
cd ${rootDir}/java/
mvn clean install