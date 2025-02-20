# Structural-Design-Patterns
This repository contains examples of structural design patterns in Java.

Structural design patterns are design patterns that ease the design by identifying a simple way to realize relationships between entities. They help in creating flexible and reusable object-oriented software by establishing relationships between objects and classes. Here are some important structural design patterns


## Patterns Included
* Adapter: Converts one interface to another.
* Bridge: Separates abstraction from implementation.
* Composite: Treats objects and compositions uniformly.
* Decorator: Adds behavior to objects.
* Facade: Simplifies interfaces.
* Proxy: Controls access to objects.

## How to Run
Each pattern has its own `Main.java` file. You can run each example by navigating to the respective directory and executing the `Main` class.

### Example
To run the Flyweight pattern example:
1. Open a terminal.
2. Navigate to the `Flyweight` directory:
    ```sh
    cd Flyweight
    ```
3. Compile the `Main.java` file:
    ```sh
    javac Main.java
    ```
4. Run the compiled `Main` class:
    ```sh
    java Main
    ```

Repeat the above steps for other patterns by replacing `Flyweight` with the respective pattern name.

## Pattern Details

### Adapter Pattern
**Description**: Allows incompatible interfaces to work together by acting as a bridge between them.

**Real-time Example**: A card reader acts as an adapter between a memory card and a laptop. The card reader converts the memory card interface to a USB interface that the laptop can understand.

### Bridge Pattern
**Description**: Separates an object’s abstraction from its implementation so that the two can vary independently.

**Real-time Example**: A remote control (abstraction) can work with different devices like TV, DVD player, etc. (implementations). The remote control interface remains the same, but the underlying device can change.

### Composite Pattern
**Description**: Composes objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

**Real-time Example**: A company’s organizational structure where an employee can be a manager (composite) or a regular employee (leaf). Both can be treated uniformly when performing operations like calculating total salaries.

### Decorator Pattern
**Description**: Adds additional responsibilities to an object dynamically. It provides a flexible alternative to subclassing for extending functionality.

**Real-time Example**: A coffee shop where you can add different condiments (like milk, sugar, etc.) to a coffee. Each condiment adds additional functionality (cost, description) to the base coffee object.

### Facade Pattern
**Description**: Provides a simplified interface to a complex subsystem. It defines a higher-level interface that makes the subsystem easier to use.

**Real-time Example**: A hotel booking system where a single interface (facade) provides methods to book a room, order food, and arrange transportation, hiding the complexity of the underlying subsystems.

### Proxy Pattern
**Description**: Provides a surrogate or placeholder for another object to control access to it. It can be used for lazy initialization, access control, logging, etc.

**Real-time Example**: A virtual proxy for a large image object. The proxy loads a placeholder image initially and only loads the actual image when it is needed, saving memory and improving performance.