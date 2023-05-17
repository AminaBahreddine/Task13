import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();

        // Step a: Create a text file with employee names beforehand

        // Step b: Read the file and save employees in the collection
        try (BufferedReader reader = new BufferedReader(new FileReader("employee_names.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error occurred while reading the file: " + e.getMessage());
        }

        // Step c: Print the size of the collection
        System.out.println("Size of the collection: " + employees.size());

        // Step d: Print the contents using different approaches

        // Using a standard for loop
        System.out.println("\nContents using standard for loop:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        // Using the enhanced for-each loop
        System.out.println("\nContents using for-each loop:");
        for (String employee : employees) {
            System.out.println(employee);
        }

        // Using the Iterator interface
        System.out.println("\nContents using Iterator:");
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
