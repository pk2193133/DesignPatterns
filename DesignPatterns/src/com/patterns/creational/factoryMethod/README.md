-> this design pattern is used for creating objects and decoupling them from the 
   class where they are required 
-> in our case we are using ProductA and ProductB inside Creator and based on some 
   output given by Product we do something on top of that.
-> so the purpose of Creator class in not to instantiate any of the Product class,
   Creator class has its own responsibiity, in order to fulfill those responsibility
   it requires the Product object.