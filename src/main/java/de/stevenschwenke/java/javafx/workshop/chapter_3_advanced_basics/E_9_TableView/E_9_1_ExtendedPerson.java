package de.stevenschwenke.java.javafx.workshop.chapter_3_advanced_basics.E_9_TableView;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class E_9_1_ExtendedPerson {

    // Every attribute of this bean is modelled as a property. That's "the new way of doing things".
    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;
    private SimpleStringProperty job;
    private SimpleBooleanProperty employeeOfTheMonth;

    public E_9_1_ExtendedPerson(String firstName, String lastName, String job,
                                boolean employeeOfTheMonth) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.job = new SimpleStringProperty(job);
        this.employeeOfTheMonth = new SimpleBooleanProperty(employeeOfTheMonth);

        // Through these listeners we can observe that changes in the table are really forwarded to
        // this bean.
        this.firstName.addListener((e) -> System.out.println("First Name changed to " + this.firstName.get()));
        this.lastName.addListener((e) -> System.out.println("Last Name changed to " + this.lastName.get()));
        this.job.addListener((e) -> System.out.println("Job changed to " + this.job.get()));
        this.employeeOfTheMonth.addListener((e) -> System.out.println("employeeOfTheMonth changed to " + this.employeeOfTheMonth.get()));
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public StringProperty jobProperty() {
        return job;
    }

    public SimpleBooleanProperty employeeOfTheMonthProperty() {
        return employeeOfTheMonth;
    }

    @Override
    public String toString() {
        return firstName.get() + " "  + lastName.get() + ": " + job.get();
    }
}
