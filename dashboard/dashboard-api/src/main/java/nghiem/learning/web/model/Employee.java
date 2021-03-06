package nghiem.learning.web.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private long id;
    private String name;
    private int age;
    private String position;
    private String office;
    private Date startDate;
    private long salary;
}
