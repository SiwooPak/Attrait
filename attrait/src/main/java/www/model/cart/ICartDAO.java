package www.model.cart;

import www.DAOInter;

public interface ICartDAO extends DAOInter{
	boolean delete() throws Exception;
}
