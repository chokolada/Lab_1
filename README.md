# Lab_1
Create a class according to your variant from the list below. Using the Lombok library, implement set and get methods, constructors with arguments, a default constructor, and a overridden toString() method. The created class must contain a public static method getInstance() and a static field "instance", the value of which will be returned by the getInstance method. In the class, you should also write a main method, in which you need to create an array of class objects using:

a default constructor
a constructor that receives all parameters
2 objects obtained by calling the getInstance() method
Output the identifiers of all objects in the array to the console using a loop with a precondition.

Variant 19.

Create a Plate class that will have the following fields: diameter: plate diameter; material: the material from which the plate is made; color: plate color; isClean: flag indicating whether the plate is clean, default value is "false". hasFood: flag indicating whether there is food on the plate, defaulting to "false"

The Plate class has the following public methods: wash(): method that washes the plate and sets the isClean flag to true; dirty(): method that marks the plate as dirty (sets the isClean flag to "false"); eat(): A method that resets the hasFood flag and marks the plate as dirty addFood(): A method that sets the hasFood flag to true
