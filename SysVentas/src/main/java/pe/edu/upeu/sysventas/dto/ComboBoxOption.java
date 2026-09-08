package pe.edu.upeu.sysventas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ComboBoxOption {
    String key;
    String value;

    @Override
    public String toString() {
        return value;
    }
}
