# Assignment: Cross-Platform Notification and Logging System

## Objective
Build a system that sends notifications and logs events across three different platforms (Windows, macOS, Linux). Each platform has its own way of handling notifications, log file formats, and system alerts. Your system should be able to target any platform without the client code knowing or caring which one it is.

## Requirements
The client code must remain completely untouched when switching between platforms. Each platform is a family of related components that must work together consistently. The differences between platforms are structural and behavioral, not just cosmetic.

## What it should accomplish

1. **Support three platform families**: Windows, macOS, and Linux. Each platform family must provide its own implementations of all component types below.

2. **Include at least three component types with the following platform-specific formats**:

    ### Notifier
    - **Windows**: Toast notification format. Output should include a title, body, and an expiration time in seconds. Example: `[TOAST] Title: "Server Down" | Body: "DB connection lost" | Expires in: 5s`
    - **macOS**: Notification Center format. Output should include a title, subtitle, and body. Example: `[NOTIFICATION CENTER] Title: "Server Down" | Subtitle: "Production" | Body: "DB connection lost"`
    - **Linux**: Desktop Notification Daemon format (based on libnotify). Output should include a title, body, and an urgency level (LOW, NORMAL, CRITICAL). Example: `[LIBNOTIFY] Urgency: CRITICAL | Title: "Server Down" | Body: "DB connection lost"`

    ### Logger
    - **Windows**: Event Log format. Each entry includes a timestamp in `MM/dd/yyyy HH:mm:ss` format, an event ID (numeric), a source name, and the log message. Example: `[EVENT LOG] 01/31/2026 14:32:10 | EventID: 4012 | Source: MyApp | Message: "User logged in"`
    - **macOS**: Unified Log format. Each entry includes a timestamp in `yyyy-MM-dd HH:mm:ss.SSS` format, a subsystem (reverse domain notation), a category, and the log message. Example: `[UNIFIED LOG] 2026-01-31 14:32:10.443 | Subsystem: com.myapp.auth | Category: Login | Message: "User logged in"`
    - **Linux**: Syslog format (RFC 5424). Each entry includes a priority level, a timestamp in `MMM dd HH:mm:ss` format, a hostname, an app name, a process ID, and the log message. Example: `[SYSLOG] <134> Jan 31 14:32:10 myhost MyApp[2048]: "User logged in"`

    ### AlertHandler
    - **Windows**: Windows Event Log alert. Output should include a severity (Warning, Error, Critical), an event ID, and a message. Critical alerts should additionally output a line indicating that an incident ticket was auto-generated. Example: `[WINDOWS ALERT] Severity: Critical | EventID: 5001 | Message: "Disk full" | Auto-generated incident ticket: INC-00291`
    - **macOS**: macOS unified log alert. Output should include a severity, a subsystem, and a message. Critical alerts should additionally output a line indicating that a notification was pushed to the admin's Apple Watch. Example: `[MACOS ALERT] Severity: Critical | Subsystem: com.myapp.system | Message: "Disk full" | Apple Watch notification sent to: admin@company.com`
    - **Linux**: Syslog alert with systemd journal integration. Output should include a priority, a unit name, and a message. Critical alerts should additionally output a line indicating that a page was sent via PagerDuty. Example: `[LINUX ALERT] Priority: EMERG | Unit: myapp.service | Message: "Disk full" | PagerDuty page sent to: on-call-team`

3. **Enforce family consistency**: A Windows Notifier must only work alongside a Windows Logger and a Windows AlertHandler. Your design must make it impossible (or at least structurally discouraged) to mix components from different platform families.

4. **Process a sequence of events**: Write a client that processes a list of events. Depending on the event type, it should route to the correct component (notification, log, or alert). The client should have no platform-specific logic anywhere in it.

5. **Demonstrate platform switching**: Show that running the exact same event sequence on all three platforms produces correctly platform-specific output from each component, while the client code that drives it stays identical.

## Success Criteria
- The same client code runs against all three platforms without modification
- Each platform family produces output that is clearly distinct and internally consistent
- Switching platforms requires changing only the factory instantiation
- Mixing components from different families is not possible through normal usage
- The output proves that each component type behaves differently per platform, not just looks different
