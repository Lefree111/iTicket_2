package com.company.dto.product;

import com.company.enums.product.ProductStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDTO {
    private String id;
    @NotNull(message = "name qani ??")
    private String name;
    @NotNull(message = "attach_id qani ??")
    private String attach_id;
    @NotNull(message = "cattegory_id qani ??")
    private String cattegory_id;
    @NotNull(message = "address qani ??")
    private String address;
    @NotNull(message = "from_amount qani ??")
    private Double from_amount;
    @NotNull(message = "to_amount qani ??")
    private Double to_amount;
    @NotNull(message = "durationDate qani ??")
    private LocalDate durationDate;
    private String description;
    private ProductStatus status;
    private LocalDateTime publishedDate;
    private LocalDateTime createDate;
}