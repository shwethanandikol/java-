package com.xworkz.train.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import com.xworkz.train.dto.TrainDto;
import com.xworkz.train.util.TrainUtil;

public class TrainDao {
	static Connection sqlCon = null;
	private PreparedStatement preparedStatement;

	public boolean save(TrainDto dto) {
		Connection connection = null;
		try {
			sqlCon = TrainUtil.createConnection();
			String sql = "insertinto train value(?,?,?,?,?,?,?,?)";
			PreparedStatement preStatement = sqlCon.prepareStatement(sql);

			preStatement.setObject(1, dto.getId());
			preStatement.setObject(2, dto.getTrainNo());
			preStatement.setObject(3, dto.getBoarding());
			preStatement.setObject(4, dto.getDestination());
			preStatement.setObject(5, dto.getSeatno());
			preStatement.setObject(6, dto.getPrice());
			preStatement.setObject(7, dto.getClass());
			preStatement.setObject(8, dto.getName());

			return preStatement.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.CloseConnection(sqlCon);
		}
		return false;
	}

	public boolean deleteByTrainNo(int trainNo) {
		try {
			sqlCon = TrainUtil.createConnection();
			String sql = "delete from train where trainNo=?";
			PreparedStatement preStatement = sqlCon.prepareStatement(sql);
			preStatement.setObject(1, trainNo);
			return preStatement.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.CloseConnection(sqlCon);
		}
		return false;

	}

	public boolean deletedByTrainNoAndId(int trainNo, int id) {
		try {
			sqlCon = TrainUtil.createConnection();
			String sql = "delete from train where no=" + trainNo + " and  id=" + id;
			PreparedStatement preStatement = sqlCon.prepareStatement(sql);
			preStatement.setObject(2, trainNo);
			return preStatement.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.CloseConnection(sqlCon);
		}
		return false;

	}

	public TrainDto getByTrainNo(int trainNo) {
		try {
			sqlCon = TrainUtil.createConnection();
			String sql = "select * from train where no=?";
			PreparedStatement preStatement = sqlCon.prepareStatement(sql);
			preStatement.setObject(3, trainNo);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				TrainDto d = new TrainDto();
				d.setId(resultSet.getInt(1));
				d.setTrainNo(resultSet.getInt(2));
				d.setBoarding(resultSet.getString(3));
				d.setDestination(resultSet.getString(4));
				d.setSeatno(resultSet.getString(5));
				d.setPrice(resultSet.getInt(6));
				d.setCls(resultSet.getString(7));
				d.setName(resultSet.getString(8));
				
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} 
		
		finally {
			TrainUtil.CloseConnection(sqlCon);
		}
		return null;
	}

	public Collection<TrainDto> getAll() {
		Connection connection = null;

		try {

			connection = TrainUtil.createConnection();
			Collection<TrainDto> collection = new ArrayList<TrainDto>();
			String str = "select * from tra value bording=?";
			PreparedStatement preparedStatement = connection.prepareStatement(str);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next())
				;
			TrainDto d = new TrainDto();
			d.setId(resultSet.getInt(1));
			d.setTrainNo(resultSet.getInt(2));
			d.setBoarding(resultSet.getString(3));
			d.setDestination(resultSet.getString(4));
			d.setSeatno(resultSet.getString(5));
			d.setPrice(resultSet.getInt(6));
			d.setCls(resultSet.getString(7));
			d.setName(resultSet.getString(8));
            collection.add(d);
		

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Collection<TrainDto> getAllByBoarding(String boarding) {
		Connection connection = null;

		try {

			connection = TrainUtil.createConnection();
			Collection<TrainDto> collection = new ArrayList<TrainDto>();
			String str = "select * from tra value bording=?";
			PreparedStatement preparedStatement = connection.prepareStatement(str);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next());
				
			TrainDto d = new TrainDto();
			d.setId(resultSet.getInt(1));
			d.setTrainNo(resultSet.getInt(2));
			d.setBoarding(resultSet.getString(3));
			d.setDestination(resultSet.getString(4));
			d.setSeatno(resultSet.getString(5));
			d.setPrice(resultSet.getInt(6));
			d.setCls(resultSet.getString(7));
			d.setName(resultSet.getString(8));
			collection.add(d);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
		
	public Collection<TrainDto> getAllByDestination(String destination) {
		Connection connection = null;

		try {
			connection = TrainUtil.createConnection();
			Collection<TrainDto> collection = new ArrayList<TrainDto>();
			String str = "select * from tra value destination=?";
			PreparedStatement preparedStatement = connection.prepareStatement(str);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next());
			
			TrainDto d = new TrainDto();
			d.setId(resultSet.getInt(1));
			d.setTrainNo(resultSet.getInt(2));
			d.setBoarding(resultSet.getString(3));
			d.setDestination(resultSet.getString(4));
			d.setSeatno(resultSet.getString(5));
			d.setPrice(resultSet.getInt(6));
			d.setCls(resultSet.getString(7));
			d.setName(resultSet.getString(8));
			collection.add(d);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean updateDestinationByTrainNo(String newDest, int trainNo) {
		
		return false;
	}

	public boolean updateDestinationAndBoardingByTrainNo(String newDest, int trainNo, String newBoarding) {
		return false;
	}

	public int getTotal() {
		return 0;
	}

	public double getMaxPrice() {
		return 0;
	}

	public double getMinPrice() {
		return 0;
	}
}
