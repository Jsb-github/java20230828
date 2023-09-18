package ch18io.book.exercise.p10;

import java.io.*;

public class Example {
    
    
    public static void main(String[] args) {
        try {
            InputStream keyboard = System.in;
            InputStreamReader isr = new InputStreamReader(keyboard);
            BufferedReader br = new BufferedReader(isr);
            try(br; isr;) {
                //경로 받기
                System.out.println("원본 파일 경로 : " );
                String originalFilePath = br.readLine();

                //복사 파일 경로
                System.out.println("복사 파일 경로 : ");
                String targetFilePath =br.readLine();

                //원본 파일 존재여부
                File originalFile = new File(originalFilePath);
                if(!originalFile.exists()){
                    System.out.println("원본 파일이 존재 하지않습니다.");
                    System.exit(0);
                }

                //복사 파일 경로상에 없는 모든 디렉토리 생성
                File targetFile = new File(targetFilePath);
                File parentFile = targetFile.getParentFile();
                if (!parentFile.exists()){
                    parentFile.mkdirs();
                }



                //입출력 스트림 얻기
                BufferedInputStream bis =new BufferedInputStream(
                        new FileInputStream(originalFilePath));

                BufferedOutputStream bos = new BufferedOutputStream(
                        new FileOutputStream(targetFilePath));

                //파일 데이터를 읽고 출력하기
                byte[] data = new byte[1024];
                int num = -1;
                while (true){
                    num = bis.read(data);
                    if (num==-1){
                        break;
                    }
                    bos.write(data,0,num);
                }
                System.out.println("복사가 성공되었습니다.");

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
  
}
