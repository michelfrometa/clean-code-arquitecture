package mskm.cleancode.presentation.dto.example;

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
public class ExampleDto {
    private Long id;
    private String name;
    private String username;
    private String password;
}
