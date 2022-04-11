package lesson1.task2;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {

    public User(final String name) {
        this.name = name;
    }

    private String name;
    private String secondName;
    private int age;

}
