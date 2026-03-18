package fit.se;
public class Main {
    public static void main(String[] args) {
        // 1. Tạo các tập tin (Files)
        FileSystemComponent file1 = new File("baitap.docx", "Nội dung bài tập Design Pattern");
        FileSystemComponent file2 = new File("anh_the.jpg", "Hình thẻ 3x4");
        FileSystemComponent file3 = new File("readme.txt", "Hướng dẫn cài đặt");

        // 2. Tạo các thư mục con
        Directory docsFolder = new Directory("Tài liệu học tập");
        docsFolder.addComponent(file1);

        Directory imageFolder = new Directory("Hình ảnh cá nhân");
        imageFolder.addComponent(file2);

        // 3. Tạo thư mục gốc (Root Directory) và bỏ các thư mục/file con vào
        Directory rootFolder = new Directory("Ổ đĩa C:");
        rootFolder.addComponent(docsFolder);
        rootFolder.addComponent(imageFolder);
        rootFolder.addComponent(file3); // File nằm trực tiếp ở thư mục gốc

        // 4. Hiển thị toàn bộ cấu trúc cây thư mục
        System.out.println("Cấu trúc cây thư mục:");
        rootFolder.showDetails("");
    }
}