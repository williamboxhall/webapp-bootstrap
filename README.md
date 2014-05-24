A toy webapp with a minimalist implementation of a 4-Tier DDD webapp.<br />
Spring(MVC/REST/TX), Jackson JSON mapping, OVal validation, Hibernate w/ Grepo Generic Repositories, Maven for build, jetty web server.<br />
Testing with jUnit, Hamcrest and Mockito.<br />
<br />
Build and run with:<br />
mvn clean install jetty:run<br />
<br />
Point your browser at localhost:8080 and have a play.<br />
<br />
RESTful Resources:<br />
<br />
curl -X POST -H "Content-Type: application/json" -d '{"topping":"tomato sauce"}' http://localhost:8080/rest/pies/<br />
curl -X GET http://localhost:8080/rest/pies/<br />
curl -X GET http://localhost:8080/rest/pies/1<br />
<br />
Test validation with:<br />
curl -X POST -H "Content-Type: application/json" -d '{"topping":"x"}' http://localhost:8080/rest/pies/<br />
<br />
