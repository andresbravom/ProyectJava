
public class Menu {

	public static void main(String[] args) {

		
		System.out.println("Debug 1");

		Category video =new Category("video",01);
		Category home =new Category("home", 02);
		Category books =new Category("books", 03);
		Category music = new Category("music", 04);
		

		
		System.out.println("Debug 2");

		
		Product movie1 = new Product("movie1",01, "video", 5, 8);
		Product movie2 = new Product("movie2",02, "video", 5, 8);
		Product movie3 = new Product("movie3",03, "video", 5, 8);
		
		System.out.println("Debug 3");

		
		Product music1 = new Product("cd1", 04, "music", 10, 5);
		Product music2 = new Product("cd1", 05, "music", 10, 5);
		Product music3 = new Product("cd1", 06, "music", 10, 5);
		
		System.out.println(music1.getName());
		int i = 0;
		while(i < Category.general.cList.size()) {
			System.out.println(Category.general.cList.get(i).getName());
			i++;
			}
		int j = 0;
		while(j < video.products.list.size()) {
			System.out.println(video.products.list.get(j).getName());
			j++;
			}
	}
	

	}


