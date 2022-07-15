package decorator;




/*import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class BufferedStreamTest {

	public static void main(String[] args) {
		// 이미지 파일 복사 - 읽고 쓰기
		// BufferedStream 보조스트림 클래스 사용
		long start =0, end =0;
		String originFile = "C:/File/bg0.jpg";
		String copyFile = "C:/File/bg_copy.jpg";
		
		try(FileInputStream fis = new FileInputStream(originFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(copyFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			start = System.currentTimeMillis();	//복사 전 시간
			int i;
			while((i= bis.read()) != -1) {
				bos.write(i);
			}
			end = System.currentTimeMillis();	//복사 후 시간
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사 소요시간: " + (end - start) + "ms");
	}

}*/
