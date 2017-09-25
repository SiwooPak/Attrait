package www.model.memo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.model.common.IDAO;
import www.model.common.IService;
import www.utility.attrait.DBClose;
import www.utility.attrait.DBOpen;

@Service 
public class MemoService{

	private MemoDAOImpl dao;
	
	
	public boolean reply(MemoDTO dto){
		boolean flag = false;
		Connection con = DBOpen.getConnection();
		
			
			try {
				con.setAutoCommit(false);
				
				Map map = new HashMap();
				map.put("grpno", dto.getGrpno());
				map.put("ansnum", dto.getAnsnum());
				map.put("con", con);
				dao.upAnsnum(map);
				flag = dao.replyCreate(dto, con);
				
				con.commit();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				try{
					con.rollback();
				} catch (Exception e1) {
					// TODO: handle exception
				}
			}finally{
				try {
					con.setAutoCommit(true);
					DBClose.close(con);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
		return flag;
	}

}
