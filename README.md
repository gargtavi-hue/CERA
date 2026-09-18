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

```text
CERA
│
├── src
│   ├── Main.java
│   │
│   ├── model
│   ├── enums
│   ├── service
│   ├── exception
│   ├── interfacepackage
│   └── thread
│
├── README.md
└── statement.md
```

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

## Project Status

**Completed — Java Vityarthi Project**
