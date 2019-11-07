package com.randomaccesfile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAcFile {

    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("IO流和Properties集合\\myOtherStream\\src\\com\\randomaccesfile\\a.txt", "rw");

        raf.seek(raf.length()-1);//移动到
        long pos=raf.length()-1;

      while (pos>=3)
        {
        int t=raf.read();
        raf.write(t);
        raf.seek(pos=raf.getFilePointer()-3);

        }
        raf.seek(3);
        raf.write(97);
        raf.close();

    }

}
