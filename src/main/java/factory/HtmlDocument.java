package factory;

public class HtmlDocument extends Document {
    public HtmlDocument(String text, DocumentType documentType) {
        super(prepareHtml(text),documentType);
    }

    private static String prepareHtml(String text) {
        return "<h1>" + text.replaceAll("\n", "<br>") + "</h1>";
    }
}
