FROM openjdk:11.0.6-jre-slim
RUN groupadd -r ol && useradd -r -g ol ol
USER ol
COPY './target/vsam-api.jar' /usr/local
CMD ["java", "-jar", "./usr/local/vsam-api.jar"]