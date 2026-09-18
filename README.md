# CERA — Campus Emergency Response & Resource Allocation System

## Project Overview

CERA is a completely Java based campus emergency management system designed to provide a structured approach to handling emergencies within a college campus. The system allows emergencies to be recorded, classified according to their type and severity, prioritized, assigned to suitable responders and also managed using available resources.

It also provides: 

1.Emergency Status Tracking

2.Exception Handling

3.Multithreaded Emergency Processing 

4.File Based Report Generation.

## Problem Statement

Campus emergencies such as medical incidents, fire hazards and security threats require a very quick and organized response. Manual handling can make it difficult to prioritize emergencies, assign suitable responders, manage limited resources and also track emergency progress.

CERA addresses this problem by organizing these activities into a structured software workflow.

## Objectives

* Record campus emergencies systematically.
* Classify emergencies based on type and severity.
* Calculate emergency priority.
* Assign suitable responders.
* Manage emergency resources.
* Track emergency status.
* Handle expected errors using custom exceptions.
* Process multiple emergencies using multithreading.
* Generate emergency reports using file handling.

## Main Modules

### 1. User & Responder Management

Manages 
* Students
* Faculty
* Administrators 
* Emergency Responders

### 2. Emergency Reporting

Records emergency details such as 
* ID
* Type
* Location
* Severity
* Description

### 3. Emergency Classification & Prioritization

Classifies emergencies and calculates their priority.

### 4. Resource Allocation

Manages and allocates available emergency resources.

### 5. Emergency Tracking

Tracks emergency status from reporting to resolution.

### 6. Reports & Processing

Processes emergencies using multithreading and stores emergency reports in a text file.

## Java Concepts Used

* Classes and Objects
* Encapsulation
* Inheritance
* Abstraction
* Polymorphism
* Method Overriding
* Interfaces
* Enumerations
* ArrayList
* Vector
* Stack
* Exception Handling
* Custom Exceptions
* Multithreading
* File Input/Output
* Packages

## Emergency Types

* Medical
* Fire
* Security
* Electrical
* Natural Disaster
* Other

## Severity Levels

* LOW
* MEDIUM
* HIGH
* CRITICAL

## Emergency Status

```text
REPORTED
ASSIGNED
IN_PROGRESS
RESOLVED
CANCELLED
```

## Project Structure

<img width="338" height="322" alt="image" src="https://github.com/user-attachments/assets/1b681a29-fbcf-481e-98b8-8feec940da2f" />

## How to Run

Open the project in a Java IDE or terminal.

Navigate to the `src` directory and compile:

```bash
javac Main.java
```

Run the program:

```bash
java Main
```

## Exception Handling

CERA uses custom exceptions for expected errors.

* `ResourceUnavailableException` — used when a required resource is unavailable.
* `EmergencyNotFoundException` — used when an emergency ID cannot be found.

## File Handling

Emergency reports are stored using:

```text
emergency_report.txt
```

The system can save and read emergency reports.

## Multithreading

`EmergencyProcessingThread` is used to process multiple emergencies using separate threads. It handles emergency processing, resource allocation, resource release, and status updates.

## Current Scope

The current version is a Java console-based application. It does not currently include database integration, real-time CCTV integration, GPS/live location tracking, SMS/email notifications, or cloud deployment.

## Future Enhancements

* Database integration
* Web-based interface
* Mobile application
* GPS integration
* Real-time notifications
* CCTV integration
* Advanced emergency analytics

## Screenshots
<img width="583" height="748" alt="image" src="https://github.com/user-attachments/assets/e3c04d12-af80-4e9c-ab6f-0ab50075a87a" />
<img width="643" height="975" alt="image" src="https://github.com/user-attachments/assets/9413a7b3-00c6-4be1-bcef-43f8243cfbe9" />
<img width="510" height="889" alt="image" src="https://github.com/user-attachments/assets/b49123be-969b-4401-858a-1ef41383a678" />
<img width="677" height="1078" alt="image" src="https://github.com/user-attachments/assets/ecb6b68f-6599-4a2f-a141-85fa33f9ba86" />
<img width="453" height="714" alt="image" src="https://github.com/user-attachments/assets/8f28b65b-89e4-4258-b397-e82829a279d0" />
<img width="468" height="537" alt="image" src="https://github.com/user-attachments/assets/594e8ea7-c44f-4bae-8483-e250efbaafe4" />
<img width="650" height="872" alt="image" src="https://github.com/user-attachments/assets/4cac752c-c384-4569-b659-4343617ffa59" />
<img width="565" height="1041" alt="image" src="https://github.com/user-attachments/assets/d65280e1-b837-42d2-b3e6-bc98997c55e1" />
<img width="487" height="748" alt="image" src="https://github.com/user-attachments/assets/584bf618-abb2-4b5e-bd9f-7c65df4976ae" />
<img width="434" height="558" alt="image" src="https://github.com/user-attachments/assets/d20f03d6-bbdd-41d5-b224-081eba7929ba" />



## Project Status

**Completed — Java Vityarthi Project**
