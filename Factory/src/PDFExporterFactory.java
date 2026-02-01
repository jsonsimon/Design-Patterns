public class PDFExporterFactory extends BaseDocumentExporterFactory {
    @Override
    public IExport createExporter() {
        return new ExportPDF();
    }
}
