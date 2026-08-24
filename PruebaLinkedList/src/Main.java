
// @author Adrian Briseño Sabori
// @date Aug 17, 2026


class Student {
    String name;
    int score;
    Student next;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        LnkdLst lista = new LnkdLst();
        lista.add("Obet mednes", 39);
        lista.add("Ciret deshidratado", 1000);
        lista.add("Duego alberno", 2);

        lista.print();
    }
}


class LnkdLst {
    Student head;
    public LnkdLst() {
        this.head = null;
    }

    public void add(String name, int score) {
        Student newStudent = new Student(name, score);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newStudent;
    }

    public void print() {
        Student current = this.head;
        while(current != null) {
            System.out.println(current.name + ": " + current.score);
            current = current.next;
        }
        System.out.println("Ya se acabó la lista w");
    }
}