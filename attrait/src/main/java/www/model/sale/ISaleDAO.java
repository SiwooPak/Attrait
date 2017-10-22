package www.model.sale;

import java.util.List;
import java.util.Map;
import www.DAOInter;


public interface ISaleDAO extends DAOInter {
	int dayTotal(Map map) throws Exception;
	int monthTotal(Map map) throws Exception;
	int productTotal(Map map) throws Exception;
	List<SaleDTO> list() throws Exception;
	List<DSaleDTO> dayList(Map map) throws Exception; 
	List<MSaleDTO> monthList(Map map) throws Exception; 
	List<PSaleDTO> productList(Map map) throws Exception; 
}
