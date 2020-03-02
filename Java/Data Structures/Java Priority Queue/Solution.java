import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
/*
 * Create the Student and Priorities classes here.
 */

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCGPA() {
        return this.cgpa;
    }

    @Override
    public int compareTo(Student s) {
        int resultsComparison = Double.compare(s.cgpa, this.cgpa);
        int nameComparison = this.name.compareTo(s.name);
        int idComparison = this.id - s.id;
        return resultsComparison != 0
                ? resultsComparison
                : nameComparison != 0
                    ? nameComparison
                    : idComparison;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.name, this.cgpa, this.id);
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>();
        List<Student> students = new ArrayList<>();
        for (String event : events) {
            if (event.startsWith("ENTER")) {
                String[] words = event.split(" ");
                queue.add(new Student(Integer.parseInt(words[3]), words[1], 
                        Double.parseDouble(words[2])));
            } else {
                queue.poll();
            }
        }
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }
        return students;
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
