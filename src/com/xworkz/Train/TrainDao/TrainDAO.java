package com.xworkz.Train.TrainDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.Train.TrainDto.TrainDTO;
import com.xworkz.Train.TrainUtil.TrainUtil;

public class TrainDAO {
	public boolean save(TrainDTO dto) {
		Connection con = null;
		TrainDTO dto1 = new TrainDTO();
		try {
			con = TrainUtil.createconnection();
			String str = "insert into train.railway value(?,?,?,?,?,?,?,?)";
			PreparedStatement preStatement = con.prepareStatement(str);
			preStatement.setObject(1, dto.getId());
			preStatement.setObject(2, dto.getTrainNo());
			preStatement.setObject(3, dto.getBoarding());
			preStatement.setObject(4, dto.getDestination());
			preStatement.setObject(5, dto.getSeatNo());
			preStatement.setObject(6, dto.getPrice());
			preStatement.setObject(7, dto.getTrainclass());
			preStatement.setObject(8, dto.getName());
			int val = preStatement.executeUpdate();
			return val > 0 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(con);
		}
		return false;

	}

	public boolean deleteByTrainNo(int trainNo) {
		Connection con = null;
		TrainDTO dto1 = new TrainDTO();
		try {
			con = TrainUtil.createconnection();
			String str = "delete from train.railway where train_no=?";
			PreparedStatement preStatement = con.prepareStatement(str);
			preStatement.setObject(1, trainNo);

			int val = preStatement.executeUpdate();
			return val > 0 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(con);
		}
		return false;
	}

	public boolean deleteByTrainNoAndId(int trainNo, int trainid) {
		Connection con = null;
		TrainDTO dto1 = new TrainDTO();
		try {
			con = TrainUtil.createconnection();
			String str = "delete from train.railway where train_no=? and id=?";
			PreparedStatement preStatement = con.prepareStatement(str);
			preStatement.setObject(1, trainNo);
			preStatement.setObject(2, trainid);

			int val = preStatement.executeUpdate();
			return val > 0 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(con);
		}
		return false;
	}

	public TrainDTO getDetailsById(int id) {
		Connection con = null;
		TrainDTO dto1 = new TrainDTO();
		try {
			con = TrainUtil.createconnection();
			String str = "select * from train.railway where id=?";
			PreparedStatement preStatement = con.prepareStatement(str);
			preStatement.setObject(1, id);
			ResultSet rsl = preStatement.executeQuery();

			while (rsl.next()) {

				int col1 = rsl.getInt(1);
				int col2 = rsl.getInt(2);
				String col3 = rsl.getString(3);
				String col4 = rsl.getString(4);
				int col5 = rsl.getInt(5);
				int col6 = rsl.getInt(6);
				String col7 = rsl.getString(7);
				String col8 = rsl.getString(8);

				dto1 = new TrainDTO(col1, col2, col3, col4, col5, col6, col7, col8);

				return dto1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(con);
		}
		return null;
	}

	public boolean updateDestinationByNo(String dest, int no) {
		Connection con = null;
		try {
			con = TrainUtil.createconnection();
			String str = "update train.railway set destination=? where train_no=?";
			PreparedStatement preStatement = con.prepareStatement(str);
			preStatement.setObject(1, dest);
			preStatement.setObject(2, no);
			int rowsaffected = preStatement.executeUpdate();
			if (rowsaffected > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(con);
		}

		return false;

	}

	public boolean updateDestinationAndBoardingByNo(String dest, String board, int no) {
		Connection con = null;
		try {
			con = TrainUtil.createconnection();
			String str = "update train.railway set destination=? , boarding=? where train_no=?";
			PreparedStatement preStatement = con.prepareStatement(str);
			preStatement.setObject(1, dest);
			preStatement.setObject(2, board);
			preStatement.setObject(3, no);
			int rowsaffected = preStatement.executeUpdate();
			if (rowsaffected > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(con);
		}

		return false;
	}

	public Collection<TrainDTO> getAll() {
		Connection con = null;
		Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
		try {
			con = TrainUtil.createconnection();
			String str = "select * from train.railway";
			PreparedStatement preStatement = con.prepareStatement(str);
			ResultSet resultSet = preStatement.executeQuery();
			while (resultSet.next()) {
				TrainDTO dto = new TrainDTO();
				dto.setId(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getInt(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNo(resultSet.getInt(5));
				dto.setPrice(resultSet.getInt(6));
				dto.setTrainclass(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				collection.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(con);
		}
		return collection;
	}

	public Collection<TrainDTO> getAllByBoarding(String boarding) {
		Connection con = null;
		Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
		try {
			con = TrainUtil.createconnection();
			String str = "select * from train.railway where boarding=?";
			PreparedStatement preStatement = con.prepareStatement(str);
			preStatement.setObject(1, boarding);
			ResultSet resultSet = preStatement.executeQuery();
			while (resultSet.next()) {
				TrainDTO dto = new TrainDTO();
				dto.setId(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getInt(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNo(resultSet.getInt(5));
				dto.setPrice(resultSet.getInt(6));
				dto.setTrainclass(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				collection.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(con);
		}
		return collection;
	}

	public Collection<TrainDTO> getAllByDestination(String dest) {
		Connection con = null;
		Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
		try {
			con = TrainUtil.createconnection();
			String str = "select * from train.railway where destination=?";
			PreparedStatement preStatement = con.prepareStatement(str);
			preStatement.setObject(1, dest);
			ResultSet resultSet = preStatement.executeQuery();
			while (resultSet.next()) {
				TrainDTO dto = new TrainDTO();
				dto.setId(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getInt(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNo(resultSet.getInt(5));
				dto.setPrice(resultSet.getInt(6));
				dto.setTrainclass(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				collection.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(con);
		}
		return collection;
	}

	public int getTotal() {
		Connection connection = null;
		int rows = 0;
		try {
			connection = TrainUtil.createconnection();
			String sql = "select count(*) from train.railway";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				rows = resultSet.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(connection);
		}
		return rows;
	}

	public int getMaxPrice() {
		Connection connection = null;
		int maxprice=0;
		try {
			connection = TrainUtil.createconnection();
			String sql = "select max(price) from train.railway";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				maxprice=resultSet.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(connection);
		}
		return maxprice;
	}
	
	public int getMinPrice() {
		Connection connection = null;
		int minprice=0;
		try {
			connection = TrainUtil.createconnection();
			String sql = "select min(price) from train.railway";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				minprice=resultSet.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(connection);
		}
		return minprice;
	}

}
