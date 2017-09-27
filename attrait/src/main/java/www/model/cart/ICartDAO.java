package www.model.cart;

import java.util.*;
import www.DAOInter;

interface ICartDAO extends DAOInter{
	boolean delete() throws Exception;
}
