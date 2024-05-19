#!/bin/sh

echo 'Building Docker Image'
docker build -t sbs/1.0 .

echo 'Running Application'
docker run -p 8080:8080 sbs/1.0