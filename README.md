# PFC Game API (Rock–Paper–Scissors) — Spring Boot

A simple **Spring Boot REST API** that lets a player play **Rock–Paper–Scissors** (French: *Pierre–Feuille–Ciseaux*) against the computer.  
The API receives the player's choice and returns the computer's choice and the game result.

## Features
- Play Rock–Paper–Scissors via a REST endpoint
- Random computer choice generation
- Result calculation: win / lose / draw
- JSON request/response models (`GameRequest`, `GameResponse`)
- CORS enabled (`@CrossOrigin(origins="*")`) to allow frontend apps (e.g., Angular) to call the API
- Runs on **port 8081**

## Tech Stack
- Java
- Spring Boot
- Spring Web (REST Controller)
- Maven

## API Endpoint

### `POST /play`
**Request Body**
```json
{
  "playerChoice": "pierre"
}
```

### Allowed values
pierre (rock)
feuille (paper)
ciseaux (scissors)

### Response Example
```json
{
  "playerChoice": "pierre",
  "computerChoice": "ciseaux",
  "result": "gagné"
}
```

### Possible results
gagné (win)
perdu (lose)
égalité (draw)

### Run Locally
## Prerequisites
Java (JDK 17+ recommended)
Maven

## Steps
1. Clone the repository:
```bash
git clone <YOUR_REPO_URL>
```
2. Go to the project folder:
```bash
cd pfcgame
```
3. Run the application:
```bash
mvn spring-boot:run
```
4. The API will be available at:
```bash
http://localhost:8081
```

### Test the API
## Using cURL
```bash
curl -X POST http://localhost:8081/play \
  -H "Content-Type: application/json" \
  -d "{\"playerChoice\":\"pierre\"}"
```
## Using Postman
Method: POST
URL: http://localhost:8081/play
Body (raw JSON):
```bash
{ "playerChoice": "feuille" }
```

### Project Structure
src/main/java/com/example/pfcgame
├── PfcgameApplication.java
├── controller/
│   └── GameController.java
└── model/
    ├── GameRequest.java
    └── GameResponse.java

### Configuration
In src/main/resources/application.properties:
  spring.application.name=pfcgame
  server.port=8081

### Author
Abir Ouelhazi
