package co.develhope.FirstAPI5.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.validation.constraints.NotBlank;

/**
 * @author Tania Ielpo
 */

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {

    @NotBlank(message = "Mandatory")
    private String id;
    @NotBlank(message = "Mandatory")
    private String modelName;
    private Double price;
}
