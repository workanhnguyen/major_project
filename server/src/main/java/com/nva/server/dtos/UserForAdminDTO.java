package com.nva.server.dtos;

import com.nva.server.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserForAdminDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String avatar;
    private Role role;
    private boolean isActive;
    private Date createdAt;
    private Date updatedAt;
}
