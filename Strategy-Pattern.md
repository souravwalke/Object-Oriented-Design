**Strategy Design Pattern**

Strategy Pattern is a type of behavioral pattern.

**Summary**

- Identify behaviors that change frequently and separate them from the main class.
- Define an interface to provide a standard method that all concrete behavior classes must implement.
- Implement multiple concrete behaviors to provide different variations.
- Main class uses composition (rather than inheritance) to reference a behavior dynamically.

**Advantages**

- Enables code reusability by allowing new behaviors to be added without modifying the existing system.
- Local changes are isolated, as modifying one behavior does not impact others.
- The behavior can be changed at runtime without altering the object’s class.

