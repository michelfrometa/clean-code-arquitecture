package mskm.cleancode.application.dto.example;

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
public class GetExampleDto {
    private Long id;
    private String name;
    private String username;
    private String password;
}
