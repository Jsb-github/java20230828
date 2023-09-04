package ch16lambda.book.exercise.p07;

public class Example {
    private  static  int [] scores = {10,50,3};

    public static  int maxOrMin(Operator operator){
        int result = scores[0];
        for(int score : scores){
            result = operator.apply(result,score);
            //result  = (result < score ? score : result);
        }
        return  result;
    }


    public static void main(String[] args) {
        //최대값 얻기
        int max = maxOrMin((x,y) -> (x<y)? y : x);
        int max2 = maxOrMin((x,y)->{
            if(x>y){
                return x;
            }else {
                return y;
            }
        });


        int max3 = maxOrMin((x,y)->Math.max(x,y));
        System.out.println("최대값 : " + max);



        //최소값 얻기
        int min = maxOrMin((x, y) -> (x>y) ? y : x);
        int min2 = maxOrMin((x,y)->Math.min(x,y));
        System.out.println("최소값 : " + min);
    };
}

