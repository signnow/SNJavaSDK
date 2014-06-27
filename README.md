SNJavaSDK
=========

This is an SDK that wraps the SignNow REST API. Documentation for the REST API can be found out https://signnow.atlassian.net/wiki/display/SAPI/REST+Endpoints

# Dependencies

Package management is handled by Gradle. Please install ~v1.12 on your system using the instructions found at http://www.gradle.org/get-started

# Test

Unit tests are in the standard test directory at ```src/test/java```

If you are running into an error ```javax.net.ssl.SSLProtocolException: handshake alert:  unrecognized_name``` refer to this StackOverflow article http://stackoverflow.com/a/14884941/91358

# Build

```gradle jar``` will compile package the artifacts into a jar file in ```build/libs/```
