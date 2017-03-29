FROM rubin.com:5000/rubin/ubuntu-jre8:v1
COPY entrypoint.sh /data/entrypoint.sh
COPY test-spring-cloud-demo-eureka-*.jar /data/test-spring-cloud-demo-eureka.jar
ENTRYPOINT ["/data/entrypoint.sh"]
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.config.location=/data/application-docker.yml", "-jar", "/data/test-spring-cloud-demo-eureka.jar"]