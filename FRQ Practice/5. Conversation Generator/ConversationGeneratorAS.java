import java.util.*;
class ConversationGeneratorAS {

    /* Example of Strings in starters: "Hi", "Hello", "I would like you to answer a few questions" */
    String[] starters;          // contains all 5 starters

    /* Example of Strings in enders: "Bye", "Thank you for participating in this study" */
    String[] enders;            // contains all 5 enders
    
    String[] questions;         // contains all 10 questions

    String[] acknowledgements;  // contains all 10 acknowldegements
    
    Scanner sc = new Scanner(System.in);

    /*
    Initialize starters and enders as arrays of 5 strings each.
    Initialize questions and acknowledgements as arrays of 10 strings each.
    */
    public ConversationGeneratorAS(){
    /* Method not implemented */
        starters = new String[]{"Hi", "Hello", "Howdy", "Sup", "Ni Hao"};
        enders = new String[]{"Zai Jian", "Bye", "Bye Bye", "Have a nice day", "User has left the chat"};
        questions = new String[]{"Where do you live?", "How old are you?", "Who do you live with?", "Are you a gamer?", "Why do you exist?", "Are you antivax?", "Do you play fortnite?", "Are you a mercy main?", "Do you have farming Simulator?", "Do you play sports?"};
        acknowledgements = new String[]{"Nice!", "Amazing!", "Wonderful!", "Great!", "WOW!", "Good!", "Splendid!", "Sublime!", "That is truly amazing!", "You dissapoint me"};  
    }

    /*
    Retrieve responses from individual and return them.
     */
    public String[] getResponses(){
    /* Method not implemented */
        String[] responses = new String[10];
        Random r = new Random();
        System.out.println(starters[r.nextInt(5)]);
        for(int i = 0; i<10;i++){
            System.out.println(questions[i]);
            responses[i] = sc.nextLine();
            System.out.println(acknowledgements[r.nextInt(10)]);
            System.out.println();
        }
        System.out.println(enders[r.nextInt(5)]);
        return responses;

    }

    public static void main(String[] args){
        ConversationGeneratorAS test = new ConversationGeneratorAS();
        System.out.println(Arrays.toString(test.getResponses()));
    }

}