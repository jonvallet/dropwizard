# Dropwizard Example #
This is sample using dropwizard and gradle instead of maven to do the build

## Build ##
You need to have Java 8 and Gradle 2.10+ installed

```
$ gradle build shadowJar
```

## Run ##

```
$ java -jar build/libs/*-all.jar server hello-world.yml
```

Now you can [browse](http://localhost:8080/hello-world) your application and check the [metrics](http://localhost:8081/)