package app.controller.client;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import app.bean.CategoryInfo;
import app.controller.BaseController;

@Controller
@RequestMapping(value = "/")
public class HomeController extends BaseController {
	private static final Logger logger = Logger.getLogger(HomeController.class);

	@GetMapping({ "", "home" })
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("/home");
		modelAndView.addObject("productInfos", productService.loadAllProduct());
		logger.info("home page");
		return modelAndView;
	}

	@GetMapping("/shop")
	public ModelAndView shop() {
		ModelAndView model = new ModelAndView("/shop");
		List<CategoryInfo> categories = categoryService.loadAllCategory();
		model.addObject("categoryInfos", categories);
		return model;
	}

	@GetMapping("/contact")
	public String contact() {
		return "/contact";
	}

	@GetMapping("/shop")
	public ModelAndView shop() {
		return new ModelAndView("/shop");
	}

}
