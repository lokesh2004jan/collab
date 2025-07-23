#!/bin/bash

echo "🧹 Cleaning project..."
./gradlew clean

echo "🔧 Building project..."
./gradlew build

echo "🚀 Running app..."
java -jar build/libs/docker-0.0.1-SNAPSHOT.jar
