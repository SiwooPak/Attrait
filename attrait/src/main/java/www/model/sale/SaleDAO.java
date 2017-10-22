package www.model.sale;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class SaleDAO implements ISaleDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void setMybatis(SqlSessionTemplate mybatis) {
		this.mybatis = mybatis;
	}
	
	@Override
	public int total(Map map) throws Exception {
		return mybatis.selectOne("sale.total");
	}

	@Override
	public int dayTotal(Map map) throws Exception {
		return mybatis.selectOne("sale.dayTotal", map);
	}

	@Override
	public int monthTotal(Map map) throws Exception {
		return mybatis.selectOne("sale.monthTotal", map);
	}

	@Override
	public int productTotal(Map map) throws Exception {
		return mybatis.selectOne("sale.productTotal", map);
	}

	@Override
	public List<SaleDTO> list() throws Exception {
		return mybatis.selectList("sale.excelList");
	}
	
	@Override
	public List<DSaleDTO> dayList(Map map) throws Exception {
		return mybatis.selectList("sale.dayList", map);
	}

	@Override
	public List<MSaleDTO> monthList(Map map) throws Exception {
		return mybatis.selectList("sale.monthList", map);
	}

	@Override
	public List<PSaleDTO> productList(Map map) throws Exception {
		return mybatis.selectList("sale.productList", map);
	}

	@Override
	public List list(Map map) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Object dto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Object dto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object pk) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object read(Object pk) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
