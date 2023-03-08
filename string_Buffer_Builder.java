import java.lang.StringBuffer;
import java.lang.StringBuilder;

public class string_Buffer_Builder {
    public static void main(String[] args) {
        String s = "Priya";
        s.concat("nshu");
        System.out.println(s);

        StringBuffer buffer = new StringBuffer("Priya");
        buffer.append("nshu");
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder("Priya");
        builder.append("nshu");
        System.out.println(builder);
    }
}
