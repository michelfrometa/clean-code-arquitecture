package mskm.cleancode.application.validator.user.impl;

import mskm.cleancode.application.dto.user.UpdateUserDto;
import mskm.cleancode.application.validator.user.IUserValidator;
import org.springframework.stereotype.Service;

@Service
public class IUserValidatorImpl implements IUserValidator {

    @Override
    public UpdateUserDto validate(UpdateUserDto dto) {
        // TODO: Add validation rules
        return dto;
    }

}
