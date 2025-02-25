# SoftEng2_LabAssignment2_StateDesignPattern
## Problem
A vending machine needs to manage different states, including "Idle", "ItemSelected", "Dispensing", and "OutOfOrder". Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like item inventory and balance.  

**REQUIREMENTS**

Idle State:   
- Allow item selection. 
- Disallow dispensing items and inserting coins.  

ItemSelected State:
- Allow inserting coins and dispensing items.
- Disallow item selection.  

Dispensing State:
- Allow no operations.
- Automatically transition back to the "Idle" state after dispensing is complete.  

OutOfOrder State:
- Disallow all operations.

**Current System:** The system currently relies on conditional statements within the VendingMachine class to check the machine state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.

## Class Diagram
![UML Class Diagram](LabAssignment2-StateDesign.png)
