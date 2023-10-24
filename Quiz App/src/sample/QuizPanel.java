package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class QuizPanel extends JPanel implements ActionListener {


        final JFrame frame = new JFrame("warning message");
        final JLabel Question = new JLabel();
        final JLabel numberOfQuestion = new JLabel();
        final Button a = new Button("Answer 1");
        final Button b = new Button("Answer 2");
        final Button c = new Button("Answer 3");
        final Button d = new Button("Answer 4");


//        final JTextField mouseMovementMessage=new JTextField();

        int rightAnswers =0;
        //an array that includes the already used questions(this is to avoid repetition)
        int[] usedQuestions = new int[20];

        int usedQuestionsCount =0;  //counting the number of question made
        int pickedQuestion =0; //the number of the picked question




    QuizPanel(){
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 500); // set dimension

    //Number of Question Label
    numberOfQuestion.setHorizontalAlignment(JLabel.CENTER);
    numberOfQuestion.setLocation(250,0 );
    numberOfQuestion.setForeground(Color.white);


    //the Question
    Question.setHorizontalAlignment(JLabel.CENTER);
    Question.setLocation(300,250);
    Question.setPreferredSize(new Dimension(200,300));


    //the Answers
    Panel p = new Panel();
    GridLayout grid=new GridLayout(2,2);
    grid.setHgap(10);
    grid.setVgap(10);
    p.setLayout(grid);
    a.setPreferredSize(new Dimension(100, 40));
    b.setPreferredSize(new Dimension(100, 40));
    c.setPreferredSize(new Dimension(100, 40));
    d.setPreferredSize(new Dimension(100, 40));


    p.add(a);
    p.add(b);
    p.add(c);
    p.add(d);

    frame.add(p,BorderLayout.SOUTH);
    frame.add(Question,BorderLayout.CENTER);
    frame.add(numberOfQuestion,BorderLayout.NORTH);



    a.addActionListener(this::AnswerA);
    b.addActionListener(this::AnswerB);
    c.addActionListener(this::AnswerC);
    d.addActionListener(this::AnswerD);

    frame.getContentPane().setBackground(Color.gray);


    }

    public int getRandomNumber(int min, int max) {

        return (int) ((Math.random() * (max - min)) + min);
    }

	

    public void GetQuestion(int number){

        switch (number) {
            case 1 -> {
                pickedQuestion = number;
                Question.setText("In what year did Bulgaria come to exist?");
                a.setLabel("681");
                b.setLabel("618");
                c.setLabel("865");
                d.setLabel("709");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 2 -> {
                pickedQuestion = number;
                Question.setText("When did USSR fall?");
                a.setLabel("1945");
                b.setLabel("2002");
                c.setLabel("1991");
                d.setLabel("1953");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 3 -> {
                pickedQuestion = number;
                Question.setText("From what family was Mattias Corvinus?");
                a.setLabel("Habsburg");
                b.setLabel("Hunyadi");
                c.setLabel("Asen");
                d.setLabel("Arpad");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 4 -> {
                pickedQuestion = number;
                Question.setText("Who created the real Holy Roman Empire?");
                a.setLabel("Charlemagne");
                b.setLabel("Frederick Barbarossa");
                c.setLabel("Octavian August");
                d.setLabel("Otto I");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 5 -> {
                pickedQuestion = number;
                Question.setText("How long was actually the \"One-Hundred Year \" war between France and England?");
                a.setLabel("100");
                b.setLabel("105");
                c.setLabel("98");
                d.setLabel("116");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }
            case 6 -> {
                pickedQuestion = number;
                Question.setText("Which of this religions is NOT Indian?");
                a.setLabel("Hinduism");
                b.setLabel("Taoism");
                c.setLabel("Sikhism");
                d.setLabel("Buddhism");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 7 -> {
                pickedQuestion = number;
                Question.setText("Which of this empires is NOT Persian?");
                a.setLabel("Sassanian Empire");
                b.setLabel("Safavid Empire");
                c.setLabel("Ghaznavids");
                d.setLabel("Achaemenid Empire");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 8 -> {
                pickedQuestion = number;
                Question.setText("Who is the first president of France?");
                a.setLabel("Louis-Napoléon Bonaparte");
                b.setLabel("Adolphe Thiers");
                c.setLabel("Raymond Poincaré");
                d.setLabel("Napoléon Bonaparte");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 9 -> {
                pickedQuestion = number;
                Question.setText("Which region is NOT part of the Czech Republic?");
                a.setLabel("Bohemia");
                b.setLabel("Moravia");
                c.setLabel("Silesia");
                d.setLabel("Lusatia");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 10 -> {
                pickedQuestion = number;
                Question.setText("Which of this ethnic groups is NOT real?");
                a.setLabel("Lusatian Serbs");
                b.setLabel("Chaharmahali Turks");
                c.setLabel("Ghanaian Creole people");
                d.setLabel("Salian Franks");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }
            case 11 -> {
                pickedQuestion = number;
                Question.setText("Who is the first emperor(tsar) of Bulgaria?");
                a.setLabel("Simeon I");
                b.setLabel("Samuel");
                c.setLabel("Simeon II");
                d.setLabel("Boris I");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 12 -> {
                pickedQuestion = number;
                Question.setText("Who is the first king of Bohemia?");
                a.setLabel("Vladislaus II");
                b.setLabel("Bořivoj I");
                c.setLabel("Ottokar I");
                d.setLabel("Vratislaus II");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 13 -> {
                pickedQuestion = number;
                Question.setText("What was the religion of Bulgaria before the Christianization?");
                a.setLabel("Slavic paganism");
                b.setLabel("Tangrism");
                c.setLabel("Zoroastrianism");
                d.setLabel("Islam");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 14 -> {
                pickedQuestion = number;
                Question.setText("In what year did Vasil Levski die?");
                a.setLabel("1876");
                b.setLabel("1873");
                c.setLabel("1872");
                d.setLabel("1878");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 15 -> {
                pickedQuestion = number;
                Question.setText("Which one city was NEVER a capital of Bulgaria?");
                a.setLabel("Veliko Tarnovo");
                b.setLabel("Veliki Preslav");
                c.setLabel("Plovdiv");
                d.setLabel("Skopje");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }
            case 16 -> {
                pickedQuestion = number;
                Question.setText("Which country is recognized by at least one UN state?");
                a.setLabel("Transnistria");
                b.setLabel("Somaliland");
                c.setLabel("Abkhazia");
                d.setLabel("Artsakh");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 17 -> {
                pickedQuestion = number;
                Question.setText("Which Bulgarian city has the smallest population?");
                a.setLabel("Melnik");
                b.setLabel("Kozloduy");
                c.setLabel("Dolni Chiflik");
                d.setLabel("Pliska");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 18 -> {
                pickedQuestion = number;
                Question.setText("Who is the first king of Italy?");
                a.setLabel("Victor Emmanuel II");
                b.setLabel("Charles Albert");
                c.setLabel("Giuseppe Garibaldi");
                d.setLabel("Victor Emmanuel I");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 19 -> {
                pickedQuestion = number;
                Question.setText("Which dynasty has ruled Bulgaria?");
                a.setLabel("Romanov");
                b.setLabel("Hunyadi");
                c.setLabel("The Macedonian dynasty");
                d.setLabel("Smilets");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 20 -> {
                pickedQuestion = number;
                Question.setText("Which ruler has never had the title \"the Great\" ?");
                a.setLabel("Louis XIV of France");
                b.setLabel("Napoleon I of France");
                c.setLabel("Simeon I of Bulgaria");
                d.setLabel("Frederick II of Prussia");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }
            case 21 -> {
                pickedQuestion = number;
                Question.setText("In what year was the Holy Roman Empire ended?");
                a.setLabel("1813");
                b.setLabel("1798");
                c.setLabel("1806");
                d.setLabel("1814");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 22 -> {
                pickedQuestion = number;
                Question.setText("Which country currently has the teritory of the former \"Great Old Bulgaria\"?");
                a.setLabel("Iran");
                b.setLabel("Hungary");
                c.setLabel("Turkey");
                d.setLabel("Ukraine");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 23 -> {
                pickedQuestion = number;
                Question.setText("After the fall of \"the Great Old Bulgaria \"in which place ,there was NOT settled Bulgarians ?");
                a.setLabel("Moesia");
                b.setLabel("The Volga River");
                c.setLabel("Macedonia");
                d.setLabel("Italy");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 24 -> {
                pickedQuestion = number;
                Question.setText("When was Austria-Hungary formed ?");
                a.setLabel("1914");
                b.setLabel("1867");
                c.setLabel("1848");
                d.setLabel("1935");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 25 -> {
                pickedQuestion = number;
                Question.setText("Which of this cities is not in the top ten biggest cities in Bulgaria based of population?");
                a.setLabel("Dobrich");
                b.setLabel("Ruse");
                c.setLabel("Sliven");
                d.setLabel("Yambol");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }
            case 26 -> {
                pickedQuestion = number;
                Question.setText("Which is the longest river in Europe?");
                a.setLabel("Volga");
                b.setLabel("Danube");
                c.setLabel("Rhine");
                d.setLabel("Elbe");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 27 -> {
                pickedQuestion = number;
                Question.setText("Who is the first ever Roman emperor?");
                a.setLabel("Julius Caesar");
                b.setLabel("Justinian I");
                c.setLabel("Octavian Augustus");
                d.setLabel("Mark Antony");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 28 -> {
                pickedQuestion = number;
                Question.setText("Which one of this wars is NOT a holy(religious) one?");
                a.setLabel("The Hussite Wars");
                b.setLabel("Thirty Years' War");
                c.setLabel("The Napoleonic Wars");
                d.setLabel("Schmalkaldic War");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 29 -> {
                pickedQuestion = number;
                Question.setText("In France`s history,how many monarchs have ruled with the name \"Louis\" ?");
                a.setLabel("10");
                b.setLabel("18");
                c.setLabel("14");
                d.setLabel("19");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 30 -> {
                pickedQuestion = number;
                Question.setText("Which country did not experience a revolution in 1848 ?");
                a.setLabel("Bulgaria");
                b.setLabel("Hungary");
                c.setLabel("France");
                d.setLabel("Germany");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }
            case 31 -> {
                pickedQuestion = number;
                Question.setText("Who is the longest reigning monarch ?");
                a.setLabel("Elizabeth II of United Kingdom");
                b.setLabel("Franz Joseph I of Austria");
                c.setLabel("Johann II of Liechtenstein");
                d.setLabel("Louis XIV of France");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 32 -> {
                pickedQuestion = number;
                Question.setText("How many Russo-Turkish wars are there?");
                a.setLabel("One");
                b.setLabel("Three");
                c.setLabel("Eight");
                d.setLabel("Ten");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 33 -> {
                pickedQuestion = number;
                Question.setText("Which Bulgarian ruler had the title  “the Romanslayer” ?");
                a.setLabel("Kaloyan");
                b.setLabel("Ivan Asen I");
                c.setLabel("Simeon");
                d.setLabel("Ivan Shishman");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 34 -> {
                pickedQuestion = number;
                Question.setText("Which is the biggest country of the Earth?");
                a.setLabel("USA");
                b.setLabel("Russia");
                c.setLabel("China");
                d.setLabel("Brazil");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }case 35 -> {
                pickedQuestion = number;
                Question.setText("Who was the shortest-ruling official president of Bulgaria?");
                a.setLabel("Stanko Todorov");
                b.setLabel("Todor Zhivkov");
                c.setLabel("Petar Mladenov");
                d.setLabel("Georgi Kulishev");
                usedQuestionsCount++;
                numberOfQuestion.setText(usedQuestionsCount + "\\15");
                usedQuestions[usedQuestionsCount] = number;
            }
        }
    }


    //does the question repeat
    public boolean SafeQuestion(int question){

        for (int usedQuestion : usedQuestions) {
            if (usedQuestion == question) return false;

        }

        return true;
    }

    public void AnswerA(ActionEvent a){

        boolean testFinished=false;

        switch (pickedQuestion) {
            case 1, 8, 11 ,17,18,23,26,30,33-> rightAnswers++;
        }
        if(usedQuestionsCount>=15){
            JFrame innerFrame=new JFrame();
            JOptionPane.showMessageDialog(innerFrame, "You have "+  rightAnswers +" out of "+usedQuestionsCount+" right answers!");



            testFinished=true;
            frame.dispose();
        }

        if(!testFinished) {
            int question = getRandomNumber(1, 35);

            if (!SafeQuestion(question)) {
                int tries = 0;
                while (!SafeQuestion(question)) {
                    if (tries >= 3) {
                        if (tries == 3) {
                            question = 1;
                        } else question++;
                    } else {
                        question = getRandomNumber(1, 35);
                    }
                    tries++;
                }
            }
            GetQuestion(question);
        }
    }
    public void AnswerB(ActionEvent b){
        boolean testFinished=false;
        switch (pickedQuestion) {
            case 3,6,13,14,20,24,29,34-> rightAnswers++;

        }
        if(usedQuestionsCount>=15){
            JFrame innerFrame=new JFrame();
            JOptionPane.showMessageDialog(innerFrame, "You have "+  rightAnswers +" out of "+usedQuestionsCount+" right answers!");

            testFinished=true;
            frame.dispose();
        }
        if(!testFinished) {
            int question = getRandomNumber(1, 35);

            if (!SafeQuestion(question)) {
                int tries = 0;
                while (!SafeQuestion(question)) {
                    if (tries >= 3) {
                        if (tries == 3) {
                            question = 1;
                        } else question++;

                    } else {
                        question = getRandomNumber(1, 35);

                    }
                    tries++;
                }
            }
            GetQuestion(question);
        }
    }
    public void AnswerC(ActionEvent c){
        boolean testFinished=false;
        switch (pickedQuestion) {
            case 2,7,10,15,16,21,27,28,35 -> rightAnswers++;
        }
        if(usedQuestionsCount>=15){
            JFrame innerFrame=new JFrame();
            JOptionPane.showMessageDialog(innerFrame, "You have "+  rightAnswers +" out of "+usedQuestionsCount+" right answers!");


            testFinished=true;
            frame.dispose();

        }

        if(!testFinished) {
            int question = getRandomNumber(1, 35);


            if (!SafeQuestion(question)) {
                int tries = 0;
                while (!SafeQuestion(question)) {
                    if (tries >= 3) {
                        if (tries == 3) {
                            question = 1;
                        } else question++;

                    } else {
                        question = getRandomNumber(1, 35);

                    }
                    tries++;
                }
            }
            GetQuestion(question);
        }

    }
    public void AnswerD(ActionEvent d){
        boolean testFinished=false;
        switch (pickedQuestion) {
            case 4, 5,9,12,19,22,25,31,32-> rightAnswers++;
        }
        if(usedQuestionsCount>=15){
            JFrame innerFrame=new JFrame();
            JOptionPane.showMessageDialog(innerFrame, "You have "+  rightAnswers +" out of "+usedQuestionsCount+" right answers!");

            testFinished=true;
            frame.dispose();
        }
        if(!testFinished) {
            int question = getRandomNumber(1, 35);

            if (!SafeQuestion(question)) {
                int tries = 0;
                while (!SafeQuestion(question)) {
                    if (tries >= 3) {
                        if (tries == 3) {
                            question = 1;
                        } else question++;

                    } else {
                        question = getRandomNumber(1, 35);
                    }
                    tries++;
                }
            }
            GetQuestion(question);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        rightAnswers = 0;
        usedQuestionsCount = 0;
        Arrays.fill(usedQuestions, 0);

        //Question chosen
        int question=getRandomNumber(1,35);
        if(SafeQuestion(question)) {
            GetQuestion(question);
        }

        frame.setVisible(true);
        JOptionPane.showMessageDialog(frame, "Good Luck! Don`t Cheat!");


    }


}
