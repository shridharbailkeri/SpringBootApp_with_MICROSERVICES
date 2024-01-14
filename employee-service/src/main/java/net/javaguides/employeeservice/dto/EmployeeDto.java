package net.javaguides.employeeservice.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Schema(
        description = "Employee DTO model information"
)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private Long id;
    @Schema(
            description = "Employee First name"
    )
    private String firstName;
    @Schema(
            description = "Employee last name"
    )
    private String lastName;
    @Schema(
            description = "Employee email"
    )
    private String email;
    @Schema(
            description = "Employee department code"
    )
    private String departmentCode;
    @Schema(
            description = "Employee Organization code"
    )
    private String organizationCode;
}
