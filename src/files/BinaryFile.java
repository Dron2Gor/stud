package files;

import utilDecember.Directory;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryFile {
    public static byte[] read(File bFile) throws IOException {
        BufferedInputStream bf = new BufferedInputStream(new FileInputStream(bFile));
        try {
            byte[] data = new byte[bf.available()];
            bf.read(data);
            return data;
        } finally {
            bf.close();
        }
    }

    public static byte[] read(String bFile) throws IOException {
        return read(new File(bFile).getAbsoluteFile());
    }

    public static void main(String[] args) throws IOException {
//        Map<Byte, Integer> map =new HashMap<>();
        List<File> listCl = Directory.walk("D:\\Java\\project\\stud\\out\\production\\stud\\std1\\", ".*\\.class").files;
        System.out.println(listCl);
        byte[] sb = null;
        boolean flag = false;
        for (File fl : listCl) {
            sb = read(fl);
            if (sb[0] == -54 && sb[1] == -2 && sb[2] == -70 && sb[3] == -66) flag = true;
            else {
                flag = false;
                System.out.println(sb[0]+" "+sb[1]+" "+sb[2]+" "+sb[3] );
                System.out.println();
            }
        }
//        for (Byte tempByte:sb){
//            if (map.containsKey(tempByte)) map.put(tempByte,(map.get(tempByte)+1));
//            else map.put(tempByte,1);
//        }
//        int count =0;
//       for(Map.Entry pair: map.entrySet()){
//
//           System.out.print (Integer.toHexString(Byte.toUnsignedInt((Byte) pair.getKey()))+": "+pair.getValue()+"; ");
//           count++;
//           if (count%5==0) System.out.println();
//       }
//        System.out.println();
//        for (byte bt : sb) {
//            System.out.print(bt + " ");
//        }
        System.out.println(flag);

    }
}
