package ch12api.lecture;

public class C15indexof {
    public static void main(String[] args) {
        //indexOf : 특정 문자열이 시작하는 위치(index) 리턴
        String a= "spring";

        int index = a.indexOf("ring"); //2
        System.out.println(index);

        System.out.println(a.indexOf("pr")); //1

        String b = "spring is spring";
        System.out.println(b.indexOf("ring")); //2

       int index1 = b.indexOf("ring" , 2);//2
        System.out.println(index1);

        System.out.println(b.indexOf("ring" , 3));//12;

        String str = "abc hi ho";
        int length = str.length();
        int result =0;

        for(int i=0; i<length; i++){
            String w = str.substring(i,i+2);
            if(w.equals("hi")){
                result++;
            }
        }
        System.out.println(result);
    }
}
