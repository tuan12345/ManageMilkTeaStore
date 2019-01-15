package app.util;

import app.bean.CategoryInfo;
import app.bean.ProductInfo;
import app.bean.RoleInfo;
import app.bean.UserInfo;
import app.model.Category;
import app.model.Product;
import app.model.Role;
import app.model.User;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConvertModelToBean {

	public static RoleInfo mapRoleToRoleInfo(Role role) {
		Function<Role, RoleInfo> map = r -> new RoleInfo(r.getId(), r.getName());

		return map.apply(role);
	}

	public static UserInfo mapUserToUserInfo(User user) {
		Function<User, UserInfo> map = u -> new UserInfo(u.getId(), u.getEmail(), u.getPassword(), u.isEnable());

		return map.apply(user);
	}

	public static CategoryInfo mapCategoryToCategoryInfo(Category category) {
		Function<Category, CategoryInfo> map = c -> new CategoryInfo(c.getId(), c.getName());
		return map.apply(category);
	}

	public static List<ProductInfo> mapProductsToProductInfo(List<Product> products) {
		Function<Product, ProductInfo> map = p -> new ProductInfo(p.getId(), p.getName(), p.getImage(), p.getPrice(),
				p.getStatus(), mapCategoryToCategoryInfo(p.getCategory()));
		return products.stream().map(map).collect(Collectors.toList());
	}
}
