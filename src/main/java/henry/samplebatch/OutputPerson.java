package henry.samplebatch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutputPerson {
    private String firstName;
    private String lastName;
    private String dob;
}
