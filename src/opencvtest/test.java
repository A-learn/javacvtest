package opencvtest;
import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_highgui.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Mat img = imread("car.JPG", CV_LOAD_IMAGE_UNCHANGED);
		  if (img.empty()) //check whether the image is loaded or not
		     {
		          System.out.println("Error : Image cannot be loaded..!!" );
		          //system("pause"); //wait for a key press
		          return;
		     }
		  namedWindow("MyWindow", CV_WINDOW_AUTOSIZE); //create a window with the name "MyWindow"
		     imshow("MyWindow", img);
		     waitKey(0); //wait infinite time for a keypress

		     destroyWindow("MyWindow"); //destroy the window with the name, "MyWindow"

		   
	}

}
