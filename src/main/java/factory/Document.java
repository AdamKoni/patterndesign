package factory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Document {
    private String txtToSave;
    private DocumentType docType;

    public Document(String txtToSave, DocumentType docType) {
        this.txtToSave = txtToSave;
        this.docType = docType;
    }

    public void writeFile() {
        String path = "file" + docType.getDocumentType();
        System.out.println("Zapisano plik w " + path);
        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(txtToSave);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
