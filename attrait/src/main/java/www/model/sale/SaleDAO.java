package www.model.sale;

import java.util.List;
import java.util.Map;

import www.model.common.IDAO;

public interface SaleDAO extends IDAO {

	/* (non-Javadoc)
	 * @see www.model.common.IDAO#list(java.util.Map)
	 */
	@Override
	List<SaleDTO> list(Map map);

	/* (non-Javadoc)
	 * @see www.model.common.IDAO#read(int)
	 */
	@Override
	SaleDTO read(int no);
	
}
