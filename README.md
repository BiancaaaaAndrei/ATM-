# ATM System

A simple ATM system that allows customers to withdraw a specified amount of money. It uses a set of predefined bills with different values and quantities.

## Overview

The system consists of three main classes:

1. **ATM:** The main class that manages the ATM system. It has methods to initialize the ATM with a set of bills, withdraw a specified amount, and retrieve the quantity of bills for a specific value.

2. **Bill:** A class representing a bill with a specific value and quantity. It is used by the ATM class to keep track of the available bills.

3. **ATMTest:** A JUnit test class that demonstrates the usage of the ATM class by initializing an ATM object and making a withdrawal of a specified amount.

## How to Use

The ATM system:

1. Created an instance of the `ATM` class, which initializes the ATM with a set of predefined bills.

2. Used the `withdrawValue` method to simulate a customer withdrawing a specific amount. The method will print the bills taken and the remaining values in the ATM.

3. Used the `getBillQuantity` method to retrieve the quantity of bills for a specific value.
