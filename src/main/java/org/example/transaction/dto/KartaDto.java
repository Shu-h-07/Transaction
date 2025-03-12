package org.example.transaction.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KartaDto {
    private String name;
    private String number;
    private int password;
    private String expireDate;
}
