## Project – Train Ticket Registration
## Overview-
* This project is based on TrainTicketRegistration where user can book the ticket by providing his/her details including the payment details. Once the registration is successful with the provided information, will generate the successful Acknowledgement with Invoice.
* For Storing the user and payment details used MYSQL Database.
* And we are specifying all the configuration details in application.properties file like driver, database name, username, password and the port number on which we want to run our application.
## Steps to Run:
* Clean install the application using maven install or maven build and if the Build is Success then
* Run the application as RUN AS SPRING BOOT APP and then it shows the port number on which the 
Application is running.
* Open POSTMAN and hit the url with the portnumber http://localhost:9090/bookTrainTicket and provide the JSON data and hit it.
* You will see the generated response .
## Sample Request
* {
    "passenger": {
        "name":"Bhavya",
        "email":"bhavyap@gmail.com",
        "source":"USA",
        "destination":"CANADA",
        "travelDate":"06-12-2021",
        "pickupTime":"4:00 PM",
        "arrivalTime":"6:00 PM",
        "price":4000.0
    },

    "payment": {
        "accountNo":"account1",
        "cardType":"DEBIT"
    }
}

## Sample Response
* {
    "status": "SUCCESS",
    "totalPrice": 4000.0,
    "pnrNo": "d073b700",
    "passenger": {
        "pId": 4,
        "name": "Bhavya",
        "email": "bhavayp@gmail.com",
        "source": "USA",
        "travelDate": "06-12-2021",
        "pickupTime": "4:00 PM",
        "arrivalTime": "6:00 PM",
        "price": 4000.0,
        "destination": "CANADA"
    }
}
