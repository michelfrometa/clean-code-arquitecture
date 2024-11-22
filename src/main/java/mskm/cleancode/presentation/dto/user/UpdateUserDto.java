package mskm.cleancode.presentation.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import mskm.cleancode.presentation.dto.BaseDto;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class UpdateUserDto extends BaseDto<Long> {

    private String password;
}
