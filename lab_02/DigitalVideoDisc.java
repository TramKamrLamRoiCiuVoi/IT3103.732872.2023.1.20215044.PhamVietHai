//Pham Viet Hai 20215044
package lab_02;

public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDiscs = 0;
	
	private String directory;
	public void setDirectory(String directory) {
		this.directory = directory;
	}

	// Constructor mặc định
	public DigitalVideoDisc() {
		nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
	}
	
	// Constructor với các thông tin cơ bản của đĩa
	public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
		this();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.length = length;
		this.cost = cost;
	}
	
	// Getter trả về đường dẫn lưu trữ đĩa
	public String getDirectory() {
		return directory;
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
		this.category = string2;
		this.cost = f;
	}
	
	// Getter trả về số lượng đĩa đã tạo
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
    
    // method kiem tra dvd
    public boolean isMatch(String searchTitle) {
        
        return this.title.equalsIgnoreCase(searchTitle);
    }
    
    // method play
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    
    @Override
    public String toString() {
        return "Media - Title: " + title + " | Category: " + category + " | Cost: " + cost + " $";
    }
	

}
