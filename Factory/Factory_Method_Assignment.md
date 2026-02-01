# Assignment: Document Export System

## Objective
Build a system that exports documents in different formats (PDF, Word, HTML). The system should allow you to add new export formats in the future without modifying existing code. Each export format has its own creation logic and behavior.

## Requirements
Your system must use a factory method to create the appropriate document exporter based on the requested format. The client code should work with exporters through a common interface without knowing the concrete exporter type.

## What it should accomplish

1. **Support three export formats**: PDF, Word (DOCX), and HTML. Each format has different export behavior.

2. **Define exporter behavior**: Each exporter should implement at least these methods:
   - `export(String content, String filename)` - Exports the content to a file
   - `getFormatName()` - Returns the format name (e.g., "PDF", "DOCX", "HTML")
   - `getFileExtension()` - Returns the file extension (e.g., ".pdf", ".docx", ".html")

3. **Platform-specific export details**:
   - **PDF Exporter**: Output should indicate it's creating a PDF with compression enabled. Example: `[PDF Export] Compressing content... Writing to: filename.pdf | Format: Portable Document Format`
   - **Word Exporter**: Output should indicate it's creating a DOCX with formatting metadata. Example: `[DOCX Export] Adding Office Open XML metadata... Writing to: filename.docx | Format: Microsoft Word Document`
   - **HTML Exporter**: Output should indicate it's creating HTML with CSS styling. Example: `[HTML Export] Generating CSS styles... Writing to: filename.html | Format: HyperText Markup Language`

4. **Use a factory method**: Create an abstract `DocumentExporterFactory` class (or interface) with a factory method `createExporter()`. Then create concrete factory subclasses for each format (PDFExporterFactory, WordExporterFactory, HTMLExporterFactory).

5. **Demonstrate the pattern**: Write client code that:
   - Takes a user's choice of export format
   - Uses the appropriate factory to create an exporter
   - Exports a sample document
   - Shows that adding a new format only requires creating a new factory and exporter class, not modifying existing code

## Success Criteria
- Each export format has its own distinct exporter class
- All exporters implement a common interface or extend a common abstract class
- The factory method returns the appropriate exporter type
- Client code uses exporters through the common interface without knowing concrete types
- Adding a new export format doesn't require modifying existing exporter or client code

## Challenge Extension (Optional)
Add a fourth export format (e.g., Markdown or plain text) to prove that your design truly supports extension without modification.
