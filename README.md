# Spring Cloud - Seminarium zaawansowanych technik internetowych

## Zawartość
Wewnątrz katalogu "start" znajdują się 3 imitacje mikroserwisów: "greeting", "name", oraz agregujący je "web".

Wewnątrz katalogu "complete" znajdują się 3 imitacje mikroserwisów: "greeting", "name", oraz agregujący je "web", jednak te mikroserwisy korzystają z funkcjonalności zapewnionych przez Spring Cloud.

Wewnątrz katalogu "config" znajduje się plik .yml który wskazuje na położenie realnych configów projektu opartego o Spring Cloud. Configi te znajdują się w osobnym repozytorium, tak by podkreślić możliwości "spring cloud configserver".

Przykład został przygotowany w opraciu o prezentację Ryana Baxtera dostępną pod adresem: https://www.youtube.com/watch?v=aO3W-lYnw-o



## Instrukcja uruchomienia przykładu

zainstalować sdkman! 

w 1 oknie:
        
        curl -s "https://get.sdkman.io" | bash
w 2 oknie:
        
        source "$HOME/.sdkman/bin/sdkman-init.sh"
        
następnie instalacja springboota za przy pomocy pobraanego już sdkman'a:

        sdk install springboot 2.1.0.RELEASE
        sdk use springboot 2.1.0.RELEASE

można sprawadzić wersję:
        
        springboot version

ostatni elementem do zainstalowania jest sam spring cloud client:

        spring install org.springframework.cloud:spring-cloud-cli:2.1.0.RELEASE

Aby uruchomić przykład wraz z funcjonalnościami zawartymi w spring cloudzie, należy wywołać poniższą komendę:

        spring cloud eureka configserver zipkin

Bez poniższych dependencji kod nie działał:

        <dependency>
        <groupId>org.apache.httpcomponents</groupId>
        <artifactId>httpclient</artifactId>
        <version>4.5.13</version>
        </dependency>

        <dependency>
        <groupId>com.squareup.okhttp3</groupId>
        <artifactId>okhttp</artifactId>
        <version>4.9.3</version>

Po uruchomieniu pod adresem "http://localhost:8761/" powinien być dostępny serwer Eureka:
<img width="1440" alt="Zrzut ekranu 2022-05-24 o 17 47 16" src="https://user-images.githubusercontent.com/56223666/170077894-fc84cf36-ee2b-4ee6-ba38-7e4744672bcf.png">

Natomiast pod adresem "http://localhost:9411/zipkin/", serwer Zipkin przechwytujący logi:
<img width="1440" alt="Zrzut ekranu 2022-05-24 o 18 00 23" src="https://user-images.githubusercontent.com/56223666/170080697-98ac9201-ef9a-4259-9f5a-a37f8b19fe5a.png">
