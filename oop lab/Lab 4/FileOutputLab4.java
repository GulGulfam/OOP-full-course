import java.io.FileWriter;
class FileOutputLab4 {
	public static void main(String[] args) throws Exception {
		FileWriter f = new FileWriter("output-1-44.txt");

		f.write("Gulfam \n");
		f.write("2114069 \n");
		f.write("BS Software Engineer");
		f.close();
	}
	
}