# Open closed principle

It simply states that classes, modules, functions, etc. should be **open for extension, closed for modification**. 

Why ? Because we do not want our existing code to be modified which may cause potential issues or bugs. Incase of some functionality change or adding new functionality is required, devs should be able to extend our class / override some methods to achieve the new change as per requirements.

*Also you can refer to [this](https://www.baeldung.com/java-liskov-substitution-principle) example on baeldung (explains open/closed principle in connection with liskov principle). So, in example given, `BankingAppWithdrawalService ` will not require multiple methods like `withdrawFromCurrentAccount`/`withdrawFromSavingsAccount` (and more such methods if more account types are added) but single `withdraw` method will accept type `WithdrawableAccount`*