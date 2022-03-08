# Single Responsibility Principle

Every class should have one and only one responsibility, so that we have only one reason to maintain/change/update that class. It is quite self explanatory. It doesn't mean your class cant have multiple methods but all the methods should act towards the same goal.

One rule of thumb is to try to describe what the class is responsible for in minimum words and if you ended up using `and` , then it means class should be split up.