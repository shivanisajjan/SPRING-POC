FROM java:8
ADD ./target/poc-0.0.1-SNAPSHOT.jar /usr/src/poc-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "poc-0.0.1-SNAPSHOT.jar"]