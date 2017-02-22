package com.uma.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uma.Model.Country;
import com.uma.Service.WorldService;

/**
 * This is Controller Class containing different handler related to form page..
 * @author um@.
 */
@Controller
public class CountryController {

	@Autowired
	WorldService worldService;

	@RequestMapping("form.html")
	public ModelAndView getForm(@ModelAttribute Country country) {
		return new ModelAndView("form1");
	}
	
	@RequestMapping("register")
	public ModelAndView registerUser(@ModelAttribute Country country) {
		worldService.saveCountry(country);
		return new ModelAndView("redirect:list");
	}
	
	@RequestMapping("list")
	public ModelAndView getList(Model m) {
		List<Country> countryList = (List<Country>) worldService.getAllCountries();
		return new ModelAndView("list","countryList",countryList);
	}
	
	@RequestMapping("delete")
	public ModelAndView deleteCountry(@RequestParam int id) {
		worldService.deleteCountry(id);;
		return new ModelAndView("redirect:list");
	}
	
	@RequestMapping("edit")
	public ModelAndView editCountry(@RequestParam int id,@ModelAttribute Country country) {
		Country countryObject = worldService.getCountryById(id);
		return new ModelAndView("edit","countryObject",countryObject);
	}
	
	@RequestMapping("update")
	public ModelAndView updateUser(@ModelAttribute Country country) {
		worldService.updateRow(country);
		return new ModelAndView("redirect:list");
	}


}
