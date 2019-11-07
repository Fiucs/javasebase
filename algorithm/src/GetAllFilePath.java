import java.io.File;

public class GetAllFilePath {

    public static void main(String[] args) {
        File file=new File("algorithm\\老师讲解代码");
        getAllFilePath(file);
    }

    public static void getAllFilePath(File file){

        File[] filePath=file.listFiles();//得到目录下所有文件或目录
        if(filePath ==null)
        {
            return;


        }
        else {
            for (File file1 : filePath) {
                if (file1.isDirectory()) {
                    getAllFilePath(file1);
                } else
                    System.out.println(file1.getAbsolutePath());

            }


        }

    }


}

