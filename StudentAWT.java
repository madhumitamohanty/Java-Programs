import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Student {
    String roll, name, address;

    Student(String r, String n, String a) {
        roll = r;
        name = n;
        address = a;
    }
}

public class StudentAWT extends Frame implements ActionListener {

    TextField t1, t2, t3;
    TextArea output;
    Button add, update, delete, view;

    ArrayList<Student> list = new ArrayList<>();

    StudentAWT() {
        setTitle("Student Data Management");

        setLayout(new FlowLayout());

        add(new Label("Roll No:"));
        t1 = new TextField(20);
        add(t1);

        add(new Label("Name:"));
        t2 = new TextField(20);
        add(t2);

        add(new Label("Address:"));
        t3 = new TextField(20);
        add(t3);

        add = new Button("Add");
        update = new Button("Update");
        delete = new Button("Delete");
        view = new Button("View");

        add(add);
        add(update);
        add(delete);
        add(view);

        output = new TextArea(10, 40);
        add(output);

        add.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);
        view.addActionListener(this);

        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

        String roll = t1.getText();
        String name = t2.getText();
        String addr = t3.getText();

        if (e.getSource() == add) {
            list.add(new Student(roll, name, addr));
            output.setText("Data Inserted Successfully\n");
        }

        if (e.getSource() == view) {
            output.setText("");
            for (Student s : list) {
                output.append(s.roll + " " + s.name + " " + s.address + "\n");
            }
        }

        if (e.getSource() == delete) {
            list.removeIf(s -> s.roll.equals(roll));
            output.setText("Data Deleted\n");
        }

        if (e.getSource() == update) {
            for (Student s : list) {
                if (s.roll.equals(roll)) {
                    s.name = name;
                    s.address = addr;
                }
            }
            output.setText("Data Updated\n");
        }
    }

    public static void main(String[] args) {
        new StudentAWT();
    }
}