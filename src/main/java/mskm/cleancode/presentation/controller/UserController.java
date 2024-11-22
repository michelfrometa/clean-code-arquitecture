package mskm.cleancode.presentation.controller;

import lombok.RequiredArgsConstructor;
import mskm.cleancode.application.usecase.user.create.CreateUserUseCase;
import mskm.cleancode.presentation.dto.user.CreateUserDto;
import mskm.cleancode.presentation.dto.user.UserDto;
import mskm.cleancode.presentation.output.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final CreateUserUseCase createUserUseCase;

    @PostMapping
    public ResponseEntity<ResponseDto<UserDto>> create(@ModelAttribute CreateUserDto dto) {

        return Optional.of(dto)
                .map(createUserUseCase::execute)
                .map(ResponseDto::new)
                .map(ResponseEntity::ok)
                .orElse(null);
    }
}
