package com.nbicocchi.exercises.inheritance.payment;

/**
 * ### **Exercise: Implementing an Interface for a Payment System**
 *
 * Create a Java program that defines an interface and implements it in multiple payment classes.
 *
 * #### **Steps:**
 *
 * 1. **Create an interface named `Payment`** with the following methods:
 *    - `void processPayment(double amount);`
 *
 * 2. **Create two classes, `CreditCardPayment` and `PayPalPayment`, that implement the `Payment` interface.**
 *    - `CreditCardPayment` should have an instance variable `cardNumber`.
 *    - `PayPalPayment` should have an instance variable `email`.
 *
 * 3. **Implement the `processPayment(double amount)` method in both classes.**
 *    - `CreditCardPayment` should print:
 *      ```
 *      Processing credit card payment of $amount from card: [cardNumber]
 *      ```
 *    - `PayPalPayment` should print:
 *      ```
 *      Processing PayPal payment of $amount from email: [email]
 *      ```
 *
 * 4. **In the `main` method:**
 *    - Create instances of `CreditCardPayment` and `PayPalPayment`.
 *    - Call `processPayment()` on both objects with some example amounts.
 *
 * Would you like me to provide a sample implementation? 🚀
 */
public class App {
}
