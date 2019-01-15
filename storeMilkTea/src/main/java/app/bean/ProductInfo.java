package app.bean;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductInfo {
	private Integer id;
	private String name;
	private String image;
	private BigDecimal price;
	private Integer status;
	private CategoryInfo categoryInfo;

}
