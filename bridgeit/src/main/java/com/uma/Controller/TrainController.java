package com.uma.Controller;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uma.Model.Train;
import com.uma.service.TrainService;
import com.uma.service.TrainServiceDemo;

@Controller
public class TrainController 
{
	TrainService trainService=new TrainServiceDemo();
	
	@RequestMapping("TrainList.html")
	@ModelAttribute("trains")
	public Collection<Train> getTrains()
	{
		
		return trainService.getAllTrain();
	}
	
	
	
	@RequestMapping("/TrainDetails.html")
	public Train getCountry(@RequestParam(value="id", required=true) int trainId) {
	return trainService.getTrainById(trainId);
	}
}
