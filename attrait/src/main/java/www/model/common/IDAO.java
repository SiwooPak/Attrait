package www.model.common;

import java.util.List;
import java.util.Map;

public interface IDAO {
	List<?> list(Map map); 
	Object read(int no);
	boolean update(int no); 
	boolean delete(int no);
}
