package baby.calender.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import baby.calender.dto.DetailDto;
import baby.calender.dto.ProductDto;

public class DetailDao {
	
	DataSource dataSource;
	
	public DetailDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/comeon_baby");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public  ArrayList<DetailDto> detail_list(){
		ArrayList<DetailDto> dtos = new ArrayList<DetailDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
	
	try {
		connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
		
		String query = "select detailCode, detailproductid, detailAmount, detailStarscore, detailReview, detailColor, detailSize from product_detail";
		preparedStatement = connection.prepareStatement(query);
		resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			int detailCode = resultSet.getInt("detailCode"); //sql 컬럼이름과 같아야 됨 
			int detailproductid = resultSet.getInt("detailproductid"); //sql 컬럼이름과 같아야 됨 
			int detailAmount = resultSet.getInt("detailAmount"); //sql 컬럼이름과 같아야 됨 
			double detailStarscore = resultSet.getDouble("detailStarscore"); //sql 컬럼이름과 같아야 됨 
			String detailReview = resultSet.getString("detailReview");
			String detailColor = resultSet.getString("detailColor");
			String detailSize = resultSet.getString("detailSize");
			DetailDto dto = new DetailDto(detailCode, detailproductid, detailAmount, detailStarscore, detailReview, detailColor, detailSize); // 이제 한줄로 데이터를 박싱했음
			dtos.add(dto);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(resultSet != null) resultSet.close();
			if(preparedStatement != null) preparedStatement.close();
			if(connection != null) connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	return dtos;
	}// list

}
