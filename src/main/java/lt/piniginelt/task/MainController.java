package lt.piniginelt.task;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView number() {
		return new ModelAndView("home", "number", new Number());
	}

	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public ModelAndView addList(@Valid @ModelAttribute("number") Number number,
			BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return new ModelAndView("home", "number", number);
			// form = "student";
		} else {
			ModelAndView mv = new ModelAndView("result");
			List<String> list = getList(number.getNumber());
			mv.addObject("lists", list);
			return mv;
		}

	}

	private List<String> getList(int maxNum) {

		List<String> list = new ArrayList<String>();

		for (int i = 1; i <= maxNum; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add("" + i);
			}
		}

		return list;

	}
}