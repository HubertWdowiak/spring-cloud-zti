zainstalować sdkman! 

w 1 oknie:
curl -s "https://get.sdkman.io" | bash
w 2 oknie:
source "$HOME/.sdkman/bin/sdkman-init.sh"

sdk install springboot 2.1.0.RELEASE
sdk use springboot 2.1.0.RELEASE
springboot version

spring install org.springframework.cloud:spring-cloud-cli:2.1.0.RELEASE

komenda: spring cloud eureka configserver zipkin

Należy dodać poniższe dependencje:


        <dependency>
        <groupId>org.apache.httpcomponents</groupId>
        <artifactId>httpclient</artifactId>
        <version>4.5.13</version>
        </dependency>

        <dependency>
        <groupId>com.squareup.okhttp3</groupId>
        <artifactId>okhttp</artifactId>
        <version>4.9.3</version>
