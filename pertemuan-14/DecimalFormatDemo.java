import java.text.DecimalFormat;

public class DecimalFormatDemo {
    public static void main(String[] args){
    	DecimalFormat formatku = new DecimalFormat("###.##");
    	//String output = formatku.format(45.8398767);
    	//System.out.println(output);
		System.out.println(formatku.format(45.8398767));
    }
}
