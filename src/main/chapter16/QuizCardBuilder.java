import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;


public class QuizCardBuilder {

    private ArrayList<QuizCard> cardList = new ArrayList<>();
    private JTextArea question;
    private JTextArea answer;
    private JFrame frame;

    public static void main(String[] args) {
         
         new QuizCardBuilder().go();
    }

    public void go() {

        // build and display the gui
        frame = new JFrame("Quiz Card Builder");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sansserif", Font.BOLD, 24);

        // Create text area for question and create a scroller for it
        question = createTextArea(bigFont);
        JScrollPane qScroller = createScroller(question);

        // Create text are fir answer and create a scroller for it
        answer = createTextArea(bigFont);
        JScrollPane aScroller = createScroller(answer);

        // Add question and answer scrollers to the panel
        mainPanel.add(new JLabel("Question: "));
        mainPanel.add(qScroller);
        mainPanel.add(new Jlabel("Answer: "));
        mainPanel.add(aScroller);

        // Craete a button, add actionListener on it and add it to the panel
        JButton nextButton = new JButton("Next Card");
        nextButton.addActionListener(e -> nextCard());
        mainPanell.add(nextButton);

        // Add Menu bar on the frame
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(e -> clearAll());

        JMenuItem saveMenuItem = new JMenuItem("Save");
        newMenuItem.addActionListener(e -> saveCard());

        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500, 600);
        frame.setVisible(true);
    }


    private JScrollPane createScroller(JTextArea textArea) {

        JScrollPane scroller = new JScrollPane(textArea);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        return scroller;
    }

    private JTextArea createTextArea(Font font) {
        
       JTextArea textArea = new JTextArea(6, 20);
       textArea.setLineWrap(true);
       textArea.setWrapStyleWord(true);
       textArea.setFont(font);
       return textArea;
    }

    private void nextCard() {

        // add the current card to the list
        // and clear the text areas
        QuizCard card = new QuizCard(question.getText(), answer.getText());
        cardList.add(card);
        clearCard();
    }

    private void saveCard() {
       
        // bring up a file dialog box
        // let the user name and save the set
        QuizCard card = new QuizCard(question.getText(), answer.getText());
        cardList.add(card);

        // Brings up a file dialog box 
        JFileChooser fileSave = new JFileChooser();
        fileSave.showSaveDialog();
        saveFile(fileSave.getSelectedFile());
    }

    private void clearAll() {

        // Clear cardlist and the text areas
        cardList.clear();
        clearCard();
    }

    private void clearCard() {

        // clear out the text areas
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }

    private void saveFile(File file) {

        // iterate through the list of cards and write
        // each one out to a text file in a parseable way
        // (in other words, with clear separations between parts)
        try {
            BufferWriter writer = new BufferWriter(new FileWriter(file));
            for (QuizCard card : cardList) {
                writer.write(card.getQuestion() + "/");
                writer.write(card.getAnswer() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Could not write the cardList out: " + e.getMessage());
        }
    }
}


