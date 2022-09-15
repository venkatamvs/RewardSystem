Follow below steps to run application
1)check out the code
2)do maven install
3)run as java application, application will start


Technologies --> Postman, Spring Boot, Maven, H2
Unit Testing --> Junit (run com.points.PointsServiceTest.java class)


this will create sample data in H2.
http://localhost:8080/createTestData

Get the customer total earning points and monthly wise total earning points
http://localhost:8080/getRewards?name=customer1

Get the customer total earning points and monthly wise total earning points
http://localhost:8080/getRewards?name=customer2

Incase of user is not found
http://localhost:8080/getRewards?name=customer10
