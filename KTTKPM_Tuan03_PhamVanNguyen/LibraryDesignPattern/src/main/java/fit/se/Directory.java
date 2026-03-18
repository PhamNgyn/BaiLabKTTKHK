package fit.se;
import java.util.ArrayList;
import java.util.List;

// Thư mục có thể chứa File hoặc các Thư mục con khác
public class Directory implements FileSystemComponent {
    private String name;
    // Danh sách chứa các Component (có thể là File hoặc Directory)
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "📁 Directory: " + name);
        // Duyệt qua tất cả các thành phần con và gọi hàm showDetails của chúng
        for (FileSystemComponent component : components) {
            component.showDetails(indent + "    "); // Tăng khoảng trắng để thụt lề
        }
    }
}