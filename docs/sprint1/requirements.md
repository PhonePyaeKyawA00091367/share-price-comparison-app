# Sprint 1 – Requirements 


The system to be developed is a Share Price Comparison web application.

The main user of the system is someone who wants to analyse and compare share price trends.


## Functional Requirements

The system shall:

- System fetches daily share price data
- User can specify a date range (max 2 years)
- System displays share price as a chart
- User can compare two companies on one chart
- System stores data locally
- System works offline using cached data


## Non-Functional Requirements

The system should:

- Data loads within 3 seconds
- System handles errors gracefully
- Architecture is modular and scalable
- App runs on any JVM platform


## Scope
### In Scope
- Fetching daily share price data from Yahoo Finance
- Displaying share prices as line charts
- Comparing two companies side by side
- Local data storage for offline use

### Out of Scope
- Real-time live share price streaming
- User accounts or authentication
- Financial advice or trading features
- Comparing more than two companies at once

The primary goal of the project is to design a system with a clear, modular, and scalable architecture.

The requirements support separation of concerns between data retrieval, business logic, and presentation layers. Interfaces are used to decouple components, ensuring flexibility and maintainability.

This approach allows the system to evolve in future sprints without major restructuring.
