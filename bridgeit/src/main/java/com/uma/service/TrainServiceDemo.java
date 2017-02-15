package com.uma.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.uma.Model.Train;

public class TrainServiceDemo implements TrainService {
	private static Map<Integer, Train> trains = new HashMap<Integer, Train>();
	private static int nextTrainId = 200;

	static {
		trains.put(2259, new Train(2259, "NDLS PREMIUM SPL", 15, "SEALDAH 	18:30", "NEW DELHI 	11:25", 120));
		trains.put(12236, new Train(12236, "NDLS DBRG RJDHN", 12, "NEW DELHI	09:25", "DIBRUGARH	05:30", 130));
		trains.put(12306, new Train(12306, "KOLKATA RJDHNI", 15, "	NEW DELHI	16:55", "HOWRAH JN	12:40", 120));
		trains.put(12951,new Train(12951, "MUMBAI RAJDHANI", 12, "MUMBAI CENTRAL	16:35", "NEW DELHI	08:35", 130));
		trains.put(22694, new Train(22694, "BANGLORE RAJDHNI", 11, "H NIZAMUDDIN	20:45","KSR BENGALURU	06:40", 125));
	}

	public Collection<Train> getAllTrain() {

		return trains.values();
	}

	public Train getTrainById(int trainId) {
		Train train = trains.get(trainId);
		return new Train(train.getId(), train.getName(), train.getCompartment(), train.getSource(),
				train.getDestination(), train.getSpeed());
	}

	public Train getTrainByName(String trainName) {
		for (Train train : trains.values()) {
			if (train.getName().toLowerCase().equals(trainName.toLowerCase())) {
				return train;
			}
		}
		return null;
	}

	public void saveTrain(Train train) {
		if (train.isNew()) {
			nextTrainId++;
			train.setId(nextTrainId);
			trains.put(nextTrainId, train);
		} else {
			trains.put(train.getId(), train);
		}

	}

	public void deleteTrain(Train train) {
		trains.remove(train.getId());
	}

}
