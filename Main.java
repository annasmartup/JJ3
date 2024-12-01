package org.example;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Anna", 39, 4.9);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.bin"))) {
            out.writeObject(student);
            System.out.println("Объект сериализован в файл student.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.bin"))) {
            Student deserializedStudent = (Student) in.readObject();
            System.out.println("\nОбъект десериализован. Информация о студенте:");
            deserializedStudent.printStudentInfo();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}