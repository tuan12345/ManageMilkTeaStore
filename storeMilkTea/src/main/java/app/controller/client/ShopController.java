package app.controller.client;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import app.bean.CategoryInfo;
import app.controller.BaseController;

@Controller
public class ShopController extends BaseController {

	private static final Logger logger = Logger.getLogger(ShopController.class);

	@GetMapping("/shop")
	public ModelAndView shop(@RequestParam(value = "page", required = false) Integer page) {
		ModelAndView model = new ModelAndView("/shop");
		Long countProduct = productService.count();
		logger.info("laaa---" + countProduct);
		Long totalPage = productService.page(countProduct, 4);
		List<CategoryInfo> categories = categoryService.loadAllCategory();
		int cunrentPage = 1;
		if(page !=null){
			cunrentPage=page;
		}
		model.addObject("currentPage", cunrentPage);
		model.addObject("categoryInfos", categories);
		model.addObject("totalPage", totalPage);
		model.addObject("productInfos", productService.loadProductByPage(page, 4));
		return model;

	}

}
