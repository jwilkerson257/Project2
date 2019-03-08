# Project2
1. Created the calAverage and letterAverage abstract methods in MesoAbstract.java
2. Created the constructor for MesooInherit.java and initialized global variables STID and average for the MesoInherit class
3. Initialized the calAverage and letterAverage methods in MesoInherit.java inherited from MesoAbstract.java 
4. Inside the calAverage method a double variable named sum was initialized and was used inside a for loop that casted each character of the StID values to its respective ASCII decimal value.
5. In the calAverage method, an integer array was initialized and named nodes with a length of 3
6. For the first index of nodes, the sum was divided by the length of the StID string length inside the method parameter of Math.ceil and casted into an integer in order to find the ceiling of the average of the ASCII values
7. For the second index of nodes, the sum was divided by the length of the StID string length inside the method parameter of Math.floor and casted into an integer in order to find the floor of the average of the ASCII values
8. For the second index of nodes, if and else statements were used in order find the correct average of the ASCII values because if the fraction part of the average is greater than or equal to .5, then it would take the ceiling of the average and if the fraction part of the average is less than .5, then it would take the floor of the average
