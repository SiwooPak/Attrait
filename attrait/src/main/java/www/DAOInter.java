package www;

import java.util.List;
import java.util.Map;

public interface DAOInter {
	List list(Map map) throws Exception; 
	boolean create(Object dto) throws Exception;
	boolean update(Object dto) throws Exception; 
	boolean delete(Object pk)	throws Exception;
	Object read(Object pk) throws Exception;
	int total(Map map) throws Exception;
}
