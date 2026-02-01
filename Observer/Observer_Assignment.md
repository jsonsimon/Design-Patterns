# Assignment: Weather Monitoring Station

## Objective
Build a weather monitoring system where multiple displays automatically update whenever weather data changes. When the weather station receives new measurements, all registered displays should be notified and update themselves without the weather station knowing anything about the specific display types.

## Requirements
Your system must implement the Observer pattern so that displays can subscribe to weather updates and automatically receive notifications when conditions change. The weather station (subject) should not have any dependencies on specific display types.

## What it should accomplish

1. **Create a weather data subject**: Build a `WeatherStation` class that:
   - Stores current weather conditions (temperature, humidity, pressure)
   - Allows observers to register/subscribe for updates
   - Allows observers to unregister/unsubscribe
   - Notifies all registered observers when weather data changes

2. **Support three types of observer displays**: Each display type shows different information and formats it differently:
   - **Current Conditions Display**: Shows current temperature, humidity, and pressure. Example: `[Current Conditions] Temperature: 75.2°F | Humidity: 65% | Pressure: 30.4 inHg`
   - **Statistics Display**: Tracks and shows average, min, and max temperature over time. Example: `[Statistics] Avg Temp: 73.1°F | Min Temp: 68.0°F | Max Temp: 78.5°F`
   - **Forecast Display**: Predicts weather based on pressure trends (rising/falling). Example: `[Forecast] Pressure rising - Improving weather on the way!`

3. **Implement proper observer interface**: All displays should implement a common `Observer` interface with an `update()` method that gets called when weather data changes.

4. **Demonstrate dynamic subscription**: Write client code that:
   - Creates a weather station
   - Registers multiple displays
   - Updates weather data several times and shows all displays updating automatically
   - Unregisters one display mid-execution
   - Updates weather data again and shows that the unregistered display no longer updates

5. **Push vs Pull consideration**: Decide whether to use:
   - **Push**: Weather station sends all data to observers in the update notification
   - **Pull**: Weather station just notifies observers, and observers pull the data they need
   
   Document which approach you chose and why.

## Success Criteria
- Multiple displays can subscribe to the weather station
- All subscribed displays automatically update when weather data changes
- Displays can be added or removed at runtime
- The weather station has no knowledge of specific display types
- Each display formats and presents data in its own way
- Unsubscribed displays stop receiving updates

## Challenge Extension (Optional)
Add a heat index display that needs both temperature and humidity data. This display should only show warnings when the heat index exceeds a dangerous threshold, demonstrating that observers can have conditional update logic.
