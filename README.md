### Spring Boot 3 - GraalVM 
<img src="image/feature.png" alt="feature" width="669" height="373" />

### 🔨 Run the App

#### Maven

<b>1 )</b> Download your project from this link shown below
```
    git clone https://github.com/Eukolos/spring-boot-3-example.git
```

<b>2 )</b> Go to the project's home directory shown below
```
    cd spring-boot-3-example
```

<b>3 )</b> Create native image though this command shown below
```
    mvn -Pnative spring-boot:build-image
```

<b>4 )</b> Run the project though this command shown below
```
    docker-compose up
```

### Used Dependencies
* Core
    * Spring
        * Spring Boot 3
        * Spring Web
        * H2 Database
* Docker
* GraalVM CE Java 17-22.3.0

### Create a Post

```
POST /v1/post
Accept: application/json
Content-Type: application/json
{
"title" : "GraalVM",
"body" : "uber fasttt",
}
RESPONSE: HTTP 200 (OK)
Location header: http://localhost:9090/v1/post
```

### Get Post List

```
GET /v1/post
Accept: application/json
Content-Type: application/json
{

}
RESPONSE: HTTP 200 (OK)
Content: paginated list 
Location header: http://localhost:9090/v1/post
```

### Get Post

```
GET /v1/post/{id}
Accept: application/json
Content-Type: application/json
{

}
RESPONSE: HTTP 200 (OK)
Content: paginated list 
Location header: http://localhost:9090/v1/post/{id}
```



### Resource

- [Docker with WASM](https://docs.docker.com/desktop/wasm/)
- [Spring Boot 3 release](https://spring.io/blog/2022/11/24/spring-boot-3-0-goes-ga)
- [SpringDeveloper Youtube Channel](https://www.youtube.com/watch?v=TOfYlLjXufw&ab_channel=SpringDeveloper)
- [GraalVM Native Image Support](https://docs.spring.io/spring-boot/docs/3.0.0/reference/html/native-image.html#native-image)
