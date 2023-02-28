## F1 Kotlin Micronaut API


Example Kotlin Micronaut API example that retrieves F1 results from the [Ergast API](http://ergast.com/).

Example call using this application: `/results/2022/leclerc`.

---

Notes
---

### Reactive Programming


Reactive programming is a design approach that uses asynchronous programming logic to handle real-time adjustments to
typically static information. It provides an efficient mechanism — the use of automated data streams — 
for handling content modifications in response to user inquiries.

The spring-web-reactive module contains the Spring Web Reactive framework that supports the @Controller programming
model. It re-defines many of the Spring MVC contracts such as HandlerMapping and HandlerAdapter to be asynchronous and 
non-blocking and to operate on the reactive HTTP request and response.

#### Non-blocking

With a Non-Blocking approach, you can design your application in such a way that the subsequent calls to different
classes/methods, calls to external systems to run in a separate thread thus freeing the current thread to do other 
tasks or return to the container pool.

#### Asynchronous  
Asynchronous communication happens on your own time and doesn't need scheduling.

#### Mono Reactor
A Mono object represents a single or empty value. This means it can emit only one value at
most for the onNext() request and then terminates with the onComplete() signal. In case of failure,
it only emits a single onError() signal.

---

### Micronaut 3.8.6 Documentation

- [User Guide](https://docs.micronaut.io/3.8.6/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.8.6/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.8.6/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
- [Micronaut HTTP Client](https://guides.micronaut.io/latest/micronaut-http-client-gradle-kotlin.html)
### Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

---

### Gradle
- [Shadow Gradle Plugin](https://plugins.gradle.org/plugin/com.github.johnrengelman.shadow)

