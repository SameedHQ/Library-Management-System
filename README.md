# Library Management System

## Project Setup
#### Framework: Spring Boot for building a REST API quickly and efficiently.
#### Java 21: Utilizes the latest Java version with Maven for dependencies
#### Database: PostgreSQL (recommended for its support of relational data, ACID compliance, and advanced features).
#### Dependency Management: Maven (to handle project dependencies).

### Prerequisites
Ensure you have the following setup:
- Java 21
- Docker
- Maven
- GitHub account
- Docker Hub account

### Build and Run Locally
1. **Clone the repository**:
    ```sh
    git clone https://github.com/SameedHQ/Library-Management-System.git
    cd Library-Management-System
    ```

2. **Build the project using Maven**:
    ```sh
    mvn clean install
    ```

3. **Run the application**:
    ```sh
    java -jar target/library-management-system-0.0.1-SNAPSHOT.jar
    ```
### Docker
   1. **Build Docker image**:

       Go to path {contextPath}/library-management-api and run following command

       ```docker-compose build```
2. UP Docker container:

   ```docker-compose up```
3. Up & Running: Application will be listening to 8090 port, APIs should be accessible now.

### APIs/Postman Collection

A Postman collection is available to facilitate testing and exploring the Library Management System API. This collection includes various endpoints for managing borrowers and books. You can import this collection into Postman to quickly set up your API requests.

**Postman Collection Information:**
- **Name**: Library Management System
- **Description**: Postman collection for the Library Management System API
- **Schema**: [Postman Collection Schema](Library Management System.postman_collection.json)

**Endpoints Included:**
1. **Register a New Borrower**
    - **Method**: POST
    - **URL**: `{{base_url}}/api/borrowers`
    - **Headers**:
        - `Content-Type: application/json`
    - **Body**:
      ```json
      {
        "name": "Alice Johnson",
        "email": "alice.johnson@example.com"
      }
      ```

   2. **Register a New Book**
       - **Method**: POST
       - **URL**: `{{base_url}}/api/books`
       - **Headers**:
           - `Content-Type: application/json`
       - **Body**:
         ```json
         {
          "isbn": "978-3-16-148410-0",
          "title": "Introduction to Algorithms",
          "author": "Thomas H. Cormen"
         }
         ```

3. **List All Books**
    - **Method**: GET
    - **URL**: `{{base_url}}/api/books`

4. **Borrow a Book**
    - **Method**: POST
    - **URL**: `{{base_url}}/api/borrowers/{{borrower_id}}/borrow/{{book_id}}`
    - **Headers**:
        - `Content-Type: application/json`
    - **Body**:
      ```json
      {
        "borrowerId": {{borrower_id}},
        "bookId": {{book_id}}
      }
      ```

5. **Return a Book**
    - **Method**: POST
    - **URL**: `{{base_url}}/api/borrowers/{{borrower_id}}/return/{{book_id}}`
    - **Headers**:
        - `Content-Type: application/json`

6. **Verify Borrower Details**
    - **Method**: GET
    - **URL**: `{{base_url}}/api/borrowers/{{borrower_id}}`

7. **Verify Book Details**
    - **Method**: GET
    - **URL**: `{{base_url}}/api/books/{{book_id}}`

**Variables Included:**
- **base_url**: `http://localhost:8090`
- **borrower_id**: `1`
- **book_id**: `1`

### Importing the Collection into Postman
To import the Postman collection:
1. Download the `postman_collection.json` file from the repository.
2. Open Postman and click on `Import`.
3. Select the `postman_collection.json` file and click `Open`.

### API Documentation with Swagger

Swagger is integrated into the project to provide interactive API documentation. To access the Swagger UI:

1. **Run the application** (locally or using Docker).
2. Open your browser and navigate to:
    ```sh
    http://localhost:8090/swagger-ui.html
    ```

This will open the Swagger UI where you can interact with the API endpoints and see the detailed API documentation.

### API Endpoints

- **Register a new borrower**:
    ```http
    POST /api/borrowers
    {
    "name": "Alice Johnson",
    "email": "alice.johnson@example.com"
  }
    ```

- **Register a new book**:
    ```http
    POST /api/books
    {
    "isbn": "978-3-16-148410-0",
    "title": "Introduction to Algorithms",
    "author": "Thomas H. Cormen"
  }
    ```

- **Get a list of all books**:
    ```http
    GET /api/books
    ```

- **Borrow a book**:
    ```http
    POST /api/borrowers/{borrowerId}/borrow/{bookId}
    ```

- **Return a borrowed book**:
    ```http
    POST /api/borrowers/{borrowerId}/return/{bookId}
    ```

- **Get borrower details**:
    ```http
    GET /api/borrowers/{borrowerId}
    ```

- **Get book details**:
    ```http
    GET /api/books/{bookId}
    ```
