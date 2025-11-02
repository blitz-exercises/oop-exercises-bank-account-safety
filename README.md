# Bank Account Safety Exercise

## Story

Blitz Community Bank keeps getting support calls: customers accidentally deposit negative amounts, typo a giant withdrawal, or overdraw their accounts. The bank wants a tiny, reliable component that always validates amounts and never exposes the balance directly.

You're hired to build a safe BankAccount system that prevents errors and keeps data consistent.

## Requirements

- `BankAccount` has private fields for account holder and balance.
- Constructor validates input.
- `deposit` and `withdraw` only allow valid amounts.
- `printSummary()` formats output for printing.
- `Demo` class tests the logic by creating accounts and performing actions.

## Implementation Tasks

### BankAccount.java

Implement the following:

1. **Fields**: Make `holder` and `balance` private (consider making `holder` `final` since it shouldn't change).

2. **Constructor**:
   - Validate `holder` is non-null and non-blank
   - Validate `initialBalance` is >= 0
   - Throw `IllegalArgumentException` if validation fails
   - Otherwise, assign values to fields

3. **Getters**:
   - `getHolder()`: Return the account holder name
   - `getBalance()`: Return the current balance

4. **deposit(double amount)**:
   - Validate `amount > 0`
   - Throw `IllegalArgumentException` if invalid
   - Add `amount` to `balance`

5. **withdraw(double amount)**:
   - Validate `amount > 0` and `amount <= balance`
   - Throw `IllegalArgumentException` if invalid
   - Subtract `amount` from `balance`

6. **printSummary()**:
   - Return a formatted string: `"Account: {holder} | Balance: {balance}"`

### Demo.java

Implement the `main` method to:

- Create at least three valid `BankAccount` objects with different initial balances
- Perform deposits and withdrawals on these accounts
- Print summaries using `printSummary()`
- Optionally calculate total balance using `getBalance()`

## Validation Rules Summary

- **holder**: non-null, non-blank
- **initialBalance**: >= 0
- **deposit(amount)**: amount > 0
- **withdraw(amount)**: amount > 0 and amount <= balance
- **Fields**: private (no public setters)

## Learning Objectives

- Encapsulation: Private fields with controlled access
- Input validation: Prevent invalid operations
- Exception handling: Use `IllegalArgumentException` for invalid inputs
- Immutability: Consider making `holder` final
- Clean code: Single responsibility methods with clear validation

## Project Structure

```
src/main/java/nl/blitz/oop/bank/
├── BankAccount.java
└── Demo.java
```

## Building and Running

### Build the Project

```bash
# Compile the project
mvn clean compile
```

### Running the Application

You can run the application in two ways:

**Option 1: Using IntelliJ IDEA** (Recommended for beginners)

1. Open the project in IntelliJ IDEA
2. Navigate to the `Demo.java` file: `src/main/java/nl/blitz/oop/bank/Demo.java`
3. Right-click on the file or the `main` method
4. Select "Run 'Demo.main()'" from the context menu
5. Alternatively, click the green play button (▶) next to the `main` method

**Option 2: Using Maven Command Line**

```bash
mvn exec:java -Dexec.mainClass="nl.blitz.oop.bank.Demo"
```

