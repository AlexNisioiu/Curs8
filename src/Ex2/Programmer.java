package Ex2;

import java.time.LocalDate;

public class Programmer extends Employee {
    private String language;

    public Programmer(LocalDate birthday) {
        super(birthday);
    }


    @Override
    public String getPosition() {
        return "Programmer";
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }
}
