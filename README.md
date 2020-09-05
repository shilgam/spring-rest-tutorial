# spring-test-tutorial

## Prerequisites
* Java 8

## Usage

1. Clone the repo

1. Run the application

        $ ./gradlew bootRun

1. Visit http://localhost:8080/greeting where you should see: `{"id":1,"content":"Hello, World!"}`.

1. Provide a name query string parameter by visiting http://localhost:8080/greeting?name=User . You should see: `{"id":2,"content":"Hello, User!"}`
