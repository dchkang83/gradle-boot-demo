<h1>[spring-boot] 개발해보기</h1>
[티스토리] (https://dchkang83.tistory.com/)


'''groovy
plugins {
    id 'org.springframework.boot' version '2.4.4'
    id 'io.spring.dependency-management' version '1.0.11.RELEASE'
    id 'java'
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    implementation('org.springframework.boot:spring-boot-starter-web')
    implementation('org.springframework.boot:spring-boot-starter-web-services')
    implementation('org.projectlombok:lombok')
    annotationProcessor("org.projectlombok:lombok")
    testAnnotationProcessor('org.projectlombok:lombok')
    //    testImplementation('org.springframework.boot:spring-boot-starter-test')
    testImplementation('org.springframework.boot:spring-boot-starter-test') {
        exclude module: "junit" // JUnit4 제거, 스프링 부트 2.2.0 부터 JUnit5 적용
    }
}

test {
    useJUnitPlatform()
}


'''