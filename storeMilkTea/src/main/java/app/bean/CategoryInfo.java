package app.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class CategoryInfo {
	@NonNull
	private Integer id;
	@NonNull
	private String name;
	private List<ProductInfo> productInfos;
	

}
