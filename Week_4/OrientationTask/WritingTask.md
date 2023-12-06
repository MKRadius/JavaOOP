# Orientation Task 4 (Writing)

## 1.

**Question:** Using an example case (health centre, bank, etc.), discuss the meaning and characterisation of all the performance measures discussed in the lesson material using the concepts of the target system.

**Answer:**

Taking the example of a health centre, the performance measures are as follows:

1. **Patient Satisfaction**: Reflects the overall contentment of patients with provided healthcare services, encompassing communication, wait times, treatment outcomes, and overall experience, crucial for maintaining trust and loyalty.

2. **Wait Times**: Measure the efficiency of scheduling and resource allocation, directly impacting patient experience by indicating the speed and effectiveness of care delivery.

3. **Staff Productivit**y: Indicates the efficiency of healthcare professionals, assessing the number of patients attended to, diagnostic accuracy, and task completion speed, directly influencing patient outcomes.

4. **Resource Utilization**: Evaluates the effective use of medical equipment, facilities, and personnel, ensuring streamlined care delivery without unnecessary expenses or bottlenecks.

5. **Clinical Outcomes**: Reflects the success of treatments and interventions, measured by recovery rates, mortality rates, and disease management effectiveness, essential for assessing the quality of healthcare provided.

6. **Financial Performance**: Includes revenue, costs, profitability, and budget adherence, reflecting the health center's sustainability while ensuring quality care and future improvements.

7. **Compliance and Regulatory Measures**: Focuses on adherence to healthcare regulations and standards, ensuring patient confidentiality and overall compliance with industry norms and legal requirements for maintaining trust and legality.



## 2.

**Question:** Consider the categories in which performance measures are maintained/updated/computed. (Think in general terms: service point/customer; not in target system terms.)

**Answer:**

The categories in which performance measures are maintained/updated/computed are as follows:

1. **Operations**: Tracking efficiency, productivity, and resource use.

2. **Finance**: Assessing revenue, costs, profitability, and budget adherence.

3. **Customer**: Measuring satisfaction, feedback, and retention.

4. **Quality**: Ensuring adherence to standards and regulations.

5. **Strategy**: Evaluating progress toward long-term goals.

6. **Employees**: Monitoring satisfaction, turnover, and training effectiveness.



## 3.

**Question:** Design two different systems of three or four service points for a real-world destination. Use real-world concepts. Draw diagrams using the graphical representation of a service point shown in section ´Performance Variables´.

**Answer:**

```mermaid
flowchart LR
    nowhere1[ ] --> buffer1[(Order Counter)]

    buffer1 -.- servicepoint((Brewing Station))
    servicepoint --> nowhere2[ ]

    nowhere1(( )) --> buffer2[(Seating Area)]
    buffer2 -.- servicepoint2(( ))
    servicepoint2 --> nowhere2

```


```mermaid
flowchart LR
    nowhere1[ ] --> buffer1[(Front Desk)]

    buffer1 -.- servicepoint((Concierge Desk))
    servicepoint --> nowhere2[ ]

    nowhere1(( )) --> buffer2[(Room Service)]
    buffer2 -.- servicepoint2((Fitness Center))
    servicepoint2 --> nowhere2

```


## 4.

**Question:** Write an algorithm in Java or pseudocode for the main loop of the simulator:

The main loop does all the things required for a three-phase simulation (presented in a section https://github.com/jacquesbergelius/PP-CourseMaterial/blob/master/1.2_Three_Phase_Simulation.md#three-phase-simulation).

Think in general terms (don't think in detail) and present a general solution. No need for target system concepts.

**Answer:**

## 5.

**Question:** Using the names of the simulator classes, explain the simulator a) what A-phase coding means b) what coding B-events means c) what coding C events means.

You can also write Java or pseudo code.

Present a general solution. No need for the target system concepts.

**Answer:**

