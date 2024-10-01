package org.example.ecommerceapp.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserResponese {

    private String id;
    private String name;
    private String email;

}
