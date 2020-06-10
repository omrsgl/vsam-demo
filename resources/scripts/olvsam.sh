#!/bin/bash
OL_VSAM_CLI_JAR="jar/ol-vsam-cli.jar"
API_PROJECT_DIR="../../ol-vsam-api"

chmod -R 777 ${OL_VSAM_CLI_JAR}
java -jar ${OL_VSAM_CLI_JAR} -proj ${API_PROJECT_DIR} $@