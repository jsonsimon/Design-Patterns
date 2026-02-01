public class HTMLExporterFactory extends BaseDocumentExporterFactory{
    @Override
    public IExport createExporter() {
        return new ExportHTML();
    }
}
