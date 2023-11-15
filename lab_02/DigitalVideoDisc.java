//Pham Viet Hai 20215044
package lab_02;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
	
	private String title;
	private String cagetory;
	private String directory;
	private int length;
	private float cost;
	private int id;
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setCagetory(String cagetory) {
		this.cagetory = cagetory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	// Constructor mặc định
	public DigitalVideoDisc() {
		nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
	}
	
	// Constructor với các thông tin cơ bản của đĩa
	public DigitalVideoDisc(String title, String cagetory, String directory, int length, float cost) {
		this();
		this.title = title;
		this.cagetory = cagetory;
		this.directory = directory;
		this.length = length;
		this.cost = cost;
	}
	
	// Getter trả về tiêu đề của đĩa
	public String getTitle() {
		return title;
	}
	
	// Getter trả về thể loại của đĩa
	public String getCagetory() {
		return cagetory;
	}
	
	// Getter trả về đường dẫn lưu trữ đĩa
	public String getDirectory() {
		return directory;
	}
	
	// Getter trả về độ dài của đĩa
	public int getLength() {
		return length;
	}
	
	// Getter trả về giá tiền của đĩa
	public float getCost() {
		return cost;
	}
	
	// Constructor với chỉ tiêu tiêu đề của đĩa
	public DigitalVideoDisc(String title) {
		this();
		this.title = title;
	}
	
	// Constructor với các chỉ tiêu tiêu đề, thể loại và giá tiền của đĩa
	public DigitalVideoDisc(String string, String string2, float f) {
		this();
		this.title = string;
		this.cagetory = string2;
		this.cost = f;
	}
	
	// Getter trả về số lượng đĩa đã tạo
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
    
    // Getter tra ve id dvd
	public int getId() {
		
		return id;
	}
	
	// method kiem tra dvd
    public boolean isMatch(String searchTitle) {
        
        return this.title.equalsIgnoreCase(searchTitle);
    }
	

}
