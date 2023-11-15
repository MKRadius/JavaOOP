# Orientation Task 2 (Writing)

## 1. Event Generation

### a) Generation of Arrival Events in Simulation

**Question:** Why does an arrival event need to generate a new arrival event?

**Answer:**

An arrival event needs to generate a new arrival event to simulate the continuous flow of entities, such as customers or data packets, in a system. This is crucial in systems where the arrival of entities is a continuous process, like in a supermarket or a network router. By generating a new arrival event each time an arrival event is processed, the simulation can accurately model this continuous flow.

### b) Event Generation at the Start of Service

**Question:** Why does an event need to be generated at the start of service?

**Answer:**

The start of the service should typically generate a "service completion" event. This event signifies the end of the service for the current entity. Once the service is started for an entity, it is understood that after a certain amount of time, the service will be completed. This "service completion" event can then trigger other events, such as the start of service for the next entity in queue.


## 4. Telephone Call Centre Simulation

**Question:** Continue with the three-phase simulation example (section Telephone call centre example: hand simulation) until one client of client type Y exits the system.

**Answer:**

**Call Centre Simulation: Clock 16 (Event B4, B3)**

| Phase | Router Queue | Router | Oper 1 queue | Oper 1 | Oper 2 queue | Oper 2 |
|-------|--------------|--------|--------------|--------|--------------|--------|
| B     | Empty        | Idle   | X3           | Idle   | Empty        | Y1     |
| C     | Empty        | Idle   | Empty        | X3     | Empty        | Y1     |

Event List:

| Event | Time |
|-------|------|
| B5    | 18   |
| B2    | 20   |
| B1    | 20   |
| B4    | 20   |

Results:

| Work<br>complete |   |
|------------------|---|
| X                | 2 |
| Y                | 0 |


**Call Centre Simulation: Clock 18 (Event B5)**

| Phase | Router Queue | Router | Oper 1 queue | Oper 1 | Oper 2 queue | Oper 2 |
|-------|--------------|--------|--------------|--------|--------------|--------|
| B     | Empty        | Idle   | Empty        | X3     | Empty        | Idle   |
| C     | Empty        | Idle   | Empty        | X3     | Empty        | Idle   |

Event List:

| Event | Time |
|-------|------|
| B2    | 20   |
| B1    | 20   |
| B4    | 20   |

Results:

| Work<br>complete |   |
|------------------|---|
| X                | 2 |
| Y                | 1 |