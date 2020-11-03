FROM openjdk:8-jdk
VOLUME /tmp
VOLUME /logs
EXPOSE 8081
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","com.hello.hellotester.HelloTesterApplication"]

