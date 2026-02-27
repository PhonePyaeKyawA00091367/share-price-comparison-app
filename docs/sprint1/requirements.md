# Sprint 1 – Requirements & Scope

## Introduction

The system to be developed is a Share Price Comparison web application.

The purpose of the system is to allow users to retrieve historical share prices for selected companies, store the data locally, and visualise performance using charts.

The primary actor of the system is a user who wants to analyse and compare historical share price trends.

---

## Functional Requirements

The system shall:

- Allow users to enter a valid share symbol (e.g., AAPL, GOOGL).
- Allow users to select a start date and end date (maximum range of two years).
- Retrieve historical daily closing price data from an external data provider.
- Store retrieved data locally for offline use.
- Display a graph of share prices over time.
- Allow comparison between two companies within the same date range.

---

## Non-Functional Requirements

The system should:

- Continue operating if the network is unavailable by using cached data.
- Be modular and maintainable through separation of concerns.
- Ensure consistency of retrieved data.
- Be scalable for future extension.

---

## Scope of the Project

### In Scope

- Historical daily closing share prices.
- Date range up to a maximum of two years.
- Comparison of up to two shares.
- Local data persistence using JSON storage.

### Out of Scope

- Real-time trading.
- User authentication and account management.
- Portfolio management features.
- Advanced or customised UI design.
- Live stock market streaming.

---

## Data Considerations

- Share price data will be retrieved from an external provider.
- The system will support historical daily closing prices only.
- Data will be cached locally to reduce repeated external calls.

---

## Constraints

- Maximum date range is limited to two years.
- Availability of data depends on the external provider.
- Sprint 1 focuses mainly on architectural structure rather than full UI development.

---

## Alignment with Project Goals

The primary goal of the project is to design a system with a clear, modular, and scalable architecture.

The requirements support separation of concerns between data retrieval, business logic, and presentation layers. Interfaces are used to decouple components, ensuring flexibility and maintainability.

This approach allows the system to evolve in future sprints without major restructuring.
