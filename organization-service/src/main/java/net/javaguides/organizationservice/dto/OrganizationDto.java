package net.javaguides.organizationservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Schema(
        description = "Organization Model Information"
)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDto {

    private Long id;

    @Schema(
            description = "Organization name"
    )
    private String organizationName;
    @Schema(
            description = "Organization description"
    )
    private String organizationDescription;

    @Schema(
            description = "Organization code"
    )
    private String organizationCode;
    @Schema(
            description = "Organization created date"
    )
    private LocalDateTime createdDate;
}
