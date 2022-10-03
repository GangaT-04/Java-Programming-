import java.io.*;
class ConvertOutputStreamToString {
  

    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        String line = "Hii Hello!";

        stream.write(line.getBytes());
        String finalString = new String(stream.toByteArray());

        System.out.println(finalString);
    }
}

