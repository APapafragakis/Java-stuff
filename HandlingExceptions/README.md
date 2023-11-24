# Koumparas Class

The `Koumparas` class models a container for holding money. It has a specified capacity, can be in a broken state, and allows adding money until it reaches its capacity. The class also provides functionality to check if it's broken, break it intentionally, and calculate the total value of the money it contains.

## Table of Contents

- [Attributes](#attributes)
- [Constructor](#constructor)
- [Methods](#methods)
- [Exceptions](#exceptions)
- [Usage](#usage)

## Attributes

- `capacity`: The maximum number of money that the Koumparas can hold.
- `flag`: A boolean flag indicating whether the Koumparas is in a broken state.
- `money`: An array holding the money added to the Koumparas.
- `index`: An index tracking the number of times money has been added.

## Constructor

### `public Koumparas(int capacity)`

- Initializes the Koumparas with the specified capacity.
- Parameters:
  - `capacity`: The capacity of the Koumparas (must be greater than 0).

## Methods

### `public void add(double money) throws KoumparasIsFullException, KoumparasIsBrokenException`

- Adds money to the Koumparas.
- Throws `KoumparasIsFullException` if the Koumparas is already full.
- Throws `KoumparasIsBrokenException` if the Koumparas is in a broken state.
- Parameters:
  - `money`: The amount of money to add.

### `public boolean Check()`

- Checks if the Koumparas is broken.
- Returns `true` if the Koumparas is broken, `false` otherwise.

### `public void Break() throws KoumparasIsBrokenException`

- Breaks the Koumparas intentionally.
- Throws `KoumparasIsBrokenException` if the Koumparas is already broken.

### `public double ValueK() throws KoumparasIsNotBrokenException`

- Returns the total value of the money in the Koumparas.
- Throws `KoumparasIsNotBrokenException` if the Koumparas is not in a broken state.

## Exceptions

- `KoumparasIsFullException`: Thrown when attempting to add money to a full Koumparas.
- `KoumparasIsBrokenException`: Thrown when attempting to perform an operation on a broken Koumparas.
- `KoumparasIsNotBrokenException`: Thrown when attempting to get the value of a Koumparas that is not in a broken state.

## Usage

1. Create an instance of the `Koumparas` class, specifying the capacity.
2. Use the `add` method to add money to the Koumparas.
3. Use the `Check` method to check if the Koumparas is broken.
4. Use the `Break` method to intentionally break the Koumparas.
5. Use the `ValueK` method to get the total value of the money in the Koumparas.

