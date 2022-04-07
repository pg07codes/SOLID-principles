# Interface Segregation principle

Simply put, segregate your interfaces.

Or in more words, multiple client-specific interfaces are better than one general-purpose interface. The idea is to split the ‘huge’ interface to "small" interfaces until client of the interface will only know and consume the methods(functionality) that is useful/relevant to them.

No one should be required to implement methods in their classes which they will not use. Larger interfaces should be split into smaller ones for this reason. It ensures that implementing classes only need to be concerned about the methods that are useful to them which provides flexibility and easy maintenance.

Refer to the examples for more clarity. (especially the one in practical folder about android and desktop component)
