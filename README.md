# spring-reactive-demo
--------------------------------------
DEMO
assuming you have docker/docker compose installed:

1. build the spring boor project 
2. run docker-compose up
3. perform CRUD operations
HTTP POST http://localhost:8080/create
   {
   "name":"John",
   "age":35
   }
HTTP POST http://localhost:8080/create
  {
   "name":"Jana",
   "age":35
   }

HTTP GET http://localhost:8080/

{"id":...,"name":"John","age":35}

{"id":...,"name":"Jane","age":35}

