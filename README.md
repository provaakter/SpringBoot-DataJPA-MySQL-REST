# SpringBoot-DataJPA-MVC-H2-REST
 <p>Spring boot REST API for performing CRUD operation or demonstrates all 4 basic HTTP request types using spring data jpa, spring rest repository, h2 embdded database library jars. GET, POST, PUT and DELETE controller methods implemented.</p>

<h2>Installation</h2> 
 <ul>
	<li>This is a Spring Starter Project, so you just need to import it to your IDE and run the <b>Spring Boot App</b> to resolve the dependencies.</li>
</ul>

<h2>Dependencies</h2>
	<ul>
		<li><h5>Spring Starter Project Dependencies</h5></li>
			<p>->Spring Data JPA</p>
      <p>->H2 Database</p>
      <p>->Rest Repositories</p>
	<li><h5>To Get XML Data (by default Spring Boot support to get only JSON data)</h5></li>
			<p>->Jackson Dataformat XML - Version 2.9.9(the version is matched to the exist jackson-databind dependency/jar)</p>
    <li><h5>Dependency for Auto Relunch the Application</h5></li>
			<p>->Spring Boot Devtools - Version 2.1.8.RELEASE</p>
	</ul>

<h2>Tools and Technologies Used</h2>
	<ul>
		<li>Spring Boot,    version="2.1.8.RELEASE"</li>
		<li>JDK,          version="1.8 or later"</li>
		<li>IDE,          Eclipse or Spring Tool Suite (STS)</li>
	</ul>
  
 <h2>Database configuration</h2> 
 <ul>
		<li>H2 embdded database uses for this application so to access into the database use this link (<b>http://localhost:8080/h2-console</b>) and use (<b>jdbc:h2:mem:technardiot</b>) as JDBC URL.</li>
		<li>Connect and run this (<b>SELECT * FROM CUSTOMER</b>) query to see the existing data in database.</li>
		<li>Existing data has entered using the <b>data.sql</b> file.</li>
 </ul>
 
 <h2>Calling Procedure from Postman</h2>
	<ul>
	<li><h5>Get All Request</h5></li>
			<p>http://localhost:8080/customers</p>
	<li><h5>Get by Id Request</h5></li>
			<p>http://localhost:8080/customer/2</p>
	<li><h5>Post Request</h5></li>
			<img src="https://github.com/provaakter/SpringBoot-DataJPA-MVC-H2-REST/blob/master/Image/Rest%20Api%20Post%20Request%20.jpg">
	<li><h5>Put Request</h5></li>
			<img src="https://github.com/provaakter/SpringBoot-DataJPA-MVC-H2-REST/blob/master/Image/Rest%20Api%20Put%20Request%20.jpg">
	<li><h5>Delete Request</h5></li>
			<p>http://localhost:8080/customer/4</p>
	</ul>
