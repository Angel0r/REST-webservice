# REST-webservice

A RESTful Webservice using JAX-RS. The project is built with [Maven](http://maven.apache.org/) using [Apache Tomcat 9](https://tomcat.apache.org/download-90.cgi). MongoDB is used as well.

The RESTful Java client([clientGet.java](https://github.com/Angel0r/Web_Service_Rest/blob/master/src/main/java/com/angelos/wsjava/client/clientGet.java)) send GET request in order to get the Date and save it to a text file. It([clientPost.java](https://github.com/Angel0r/Web_Service_Rest/blob/master/src/main/java/com/angelos/wsjava/client/clientPost.java)) also sends a POST request in order to add a user in the database([MongoDB](https://www.mongodb.com/)) and show the specific Date.
