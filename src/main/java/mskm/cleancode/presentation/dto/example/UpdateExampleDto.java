package mskm.cleancode.presentation.dto.example;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UpdateExampleDto {

    @NotBlank(message = "Id cannot be blank")
    private Long id;

    private String password;
}
