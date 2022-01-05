package com.xworkz.Train;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.Train.TrainDao.TrainDAO;
import com.xworkz.Train.TrainDto.TrainDTO;

public class TrainTester {
	public static void main(String[] args) {
		Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
		collection.add(new TrainDTO(6, 4321, "SBC", "Kalaburgi", 23, 370, "Slpeer", "UDYAN EXPRESS"));
		collection.add(new TrainDTO(2, 1234, "Kalaburgi", "Hubli", 41, 500, "AC", "HYDERBAD EXPRESS"));
		collection.add(new TrainDTO(3, 5432, "Bangalore", "Kalaburgi", 54, 450, "2A", "HUSSAN SAGAR"));
		collection.add(new TrainDTO(4, 6543, "Vijayapur", "Bangalore", 32, 180, "General", "GOLGUMBAZ EXPRESS"));
		TrainDAO dao = new TrainDAO();

		// collection.forEach((e)->dao.save(e));
//	dao.deleteByTrainNo(1234);
		// dao.deleteByTrainNoAndId(4321, 6);
		// System.out.println(dao.getDetailsById(6));

		// System.out.println(dao.updateDestinationByNo("Solapur", 4321));

		// System.out.println(dao.updateDestinationAndBoardingByNo("smg", "Delhi",1234));
		
		Collection<TrainDTO> collection2=dao.getAll();
		collection2.forEach((d)->System.out.println(d));
		
		Collection<TrainDTO> collection3=dao.getAllByBoarding("Delhi");
		collection3.forEach((d)->System.out.println(d));
		
		Collection<TrainDTO> collection4=dao.getAllByDestination("smg");
		collection4.forEach((d)->System.out.println(d));
		
		System.out.println(dao.getTotal());
		
		System.out.println(dao.getMaxPrice());
		System.out.println(dao.getMinPrice());

	}
}
