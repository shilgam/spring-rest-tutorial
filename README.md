# spring-test-tutorial

## Prerequisites
* Java 8

## Usage

1. Clone the repo

1. Run the application

        $ ./gradlew bootRun

1. Use the application

        $ curl -v localhost:8080/employees

        $ curl -v localhost:8080/employees/99

        $ curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'

        $ curl -X PUT localhost:8080/employees/3 -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "ring bearer"}'

        $ curl -X DELETE localhost:8080/employees/3
