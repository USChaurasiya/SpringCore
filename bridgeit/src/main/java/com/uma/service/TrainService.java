package com.uma.service;

import java.util.Collection;

import com.uma.Model.Train;

public interface TrainService 
{
	public Collection<Train> getAllTrain();
	 
	public Train getTrainById(int trainId);
	 
	public Train getTrainByName(String trainName);
	 
	public void saveTrain(Train train);
	 
	public void deleteTrain(Train train);
}
