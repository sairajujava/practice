package jdbc.constants;

public class JdbcConstants {

	public static String create_sql = "CREATE TABLE fbatch.product (p_id BIGINT NOT NULL AUTO_INCREMENT,p_name VARCHAR(32) NOT NULL ,p_qty VARCHAR(32) NOT NULL,p_price VARCHAR(32) NOT NULL, p_exdate Date ,PRIMARY KEY (p_id))";

	public static String select_query = "select * from product";

	// Preparestatment

	public static String insert_query = "insert into fbatch.product values(?,?,?,?,?)";

	public static String update_query = "update fbatch.product set p_name=? where p_id = ?";
	
	public static String delete_query = "delete from fbatch.product where p_id = ?";
	
	public static String select_byId_query = "select *  from fbatch.product where p_id = ?";
}
