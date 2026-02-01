# Assignment: Application Configuration Manager

## Objective
Build a configuration manager for an application that ensures only one instance of the configuration exists throughout the entire program's lifetime. Multiple parts of your application need to access the same configuration settings, and those settings must remain consistent across all access points.

## Requirements
Your configuration manager must guarantee that only one instance exists, no matter how many times different parts of your code try to create or access it. The configuration should be globally accessible but centrally controlled.

## What it should accomplish

1. **Single instance guarantee**: No matter how many times you try to get the configuration manager, you always get the exact same instance. Creating multiple instances should be impossible through normal usage.

2. **Store configuration data**: The manager should store at least these settings:
   - Application name (String)
   - Version number (String)
   - Maximum number of concurrent users (int)
   - Debug mode enabled/disabled (boolean)
   - Database connection string (String)

3. **Provide getters and setters**: Allow reading and modifying configuration values through appropriate methods.

4. **Thread-safe access**: Your singleton should work correctly even if multiple threads try to access it simultaneously. (Research thread-safe singleton implementation approaches)

5. **Demonstrate single instance behavior**: Write a main method that:
   - Gets the configuration instance from multiple different places in your code
   - Modifies a setting through one reference
   - Proves that all other references see the same modification
   - Attempts to prove there's only one instance (hint: compare object references or hash codes)

## Success Criteria
- Only one configuration instance exists during the program's execution
- Changes made through one reference are visible through all other references
- The instance is accessible from anywhere in your code
- Your implementation is thread-safe
- You can demonstrate that multiple "get instance" calls return the same object

## Challenge Extension (Optional)
Make your singleton lazy-initialized (only created when first needed) while maintaining thread safety. Research the trade-offs between different lazy initialization approaches.
