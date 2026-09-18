# CERA 
Campus Emergency Response & Resource Allocation System

## 1. Problem Statement

Campus emergencies such as medical incidents, fire hazards and security threats require quick and organized response. Manual handling of emergencies can make it difficult to record incidents, determine their priority, assign suitable responders, manage available resources and track the progress of an emergency.

CERA (Campus Emergency Response & Resource Allocation System) is designed to provide a structured software based approach for managing campus emergencies. It organizes emergency reporting, classification, prioritization, responder assignment, resource allocation, status tracking and emergency reporting within a single Java based system.

---

## 2. Scope of the Project

CERA focuses on managing emergency situations within a college campus.

The project covers:

- Recording and managing campus emergencies
- Classification of emergencies based on type
- Assigning severity levels and calculating priority
- Managing students, faculty, administrators and responders
- Assigning suitable responders to emergencies
- Managing emergency resources
- Tracking emergency status from reporting to resolution
- Handling unavailable resources and invalid emergency IDs
- Processing multiple emergencies using multithreading
- Generating and reading emergency reports using file handling

The current version is implemented as a Java console based application. Database integration, real-time CCTV monitoring, GPS/live location tracking, external notifications and cloud deployment are outside the scope of the current implementation.

---

## 3. Target Users

### Students and Faculty
Students and faculty members are the primary users who can report campus emergencies and track the status of reported incidents.

### Responders
Responders are responsible for handling assigned emergencies and responding according to the type of incident.

The system supports specialized responders such as:

- Medical Responders
- Fire Responders
- Security Responders

### Campus Administrators
Administrators are responsible for managing users, responders, resources, monitoring emergencies and viewing emergency reports.

---

## 4. High Level Features

### Emergency Reporting
Records emergency details such as Emergency ID, type, location, severity and description.

### Emergency Classification & Prioritization
Classifies emergencies and calculates their priority based on severity and emergency type.

### Responder Assignment
Identifies and assigns an available responder suitable for the emergency.

### Resource Allocation
Manages resources such as ambulances, first-aid kits, fire extinguishers and security vehicles.

### Emergency Tracking
Tracks emergency status through stages such as:

`REPORTED → ASSIGNED → IN_PROGRESS → RESOLVED`

### Exception Handling
Handles situations such as unavailable resources and invalid emergency IDs using custom exceptions.

### Multithreaded Processing
Processes multiple emergencies using separate processing threads.

### Emergency Reports
Saves emergency information to a text file and allows stored reports to be read.

### User Management
Maintains different campus user types including students, faculty, administrators and responders.
