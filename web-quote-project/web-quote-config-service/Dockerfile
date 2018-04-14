##FROM java:8
##VOLUME /tmp
##ARG JAR_FILE
##ADD target/web-quote-config-service-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]



FROM java:8
COPY ./target/web-quote-config-service-0.0.1-SNAPSHOT.jar /usr/src/hola/
WORKDIR /usr/src/hola
EXPOSE 8080
CMD ["java", "-jar", "web-quote-config-service-0.0.1-SNAPSHOT.jar"]
