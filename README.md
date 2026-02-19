# share-price-comparison-app
Software Architecture and Design coursework project - Share Price Comparison Web Application using Java.


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
