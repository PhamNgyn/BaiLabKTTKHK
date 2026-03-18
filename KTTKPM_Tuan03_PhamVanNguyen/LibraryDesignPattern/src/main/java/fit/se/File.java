package fit.se;

// Tập tin chỉ chứa dữ liệu, không chứa cái gì khác bên trong
public class File implements FileSystemComponent {
    private String name;
    private String data;

    public File(String name, String data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "📄 File: " + name + " (Dữ liệu: " + data + ")");
    }
}
