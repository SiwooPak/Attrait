package www.model.memo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import www.model.common.IDAO;

@Repository
public class MemoDAOImpl implements IDAO {

	@Autowired 
	private SqlSessionTemplate mybatis;
	
	public void setmybatis(SqlSessionTemplate mybatis) {
		this.mybatis = mybatis;
	}
	
	@Override
	public List<MemoDTO> list(Map map) {
		return mybatis.selectList("memo.list", map);
	}
	
	@Override
	public MemoDTO read(int memono) {
		return mybatis.selectOne("memo.read",memono);
	}

	public boolean create(MemoDTO dto) {
		return mybatis.insert("memo.create", dto)>0;
	}

	@Override
	public boolean update(int memono) {
		return mybatis.update("memo.update", memono)>0;
	}

	@Override
	public boolean delete(int memono) {
		return mybatis.update("memo.update", memono)>0;
	}

	public boolean getRefnum(int memono) {
		return  mybatis.selectOne("memo.refnumCheck", memono);
	}
	
	public boolean replyCreate(MemoDTO dto, Connection con) throws SQLException {
		return mybatis.insert("memo.replyCreate", dto)>0;
	}
	
	public MemoDTO replyRead(int memono){
		return mybatis.selectOne("memo.replyRead", memono);
	}
	
	public int total(Map map){
		return mybatis.selectOne("memo.total", map); 
	}
	
	public void upAnsnum(Map map) throws SQLException{
		mybatis.update("memo.upAnsnum", map);
	}
	
	public void upviewcnt(int memono) { // 수정
		mybatis.update("memo.upViewcnt", memono);
	}

}
