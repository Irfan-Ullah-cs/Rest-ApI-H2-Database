REST API for Room Management
Overview
This project implements a REST API for managing rooms, windows, and sensors in a building. It allows users to create, read, update, and delete (CRUD) entities associated with the rooms.

Technologies Used
Spring Boot: For building the RESTful API.
H2 Database: An in-memory database for easy data storage and retrieval.
Dependency Injection: To manage dependencies and promote loose coupling in the application.
Entities
Room

Represents a physical room.
Attributes: id, name, floor.
Window

Represents a window associated with a room.
Attributes: id, name, status.
Sensor

Represents a sensor located in a room.
Attributes: id, name, status.
API Endpoints
Rooms
GET /api/rooms
Retrieve all rooms.

GET /api/rooms/{id}
Retrieve a specific room by ID.

POST /api/rooms
Create a new room.
Request Body: JSON representation of the room.

PUT /api/rooms/{id}
Update an existing room by ID.
Request Body: JSON representation of the room.

DELETE /api/rooms/{id}
Delete a room by ID.

Windows
GET /api/windows
Retrieve all windows.

GET /api/windows/{id}
Retrieve a specific window by ID.

POST /api/windows
Create a new window.
Request Body: JSON representation of the window.

PUT /api/windows/{id}
Update an existing window by ID.
Request Body: JSON representation of the window.

DELETE /api/windows/{id}
Delete a window by ID.

Sensors
GET /api/sensors
Retrieve all sensors.

GET /api/sensors/{id}
Retrieve a specific sensor by ID.

POST /api/sensors
Create a new sensor.
Request Body: JSON representation of the sensor.

PUT /api/sensors/{id}
Update an existing sensor by ID.
Request Body: JSON representation of the sensor.

DELETE /api/sensors/{id}
Delete a sensor by ID.

Getting Started
Clone the Repository

bash
Copy code
git clone https://github.com/Irfan-Ullah-cs/Rest-ApI-H2-Database.git
cd Rest-ApI-H2-Database
Run the Application You can run the application using your IDE or by executing the following command:

Access the API The API will be available at http://localhost:8080/api.
