# spring-cloud-config-server
The repository has Spring Cloud Config Server, Spring Cloud Client and a Postman Collection to test the setup.

Download both projects on your local. Run them on the already configured ports on your local.

Update the client config yaml file in the server to do runtime updates for your client to read latest cofigurations.

Re-run the server. Import the postman collection and Hit Send. 

You will see the client now reads the updated config on the /greeting endpoint.
