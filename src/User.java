import java.util.ArrayList;
import java.util.List;

public class User {

	private String username;
	private String email;
	private String password;
	private int id_user;
	static List<User> users = new ArrayList <User>();
	
	List <Product> buyList = new ArrayList <Product>();
	
	static User actualUser;
	
	public Product get_buy_product(int number_products) {
		return buyList.get(number_products);
	}
	
	protected String getUsername() {
		return username;
	}
	
	protected void setUsername(String username) {
		this.username = username;
	}
	
	protected String getEmail() {
		return email;
	}
	
	protected void setEmail(String email) {
		this.email = email;
	}
	
	protected String getPassword() {
		return password;
	}
	
	protected void setPassword(String password) {
		this.password = password;
	}
	
	protected int getId_user() {
		return id_user;
	}
	
	protected void setId_user(int id_user) {
		this.id_user = id_user;
		
	}
	
	public void add_product(Product name) {
		buyList.add(name);
	}
		
	User(String username, String email, String password, int id_user){
		this.username = username;
		this.email = email;
		this.password = password;
		this.id_user = id_user;	
		users.add(this);
	}
	
	User(String username, String password ){
		this.username = username;
		this.password = password;
	}





	
	
}
