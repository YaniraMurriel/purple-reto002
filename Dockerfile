FROM openjdk:11-jre
ADD /build/libs/reto002-0.0.1-SNAPSHOT.jar reto2YMV.jar
EXPOSE 8089
RUN bash -c 'touch /reto2YMV.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/reto2YMV.jar"]