# Getting Started
* This ia an application which creates https API end points 
* and you can use configuration file in thew resource folder, where we DB connections are specified.
* https://localhost:9191/products GET method to get the list of products
* https://localhost:9191/addProduct POST method to add product with {
  "name":"A3 Paper",
  "quantity":1,
  "price":40
  }//body.
* https://localhost:9191/addProducts  POST method to add products with {
  [{
  "name":"A4 Paper",
  "quantity":1,
  "price":50.5
  },{
  "name":"Lunch Box",
  "quantity":50,
  "price":100
  }]//body.
* https://localhost:9191/productById/1 GET method to get the list of product by ID
* https://localhost:9191/product/Ball GET method to get the list of product by Name
* https://localhost:9191/delete/1 DELETE method to delete the product
* https://localhost:9191/update PUT method to update the product
* {"id":52,
  "name":"Pencils",
  "price":20,
  "quantity":"50"
  }//body
### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.2/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.2/gradle-plugin/packaging-oci-image.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#web)

### Guides

The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

