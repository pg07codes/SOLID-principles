# Dependency Inversion principle

**DIP** states that High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend upon details. In other words, A class should depend on abstraction(interfaces and abstract classes) and not on concretion (classes).This principle reduces tight coupling in the system.

*[this baeldung post](https://www.baeldung.com/java-liskov-substitution-principle) explains open/closed princi. and liskovs princi. but will show you how DIP is connected with them. In the eg., we see that `BankingAppWithdrawalService ` should not depend on concrete account types but on abstract account*

> Note: Both practical and theoretical examples for this have very much "practical" usage. One should must refer to both of the example folders.

Also, here we need to clarify a common misconception and doubt a lot of beginners have.

**Inversion of Control Vs Dependency Injection Vs Dependency Inversion. Are they all same ?**

- **Inversion of Control** - This is the broadest concept of these 3. We can say, in a way it wraps over these other concepts. So, what is it? In traditional programming, the code that controls the execution of the program, *the main method*, is responsible to instantiate objects, calls methods achieve the goal. With IoC, it is a `framework` that does the instantiation, method calls and has full control of the flow removing this responsibility from the main method. One very important characteristic of a framework is that the methods defined by the user to tailor the framework will often be called from within the framework itself, rather than from the user’s application code. **This is the main differance between a Software Library and a Software Framework** which is again a very popular question in interview. i like to briefly state it as - *Library is something we call from our code to ease our life of doing repetetive things, whereas framework is something which calls our code.* 

- **Dependency Injection** - Dependency Injection means the creation and binding of dependencies are done outside of the dependent class. Afterwards, said dependencies are provided already instantiated and ready to be used, hence the term “injection”. **If you have used frameworks like spring, you already have used dependency injection (`Inject` and `Autowired`)**. This term coined by Martin Fowler is very similar to the IoC concept. Even he himself mentioned renaming IoC to dependecy injection as he thought that IoC is way generic. There was a disagreement though, between the guy who coined IoC and Martin Fowler, and he said something along the lines of - "Martin didnt understand IoC clearly enough and so wants to rename it"

- **Dependency Inversion** - **DIP** is what we are going to talk about here in SOLID principles. It has been already defined at the top.