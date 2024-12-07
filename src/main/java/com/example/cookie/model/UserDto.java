package com.example.cookie.model;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    private String id;

    private String name;

    private String password;

}
