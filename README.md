A demo webapp with a minimalist implementation of a 4-Tier DDD webapp.

Spring(MVC/REST/TX), Jackson JSON mapping, OVal validation, Hibernate w/ Grepo Generic Repositories, Maven for build, jetty web server. Testing with jUnit, Hamcrest and Mockito.


Build and run with:

```mvn clean install jetty:run```

Point your browser at localhost:8080 and have a play.

RESTful Resources:

```
curl -X POST -H "Content-Type: application/json" -d '{"topping":"tomato sauce"}' http://localhost:8080/rest/pies/
curl -X GET http://localhost:8080/rest/pies/
curl -X GET http://localhost:8080/rest/pies/1
```

Test validation with:
```
curl -X POST -H "Content-Type: application/json" -d '{"topping":"x"}' http://localhost:8080/rest/pies/
```
