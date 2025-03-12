package org.example.transaction.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.transaction.model.Karta;
import org.example.transaction.model.User;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OtkazmalarDto {
    private String name;
    private String description;
    private User user;
    private Long karta;
}
