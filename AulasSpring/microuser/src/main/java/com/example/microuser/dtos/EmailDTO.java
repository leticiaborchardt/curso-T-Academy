package com.example.microuser.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmailDTO {
    private UUID userId;
    private String emailTo;
    private String subject;
    private String text;
}
