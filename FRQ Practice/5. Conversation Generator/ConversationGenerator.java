import java.util.*;
public class ConversationGenerator{
    /*
    Initialize starters and enders as arrays of 5 strings each.
    Initialize questions and acknowledgements as arrays of 10 strings each.
    */
    /* Example of Strings in starters: "Hi", "Hello", "I would like you to answer a few questions" */
    String[] starters;          // contains all 5 starters
    /* Example of Strings in enders: "Bye", "Thank you for participating in this study" */
    String[] enders;            // contains all 5 enders
    /* Example of Strings in questions: "What is your name?", "How old are you?" */
    String[] questions;         // contains all 10 questions
    /* Example of Strings in acknowledgements: "OK, got it!", "Right!", "Are you sure about that?" */
    String[] acknowledgements;  // contains all 10 acknowledgements
    /*
    Starters, enders, questions, and acknowledgements are all hard-coded. Only the responses are typed in by the user.
    */
    Scanner console = new Scanner(System.in);
    /* Constructor to build starters, enders, questions, and acknowledgements */
    public ConversationGenerator(){
        starters = new String[] {"你好","Hola","Hello","Good morning","Hi"};
        enders = new String[] {"zai jian","Adios","Bye","Goodbye","See you later"};
        questions = new String[] {"What is your name","How old are you","What grade are you in","What school do you go to","Do you have any pets","What type of pets do you have","What is you favorite color","What is your favorite food","What does F=ma calculate","How are you"};
        acknowledgements = new String[] {"Alright","OK","Got it","Okay","Gotchu","Great","mmk","wow ok","Ohhh I see","Ok I gotchu"};
    }   
    public String[] getResponses(){
        String[] responses = new String[10];
        Random random =new Random();
        System.out.println(starters[random.nextInt(5)]);
        for (int i=0;i<10 ;i++ ) {
            System.out.println(questions[i]);
            responses[i]=console.nextLine();
            System.out.println(acknowledgements[random.nextInt(10)]+"\n");
        }
        System.out.println(enders[random.nextInt(5)]);
        return responses;

    }
    public static void main(String[] args) {
        ConversationGenerator convo = new ConversationGenerator();
        System.out.println(Arrays.toString(convo.getResponses()));
    }

}