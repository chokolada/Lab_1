# Lab_1
Variant 19.

Create a Plate class that will have the following fields:
diameter: plate diameter;
material: the material from which the plate is made;
color: plate color;
isClean: flag indicating whether the plate is clean, default value is "false".
hasFood: flag indicating whether there is food on the plate, defaulting to "false"

The Plate class has the following public methods:
wash(): method that washes the plate and sets the isClean flag to true;
dirty(): method that marks the plate as dirty (sets the isClean flag to "false");
eat(): A method that resets the hasFood flag and marks the plate as dirty
addFood(): A method that sets the hasFood flag to true