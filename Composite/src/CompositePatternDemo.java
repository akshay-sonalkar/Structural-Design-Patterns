/**
 * CompositePatternDemo
 * This class demonstrates the Composite Pattern.
 * The Composite Pattern is a structural design pattern that lets you compose objects into tree structures to represent part-whole hierarchies.
 * The Composite Pattern allows clients to treat individual objects and compositions of objects uniformly.
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File1");
        FileSystemComponent file2 = new File("File2");

        Directory directory1 = new Directory("Directory1");
        directory1.addComponent(file1);

        Directory directory2 = new Directory("Directory2");
        directory2.addComponent(file2);
        directory2.addComponent(directory1);

        directory2.showDetails();
    }
}
