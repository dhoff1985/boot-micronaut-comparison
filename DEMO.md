# Demo

# JVM Apps

1. Show code, Ships controller, Ships Service, Domain Objects
2. Start Apps
3. Open Developer Tab
4. Hit localhost:8080/ships (boot)
5. New Tab, open developer tab
6. Hit localhost:8086/ships
7. open JConsole, connect to each app, trigger gc

8. Stop both apps

# GRAALVM 

1. run native-image against micronaut app
```$xslt
native-image --no-server -jar build/libs/space-micronaut-0.1.jar 
```
2. Start native image
```$xslt
./space-micronaut-0.1
```
3. New Tab, open developer tab

4. Hit localhost:8080/ships