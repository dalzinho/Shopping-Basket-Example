# Shopping-Basket-Example
Java Exercise to show OO programming following SOLID principles

## Spec

You have been asked to model a shopping basket.  

You must be able to:
* add items to the shopping basket,
* remove items from the shopping basket,
* empty the shopping basket.

Additionally, you must be able to calculate the total value of the shopping basket. This should account for:
* buy-one-get-one-free discounts on items,
* 10% off on totals greater than £20 (after previous discount is applied),
* 2% off on total for customers with loyalty cards (after all other discounts are applied).  

You must be able to validate that the code works through passing tests.

What we will be looking for:  
Evidence of 'solid' coding techniques and test driven development.

## Some comments on SOLID

### Single Use

* `Customer` is in charge of having a loyalty card.
* `Basket` holds items and send out information concerning its contents.
* `Item` holds information about items.
* `Calculator` uses information pulled from three other classes to apply discounts and calculate total price.

### Open-Closed

* New instances of `Item` can be processed without the need to modify any existing code.

### Liskov Substitution / Interface Segregation

* No evidence of either as there is no inheritance/interfaces. A more complex example may have several varieties of `Item` subclass or interfaced items which could require these. 

### Dependency Inversion

* All objects instantiated in run-time; `Customer` is passed a basket at point of instantiation; likewise `Calculator` is passed a basket at point of calculation. All items are generated at run-time.




