# Developer Documentation
This documentation aims to help developers own and operate this application.

# Build and run
It is encouraged to use a IDE that has good support for gradle when developing your application locally.

If you want to run the application from the command line please use the gradle wrapper that is bundled with the application:

* gradlew.bat (windows)
* gradlew (mac)

To run this application simply use the following gradle task:
> gradlew bootRun


## Swagger
You should be able to access the swagger ui here:
[http://localhost:8443/swagger-ui.html](http://localhost:8443/swagger-ui.html)

# Test

Run the tests using
> gradlew test

The report is located at:
`/build/reports/tests/test/index.html`




## Links
| Description|  
|----------|
| [Test in zone01-z01](https://console-openshift-console.apps.scp-west-zone01-z01.swedbank.net)|
| [Test in zone02-z01](https://console-openshift-console.apps.scp-west-zone02-z01.swedbank.net)|


##  Application Dependencies
* Here you can specify what dependencies you have to other systems or APIs

## Other Dependencies
* List other types of dependencies
## Egress IPs 
| Cluster| Egress Ip|  
|----------|---------|
| scp-west-zone01-z01|xxxxxx|
| scp-west-zone02-z01|xxxxxx|
| scp-west-zone01-p01|xxxxxx|
| scp-west-zone02-p01|xxxxxx|

## Necessary Firewall Openings
| Service| Ip:Port|  
|----------|---------|
| service|xxxxxx:443|

## mTLS Certificates
Describe the common names for this application in test and prod:

| Common Name| Environment|  
|----------|---------|
| test-my-common-name.serviceid.sb|test|
