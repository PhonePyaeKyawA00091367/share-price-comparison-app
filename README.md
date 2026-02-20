# share-price-comparison-app

Software Architecture and Design coursework project – Share Price Comparison Web Application using Java.

## Sprint 1 – Implementation Structure

This sprint focuses on setting up the initial project structure.

### Implemented:
- Created model package
- Created Price model class
- Created repository package
- Created PriceRepository interface
- Organized layered structure (model, repository)

### Branch:
feature/implementation-structure
Software Architecture and Design coursework project - Share Price Comparison Web Application using Java.


## Service Layer

The Service Layer contains the core business logic of the application.

Responsibilities:
- Compare share prices between companies
- Calculate average share price
- Filter shares based on user input
- Coordinate between Controller and Repository layers

This layer ensures separation of concerns and keeps business logic independent from the user interface.

## Project Management

This project follows an Agile sprint-based approach.

Sprint 1 includes:
- Functional requirements definition
- Architectural design (MVC)
- Implementation structure planning
- Documentation setup

GitHub is used for:
- Version control
- Branch management
- Pull requests
- Issue tracking
## Architectural Design

The Share Price Comparison Web Application follows the MVC (Model-View-Controller) architectural pattern.

### Model Layer
Represents core business entities such as Share, Company, and Price.

### View Layer
Responsible for displaying share price data and comparison results to users.

### Controller Layer
Handles HTTP requests and coordinates between the View and Service layers.

### Service Layer
Contains business logic such as:
- Price comparison
- Average price calculation
- Filtering shares

### Repository Layer
Manages database interaction and data persistence.

### Architecture Flow
User → Controller → Service → Repository → Database  
Controller → View
