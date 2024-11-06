package lk.ijse.DTO;

import lk.ijse.Entity.Enrollment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CulinaryProgramDTO {
    private String programId;
    private String programName;
    private int duration;
    private double fee;
    private List<Enrollment> enrollments;
}
