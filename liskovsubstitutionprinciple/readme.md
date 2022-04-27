# Liskovs substition principle

“Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.”

In simple words, if class B is extending class A, we should be able to replace A with B(for eg. in method `execute` shown below), without causing any bugs in the program.

```java
class A{

}

class B extends A{

}

// somewhere, we have this method
public void execute(A objectA){
    A.doSomething();
    // So, in simple words, LSP says
    // objectA can hold reference of type A or a reference to its child B, `execute` should behave same.
}

```

**is A** relationship is a good estimate to find if inheritance is applicable or not, but Liskov principle mandates to use this with a careful consideration. We should only use inheritance if our super class is replaceable (has similar behaviour) with a sub class in all the instances. Ostrich "is A" Bird mistake is shown in the theoretical example and a popular famous example of Square "is A" rectangle is demonstrated in practical example. 

*another mistake is shown using example in [this baeldung post](https://www.baeldung.com/java-liskov-substitution-principle) where each account is treated as if we can withdraw from it(proving that inheritance should happen not only based on `is-a` relationship but only when both parent and child has same behaviours)*

Refer to this [stack overflow thread](https://stackoverflow.com/questions/56860/what-is-an-example-of-the-liskov-substitution-principle) to understand more.

**PS:** A variable of parent type can hold reference to object of its type and its subclasses' types, but reverse is not true as demonstrated below.

```java
class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

class Proof
{
    public static void main(String[] args)
    {
        Animal a = new Animal();
        Dog d = new Dog();

        Animal a2 = d; // OK, since Dog "IS-A" Animal
        Dog d2 = a; // not OK as what if animal2 is a Cat?
    }

    // also we can understand it this way --
    // what if i called bark() method on object of type animal(d2)
    // it would give exception as bark() would be defined only for dog
    // and a2 might be a cat also (with bark() not defined).
}
```
