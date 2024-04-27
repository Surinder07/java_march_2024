## OOP Assignment 

## Inheritance 
   Create a Java program to model different types of vehicles. Define a superclass called [Vehicle], which has the following attributes and methods:
Attributes: [make, model, year] Methods: [start(), stop(), displayInfo()]
Next, create two subclasses Car and Motorcycle that inherit from the Vehicle class. Each subclass should have an additional attribute specific to its type ([numDoors] for Car and [numCylinders] for Motorcycle), 
along with any necessary methods.
Then, create a subclass [ElectricCar] that inherits from the Car class. ElectricCar should have an additional attribute [batteryCapacity] and a method [chargeBattery()].
Finally, write a Main class to demonstrate the functionality of these classes by [creating objects of Car, Motorcycle, and ElectricCar and calling their methods.]

## Polymorphism
You are developing a simple payroll system for a company. The company has different types of employees, including full-time employees and part-time employees. Each employee is paid based on their specific type, and the calculation may vary depending on whether the employee is full-time or part-time.
Implement polymorphism to handle the calculation of pay for different types of employees. Define a superclass called Employee with common attributes such as employee ID and name, and a method calculatePay() to calculate the pay for an employee. Then, create two subclasses FullTimeEmployee and PartTimeEmployee that inherit from the Employee class. Each subclass should override the calculatePay() method to provide the specific pay calculation for full-time and part-time employees, respectively.

Your solution should include:
A Employee class with attributes for employee ID and name, and a method calculatePay() 
to calculate the pay for an employee. A FullTimeEmployee class that inherits from the Employee class and 
overrides the calculatePay() method to calculate the pay for a full-time employee.
A PartTimeEmployee class that inherits from the Employee class and overrides the calculatePay() 
method to calculate the pay for a part-time employee. A Main class to demonstrate the functionality 
of these classes by creating objects of FullTimeEmployee and PartTimeEmployee and calling their calculatePay() 
methods.