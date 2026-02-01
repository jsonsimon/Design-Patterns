# Assignment: Coffee Shop Beverage System

## Objective
Build a coffee shop ordering system where you can add various condiments and extras to beverages. The cost and description should automatically adjust based on what's been added. You should be able to add multiple decorators to the same beverage and easily calculate the total cost.

## Requirements
Your system must use the Decorator pattern to dynamically add responsibilities to beverage objects. Each decorator wraps a beverage and adds its own cost and description without modifying the original beverage class.

## What it should accomplish

1. **Create base beverage types**: Implement at least three core beverages:
   - **Espresso**: Base cost $1.99, description "Espresso"
   - **HouseBlend**: Base cost $0.89, description "House Blend Coffee"
   - **DarkRoast**: Base cost $0.99, description "Dark Roast Coffee"

2. **Implement beverage decorators**: Create at least four condiment decorators that can be added to any beverage:
   - **Milk**: Adds $0.10 to cost
   - **Mocha**: Adds $0.20 to cost
   - **Soy**: Adds $0.15 to cost
   - **Whip** (whipped cream): Adds $0.10 to cost

3. **Define component interface**: All beverages (base and decorated) should implement a common interface with:
   - `getDescription()` - Returns the description of the beverage with all add-ons
   - `getCost()` - Returns the total cost with all add-ons

4. **Demonstrate decorator stacking**: Show that decorators can be stacked multiple times on the same beverage. For example:
   - A DarkRoast with Mocha and Mocha and Whip should cost: $0.99 + $0.20 + $0.20 + $0.10 = $1.49
   - Description should be: "Dark Roast Coffee, Mocha, Mocha, Whip"

5. **Build complex beverages**: Create at least three different beverage orders that demonstrate:
   - A simple beverage with one decorator
   - A beverage with multiple different decorators
   - A beverage with the same decorator added multiple times (e.g., double mocha)

6. **Display order details**: For each beverage created, output its complete description and final cost. Example:
   ```
   Order 1: Espresso, Mocha, Whip
   Cost: $2.29
   
   Order 2: House Blend Coffee, Soy, Soy, Mocha
   Cost: $1.34
   ```

## Success Criteria
- Base beverages and decorators implement the same interface
- Decorators wrap other beverage components (including other decorators)
- Cost and description are calculated correctly regardless of how many decorators are stacked
- You can add the same decorator multiple times to one beverage
- New decorators can be added without modifying existing beverage or decorator classes
- Client code treats decorated and undecorated beverages identically

## Challenge Extension (Optional)
Add size options (Small, Medium, Large) that affect the base cost differently for each beverage. The challenge is deciding whether size should be a decorator or handled differently, and justifying your choice.
