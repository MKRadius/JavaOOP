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
