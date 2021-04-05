public class Game{
    public String showAnswer(char a,char [] movies,String ans){
        char [] answer = ans.toCharArray();
        for (int f=0;f<movies.length;f++){
            if (answer[f]=='_'){
                if (movies[f]==a){
                    answer[f]=a;
                }
            }
        }
        String answer1=String.valueOf(answer);
        return answer1;
    }
}
