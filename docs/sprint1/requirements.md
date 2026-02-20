# Sprint 1 – Requirements & Scope

## Introduction
The system to be developed is a Share Price Comparison web application.
It will allow users to retrieve historical share prices for companies,
store them locally, and visualise performance through charts.

---

## Functional Requirements

The system shall:

- Allow users to enter a share symbol.
- Allow users to select a start date and end date (maximum range of two years).
- Retrieve daily share price data from an external data source.
- Store retrieved data locally for offline use.
- Display a graph of share prices over time.
- Allow comparison between two companies.

---

## Non-Functional Requirements

The system should:

- Continue operating if the network is unavailable by using cached data.
- Be modular and maintainable.
- Provide accurate and consistent data.
- Be scalable for future extension.

---

## Scope of the Project

### In Scope
- Historical daily share prices.
- Date range up to two years.
- Comparison of up to two shares.
- Local data persistence.

### Out of Scope
- Real-time trading.
- User authentication.
- Portfolio management.
- Advanced or customised UI design.

- ---

## Data Considerations
- Share price data will be retrieved from an external provider.
- The system will support historical daily prices.
- Data should be cached locally to reduce repeated external calls.

---

## Constraints
- Maximum date range is limited to two years.
- Availability of data depends on the external provider.
- Sprint 1 will focus on architectural structure rather than full UI development.

---

## Alignment with Project Goals
The primary goal of the project is to design a system with a clear and scalable architecture.
The requirements support separation of concerns between data retrieval,
business logic, and presentation. This ensures the system can evolve in
future sprints without major restructuring.

