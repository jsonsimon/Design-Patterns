# Assignment: Payment Processing System

## Objective
Build a checkout system that can process payments using different payment methods (Credit Card, PayPal, Cryptocurrency). The payment method should be interchangeable at runtime, and the checkout process should work the same way regardless of which payment method is used.

## Requirements
Your system must allow switching between different payment strategies without changing the checkout code. Each payment method has its own processing logic, validation rules, and transaction flow.

## What it should accomplish

1. **Support three payment strategies**: Credit Card, PayPal, and Cryptocurrency (Bitcoin). Each has different processing behavior and validation requirements.

2. **Define payment strategy behavior**: Each payment strategy should implement:
   - `validate()` - Validates the payment method details (returns boolean)
   - `processPayment(double amount)` - Processes the payment and returns a transaction ID
   - `getPaymentMethodName()` - Returns the name of the payment method

3. **Payment-specific processing details**:
   - **Credit Card**: 
     - Validation: Check that card number is 16 digits, CVV is 3 digits, expiry date is in the future
     - Processing: Output `[Credit Card] Contacting bank... Authorizing $XX.XX... Transaction approved | Transaction ID: CC-XXXXX`
   - **PayPal**: 
     - Validation: Check that email contains "@" and password is at least 8 characters
     - Processing: Output `[PayPal] Logging into PayPal account... Transferring $XX.XX... Payment complete | Transaction ID: PP-XXXXX`
   - **Cryptocurrency (Bitcoin)**: 
     - Validation: Check that wallet address is 26-35 characters long
     - Processing: Output `[Bitcoin] Broadcasting to blockchain... Confirming transaction $XX.XX... XX confirmations received | Transaction ID: BTC-XXXXX`

4. **Create a checkout context**: Build a `ShoppingCart` or `Checkout` class that:
   - Holds a reference to a payment strategy
   - Allows changing the payment strategy at runtime
   - Has a `pay(double amount)` method that delegates to the current strategy

5. **Demonstrate runtime strategy switching**: Write client code that:
   - Creates a checkout/cart
   - Tries to pay with one method
   - Switches to a different payment method mid-session
   - Shows that the same cart can use any payment strategy interchangeably

## Success Criteria
- All payment methods implement a common interface
- The checkout/cart class doesn't contain payment-specific logic
- Payment strategies can be swapped at runtime
- Each payment method has distinct validation and processing behavior
- Client code works with the strategy interface, not concrete payment classes

## Challenge Extension (Optional)
Add a `refund()` method to the payment strategy, where each payment method handles refunds differently (e.g., credit cards take 3-5 days, PayPal is instant, cryptocurrency requires gas fees).
