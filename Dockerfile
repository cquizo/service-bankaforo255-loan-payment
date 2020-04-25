FROM openjdk:13
VOLUME /tmp
EXPOSE 9091
ADD ./target/service-bankaforo255-loan-payment-0.0.1-SNAPSHOT.jar service-loan-payment.jar
ENTRYPOINT  ["java","-jar","/service-loan-payment.jar"]

# docker build -t loan-payment:v1 .
# docker run -p 9091:9091 --name loan-payment-server --network aforo255 -d loan-payment:v1
# docker run -p 1001:9091 --name loan-payment-server -d loan-payment:v1