package mskm.cleancode.presentation.controller;

import lombok.RequiredArgsConstructor;
import mskm.cleancode.application.usecase.user.UserUseCaseService;
import mskm.cleancode.presentation.dto.user.CreateUserDto;
import mskm.cleancode.presentation.dto.user.GetUserDto;
import mskm.cleancode.presentation.dto.user.UpdateUserDto;
import mskm.cleancode.presentation.dto.user.UserDto;
import mskm.cleancode.presentation.output.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserUseCaseService userUseCaseService;

    @GetMapping
    public ResponseEntity<ResponseDto<List<UserDto>>> filter(@ModelAttribute GetUserDto dto) {

        return Optional.of(dto)
                .map(userUseCaseService::filter)
                .map(ResponseDto::new)
                .map(ResponseEntity::ok)
                .orElse(null);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto<UserDto>> get(@ModelAttribute GetUserDto dto) {

        return Optional.of(dto)
                .map(userUseCaseService::get)
                .map(ResponseDto::new)
                .map(ResponseEntity::ok)
                .orElse(null);
    }

    @PostMapping
    public ResponseEntity<ResponseDto<UserDto>> create(@ModelAttribute CreateUserDto dto) {

        return Optional.of(dto)
                .map(userUseCaseService::create)
                .map(ResponseDto::new)
                .map(ResponseEntity::ok)
                .orElse(null);
    }

    @PutMapping
    public ResponseEntity<ResponseDto<UserDto>> update(@ModelAttribute UpdateUserDto dto) {
        return Optional.of(dto)
                .map(userUseCaseService::update)
                .map(ResponseDto::new)
                .map(ResponseEntity::ok)
                .orElse(null);
    }
}
