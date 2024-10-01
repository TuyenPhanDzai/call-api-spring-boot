package org.example.ecommerceapp.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateUserRequest {

    @NotBlank(message = "enter username!")
    private String name;

    @NotBlank(message = "enter email address!")
    private String email;

    @Pattern(
            regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{6,}$",
            message = "Password must be at least 6 characters long and contain at least one letter, one number, and one special character"
    )
    private String password;

}
