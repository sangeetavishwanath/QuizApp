# Quiz App
An API for creating and taking a quiz. 

## Technical Details
* The Quiz App is a [Spring Boot](https://spring.io/projects/spring-boot) application built over a [PostgreSQL](https://www.postgresql.org/) database.
* It uses [Auth0](https://auth0.com/) for authentication

## Domain
### Quiz
* A quiz consists of several multiple choice questions. 
* Each question can have upto 4 answer choices and exactly one correct answer.
* There are two types of users - a teacher and a student.

### Teacher
* A teacher can create, view, edit, and delete a quiz. 
* The teacher who creates the quiz owns the quiz. 
* The owner can add, edit or delete questions and answers in a quiz.
* A teacher can get a list of all quizzes.
* A teacher can view all the questions/answers of a quiz.
* A quiz and its questions/answers can be edited/deleted only by its owner.

### Student
* A student can get a list of all quizzes.
* A student can view a quiz along with it's questions and answer choices but not the answer.
* A student can answer a question in the quiz and get the validation in the response.


