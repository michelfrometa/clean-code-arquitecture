package mskm.cleancode.presentation.output;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class ErrorDetailsDto {
    private final LocalDateTime timestamp = LocalDateTime.now();
    private String message;
    private String details;
    private HttpStatus status;
}
